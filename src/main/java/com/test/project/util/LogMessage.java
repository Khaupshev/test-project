package com.test.project.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The enum Log message.
 */
@Getter
@RequiredArgsConstructor
public enum LogMessage {

    /**
     * The User has been saved.
     */
    USER_HAS_BEEN_SAVED("User has been saved"),
    /**
     * The User has been deleted.
     */
    USER_HAS_BEEN_DELETED("User has been deleted"),
    /**
     * The User has been updated.
     */
    USER_HAS_BEEN_UPDATED("User has been updated");

    private final String message;
}
