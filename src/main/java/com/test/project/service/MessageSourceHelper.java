package com.test.project.service;

import com.test.project.util.LogMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * The type Message source helper.
 */
@Service
@RequiredArgsConstructor
public class MessageSourceHelper {

    private final MessageSource messageSource;

    /**
     * Gets message.
     *
     * @param message
     *         message template
     * @param placeholders
     *         args
     *
     * @return message
     */
    public String getMessage(LogMessage message, Object... placeholders) {
        return messageSource.getMessage(
                message.name().toLowerCase(),
                placeholders,
                message.getMessage(),
                Locale.getDefault()
        );
    }

}
