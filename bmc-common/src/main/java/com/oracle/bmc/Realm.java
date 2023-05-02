/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.util.internal.NameUtils;
import jakarta.annotation.Nonnull;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Class containing all Identity realms.
 *
 * <p>Accounts (tenancies) are per Realm.
 */
public final class Realm implements Serializable, Comparable<Realm> {
    // LinkedHashMap to ensure stable ordering of registered realms
    private static final Map<String, Realm> KNOWN_REALMS = new LinkedHashMap<>();
    public static final Realm OC1 = new Realm("oc1", "oraclecloud.com");
    public static final Realm OC2 = new Realm("oc2", "oraclegovcloud.com");
    public static final Realm OC3 = new Realm("oc3", "oraclegovcloud.com");
    public static final Realm OC4 = new Realm("oc4", "oraclegovcloud.uk");
    public static final Realm OC8 = new Realm("oc8", "oraclecloud8.com");
    public static final Realm OC9 = new Realm("oc9", "oraclecloud9.com");
    public static final Realm OC10 = new Realm("oc10", "oraclecloud10.com");
    public static final Realm OC14 = new Realm("oc14", "oraclecloud14.com");
    public static final Realm OC20 = new Realm("oc20", "oraclecloud20.com");
    private static final long serialVersionUID = -905344971L;
    /** The id of the realm. */
    private final String realmId;
    /** The second level domain of the realm. */
    private final String secondLevelDomain;

    private Realm(@Nonnull String realmId, @Nonnull String secondLevelDomain) {
        if (realmId == null) {
            throw new java.lang.NullPointerException("realmId is marked non-null but is null");
        }
        if (secondLevelDomain == null) {
            throw new java.lang.NullPointerException(
                    "secondLevelDomain is marked non-null but is null");
        }
        this.realmId = realmId;
        this.secondLevelDomain = secondLevelDomain;
        synchronized (KNOWN_REALMS) {
            // The field name is named after the regionId, but follows enum naming convention.
            // For backwards compatibility, we keep track of the enum-named field.
            KNOWN_REALMS.put(NameUtils.canonicalizeForEnumTypes(realmId), this);
        }
    }

    /**
     * Compares to realms lexicographically based on their realmId.
     *
     * @param other The Realm to be compared.
     * @return the value {@code 0} if the realmId of the compared Realm is equal to the realmId of
     *     this Realm; a value less than {@code 0} if the realmId of this Realm is lexicographically
     *     less than the realmId of the compared Realm; and a value greater than {@code 0} if the
     *     realmId of this Realm is lexicographically greater than the realmId of the compared
     *     Realm.
     */
    public int compareTo(Realm other) {
        return realmId.compareTo(other.realmId);
    }

    // For backward compatibility maintain the enum toString behavior
    @Override
    public String toString() {
        return NameUtils.canonicalizeForEnumTypes(getRealmId());
    }

    /**
     * All known Realms in this version of the SDK
     *
     * @return Known realms
     */
    public static Realm[] values() {
        synchronized (KNOWN_REALMS) {
            return KNOWN_REALMS.values().toArray(new Realm[0]);
        }
    }

    /**
     * Returns the Realm object matching the specified name. The name must match exactly.
     * (Extraneous whitespace characters are not permitted.)
     *
     * @param name The name of the realm
     * @return The Realm object matching the specified name, if available.
     * @throws IllegalArgumentException if no realm exists with the specified name
     */
    public static Realm valueOf(@Nonnull String name) throws IllegalArgumentException {
        if (name == null) {
            throw new java.lang.NullPointerException("name is marked non-null but is null");
        }
        final Realm realm;
        synchronized (KNOWN_REALMS) {
            realm = KNOWN_REALMS.get(name);
        }
        if (realm == null) {
            throw new IllegalArgumentException("Unknown realm " + name);
        }
        return realm;
    }

    /**
     * Register a new Realm. Used to allow the SDK to be forward compatible with unreleased realms.
     *
     * @param realmId The realm id.
     * @param secondLevelDomain The second level domain of the realm.
     * @return The registered Realm (or existing one if found).
     */
    public static Realm register(@Nonnull String realmId, @Nonnull String secondLevelDomain) {
        if (realmId == null) {
            throw new java.lang.NullPointerException("realmId is marked non-null but is null");
        }
        if (secondLevelDomain == null) {
            throw new java.lang.NullPointerException(
                    "secondLevelDomain is marked non-null but is null");
        }
        realmId = realmId.toLowerCase(Locale.US);
        secondLevelDomain = secondLevelDomain.toLowerCase(Locale.US);
        synchronized (KNOWN_REALMS) {
            for (Realm realm : Realm.values()) {
                if (realm.realmId.equals(realmId)) {
                    if (!realm.secondLevelDomain.equals(secondLevelDomain)) {
                        throw new IllegalArgumentException(
                                "RealmId : "
                                        + realmId
                                        + " is already registered with "
                                        + realm.getSecondLevelDomain()
                                        + ". It cannot be re-registered with a different secondLevelDomain");
                    }
                    return realm;
                }
            }
            return new Realm(realmId, secondLevelDomain);
        }
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Realm)) return false;
        final Realm other = (Realm) o;
        final Object this$realmId = this.realmId;
        final Object other$realmId = other.realmId;
        if (this$realmId == null ? other$realmId != null : !this$realmId.equals(other$realmId))
            return false;
        final Object this$secondLevelDomain = this.secondLevelDomain;
        final Object other$secondLevelDomain = other.secondLevelDomain;
        if (this$secondLevelDomain == null
                ? other$secondLevelDomain != null
                : !this$secondLevelDomain.equals(other$secondLevelDomain)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $realmId = this.realmId;
        result = result * PRIME + ($realmId == null ? 43 : $realmId.hashCode());
        final Object $secondLevelDomain = this.secondLevelDomain;
        result = result * PRIME + ($secondLevelDomain == null ? 43 : $secondLevelDomain.hashCode());
        return result;
    }

    public String getRealmId() {
        return this.realmId;
    }

    public String getSecondLevelDomain() {
        return this.secondLevelDomain;
    }
}
