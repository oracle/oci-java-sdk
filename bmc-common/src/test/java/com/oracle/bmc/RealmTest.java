/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import static org.junit.Assert.assertFalse;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class RealmTest {
    @Test
    public void noDuplicateRealmId() {
        Set<String> realmIds = new HashSet<>();
        for (Realm realm : Realm.values()) {
            assertFalse(realmIds.contains(realm.getRealmId()));
            realmIds.add(realm.getRealmId());
        }
    }
}
