/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.http.ClientConfigurator;

import java.util.List;

/**
 * Interface defining AuthenticationDetailsProvider that
 * also returns PEM file path and a list of ClientConfigurators
 */
public interface BasicConfigFileAuthenticationProvider extends AuthenticationDetailsProvider {
    /**
     * Get the PEM file path
     * @return The path to the PEM file
     */
    String getPemFilePath();

    /**
     * Get the list of ClientConfigurators
     * @return a list of ClientConfigurators
     */
    List<ClientConfigurator> getClientConfigurators();
}
