package com.test.project.service.impl;

import com.test.project.dto.UserDto;
import com.test.project.mapper.UserMapper;
import com.test.project.model.User;
import com.test.project.repository.UserRepository;
import com.test.project.service.MessageSourceHelper;
import com.test.project.service.UserService;
import com.test.project.util.LogMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * The type User service.
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    private final MessageSourceHelper messageSourceHelper;

    @Override
    @Transactional
    public ResponseEntity<?> getUser(Long id) {
        return userRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Override
    @Transactional
    public ResponseEntity<?> getAllUsers() {
        var users = userRepository.findAll();
        return userRepository.findAll().isEmpty()
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(users);
    }

    @Override
    @Transactional
    public User create(UserDto userDto) {
        var user = userMapper.map(userDto);
        var saved = userRepository.save(user);
        var msg = messageSourceHelper.getMessage(LogMessage.USER_HAS_BEEN_SAVED, saved);
        log.info(msg);
        return saved;
    }

    @Override
    @Transactional
    public void update(UserDto userDto, Long id) {
        userRepository.findById(id)
                .ifPresent(user -> userRepository.save( userMapper.map(userDto, user)));
    }

    @Override
    @Transactional
    public ResponseEntity<?> delete(Long id) {
        userRepository.findById(id)
                .map(user -> {
                    userRepository.deleteById(id);
                    var msg = messageSourceHelper.getMessage(LogMessage.USER_HAS_BEEN_DELETED, user);
                    log.info(msg);
                    return ResponseEntity.ok(user);
                });
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(id);
    }

}
