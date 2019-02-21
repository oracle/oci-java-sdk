/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

public class RealmTest {
    private static final Map<String, String> EXPECTED_REALMS =
            new ImmutableMap.Builder<String, String>()
                    .put("OC1", "oc1")
                    .put("OC2", "oc2")
                    .put("OC3", "oc3")
                    .build();

    // Note: This test will fail if the Realm Enum is updated without updating this test.  This is intentional.
    @Test
    public void withExpectedRealms_shouldNotContainUnexpectedValues() {
        final Set<Realm> actualRealms = new HashSet<>(Arrays.asList(Realm.values()));
        for (String name : EXPECTED_REALMS.keySet()) {
            actualRealms.remove(Realm.valueOf(name));
        }

        assertTrue(
                "Found unexpected realm definitions: " + actualRealms.toString(),
                actualRealms.isEmpty());
    }

    @Test
    public void withExpectedRealms_shouldContainAllValues() {
        for (Entry<String, String> expectedRealm : EXPECTED_REALMS.entrySet()) {
            final Realm actualRealm = Realm.valueOf(expectedRealm.getKey());
            assertEquals(
                    "RealmId should be equal", expectedRealm.getValue(), actualRealm.getRealmId());
        }
    }

    @Test
    public void noDuplicateRealmId() {
        final Set<String> realmIds = new HashSet<>();
        for (Realm realm : Realm.values()) {
            assertFalse(realmIds.contains(realm.getRealmId()));
            realmIds.add(realm.getRealmId());
        }
    }
}
