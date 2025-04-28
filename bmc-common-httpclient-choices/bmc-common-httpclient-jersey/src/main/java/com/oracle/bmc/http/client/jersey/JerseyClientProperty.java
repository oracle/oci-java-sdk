/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.jersey;

import com.oracle.bmc.http.client.ClientProperty;

public final class JerseyClientProperty<T> extends ClientProperty<T> {
    final String jerseyProperty;

    private JerseyClientProperty(String name, String jerseyProperty) {
        super(name);
        this.jerseyProperty = jerseyProperty;
    }

    public static <T> JerseyClientProperty<T> create(String jerseyProperty) {
        return new JerseyClientProperty<>("jersey: " + jerseyProperty, jerseyProperty);
    }
}
