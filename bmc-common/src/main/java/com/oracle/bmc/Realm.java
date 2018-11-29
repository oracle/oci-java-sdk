/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enumeration of all Identity realms.
 * <p>
 * Accounts (tenancies) are per Realm.
 */
@RequiredArgsConstructor
public enum Realm {
    OC1("oc1");

    @Getter
    /**
     * The id of the realm.
     */
    private final String realmId;
}
