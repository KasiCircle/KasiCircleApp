package com.kasicircle.backend.users.entity;

/**
 * Defines the user roles within the KasiCircle application.
 * Roles are used by Spring Security to handle authorization.
 */
public enum Role {
    /**
     * A standard user with basic permissions.
     * Can browse content, interact with features available to the general public.
     */
    USER,

    /**
     * An administrator with full access to the system.
     * Can manage users, content, and system settings.
     */
    ADMIN
}
