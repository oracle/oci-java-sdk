/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

import com.oracle.bmc.helper.EnvironmentVariablesHelper;
import com.oracle.bmc.model.RegionSchema;
import com.oracle.bmc.model.internal.JsonConverter;
import com.oracle.bmc.util.internal.NameUtils;
import org.junit.Before;
import org.junit.Test;

public class RealmTest {
    private static final String NEW_SECOND_LEVEL_DOMAIN = "oracle-foo-cloud.com";

    @Before
    public void setup() throws Exception {

        Map<String, String> newEnvMap = new HashMap<>();

        String regionBlob =
                "{ \"realmKey\" : \"UCX\",\"realmDomainComponent\" : \"oracle-foobar.com\",\"regionKey\" : \"ABV\",\"regionIdentifier\" : \"us-abv-1\"}";
        newEnvMap.put("OCI_REGION_METADATA", regionBlob);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
    }

    @Test
    public void testAllRealms() {
        try {
            File file = new File("src/test/resources/regions.json");
            assertTrue("File regions.json not found.", file.isFile());

            String content =
                    new String(
                            Files.readAllBytes(Paths.get("src/test/resources/regions.json")),
                            StandardCharsets.UTF_8);
            assertFalse("Failed to read contents from regions.json.", content.isEmpty());

            RegionSchema[] regionSchemas =
                    JsonConverter.jsonBlobToObject(content, RegionSchema[].class);
            assertTrue(
                    "Failed to read regionSchemas.",
                    regionSchemas != null && regionSchemas.length != 0);

            ArrayList<String> realmIds = new ArrayList<String>();
            for (Realm r : Realm.values()) {
                realmIds.add(r.getRealmId().toLowerCase());
            }
            for (RegionSchema regionSchema : regionSchemas) {
                assertTrue(
                        "Found invalid region schema.",
                        regionSchema != null && RegionSchema.isValid(regionSchema));
                assertTrue(
                        String.format("Realm %s not registered.", regionSchema.getRealmKey()),
                        realmIds.contains(regionSchema.getRealmKey().toLowerCase()));
            }
        } catch (Exception e) {
            e.printStackTrace();
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

    @Test
    public void valueOfKnownRealmName() {
        Realm testRealm = Realm.valueOf("OC1");
        assertEquals(Realm.OC1, testRealm);
        assertSame(Realm.OC1, testRealm);
    }

    @Test(expected = IllegalArgumentException.class)
    public void valueOfUnknownRealmName() {
        Realm.valueOf("foobar");
    }

    @Test
    public void registerKnownRealm() {
        int realmCount = Realm.values().length;
        final Realm existingRealm =
                Realm.register(Realm.OC1.getRealmId(), Realm.OC1.getSecondLevelDomain());

        assertSame(Realm.OC1, existingRealm);
        assertEquals(Realm.OC1.getRealmId(), existingRealm.getRealmId());
        assertEquals(Realm.OC1.getSecondLevelDomain(), existingRealm.getSecondLevelDomain());
        assertEquals(realmCount, Realm.values().length);
        assertSame(
                existingRealm,
                Realm.valueOf(NameUtils.canonicalizeForEnumTypes(Realm.OC1.getRealmId())));
        assertSame(
                existingRealm,
                Realm.register(Realm.OC1.getRealmId(), Realm.OC1.getSecondLevelDomain()));
        assertEquals(realmCount, Realm.values().length);
    }

    @Test
    public void registerNewRealm() {
        final String newRealmId = "foo";
        int realmCount = Realm.values().length;
        final Realm newRealm = Realm.register(newRealmId, NEW_SECOND_LEVEL_DOMAIN);

        assertEquals(newRealmId, newRealm.getRealmId());
        assertEquals(NEW_SECOND_LEVEL_DOMAIN, newRealm.getSecondLevelDomain());
        assertEquals(realmCount + 1, Realm.values().length);
        assertSame(newRealm, Realm.valueOf(NameUtils.canonicalizeForEnumTypes(newRealmId)));
        assertSame(newRealm, Realm.register(newRealmId, NEW_SECOND_LEVEL_DOMAIN));
        assertEquals(realmCount + 1, Realm.values().length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void existingRealmsAreImmutable() {
        Realm.register(Realm.OC1.getRealmId(), NEW_SECOND_LEVEL_DOMAIN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void newRealmsAreImmutable() {
        final String newRealmId = "foo1";
        Realm.register(newRealmId, NEW_SECOND_LEVEL_DOMAIN);
        Realm.register(newRealmId, Realm.OC1.getSecondLevelDomain());
    }

    @Test
    // Check that the realm names follow enum naming convention (if the realmId is oc1, then the
    // name of the realm
    // object should be OC1). This allows for forward compatibility when registering new realms.
    public void knownRealmsFollowNamingGuidelines() throws IllegalAccessException {
        final Field[] declaredFields = Realm.class.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getType() == Realm.class
                    && Modifier.isStatic(field.getModifiers())
                    && Modifier.isPublic(field.getModifiers())) {
                final Realm realm = (Realm) field.get(null);
                assertEquals(
                        field.getName(), NameUtils.canonicalizeForEnumTypes(realm.getRealmId()));
            }
        }
    }

    @Test
    public void stableOrderingOfRealmValues() {
        final List<Realm> realmList = new ArrayList<>(Arrays.asList(Realm.values()));
        assertEquals(realmList, Arrays.asList(Realm.values()));

        // Register realm ocx
        realmList.add(Realm.register("ocx", "ocx.com"));
        assertEquals(realmList, Arrays.asList(Realm.values()));

        // Register realm ocy
        realmList.add(Realm.register("ocy", "ocy.com"));
        assertEquals(realmList, Arrays.asList(Realm.values()));

        // Register realm ocz
        realmList.add(Realm.register("ocz", "ocz.com"));
        assertEquals(realmList, Arrays.asList(Realm.values()));
    }
}
