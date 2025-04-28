/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.internal.Alloy;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.util.internal.NameUtils;
import jakarta.annotation.Nonnull;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Class containing all Identity realms.
 *
 * <p>Accounts (tenancies) are per Realm.
 */
public final class Realm implements Serializable, Comparable<Realm> {
    // LinkedHashMap to ensure stable ordering of registered realms
    private static final Map<String, Realm> KNOWN_REALMS = new LinkedHashMap<>();
    private static final Map<String, Realm> ALLOY_REALMS = new LinkedHashMap<>();
    private static final Map<String, Realm> ALL_REALMS = new LinkedHashMap<>();

    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static final Lock readLock = lock.readLock();
    private static final Lock writeLock = lock.writeLock();

    public static final Realm OC1 = new Realm("oc1", "oraclecloud.com");
    public static final Realm OC2 = new Realm("oc2", "oraclegovcloud.com");
    public static final Realm OC3 = new Realm("oc3", "oraclegovcloud.com");
    public static final Realm OC4 = new Realm("oc4", "oraclegovcloud.uk");
    public static final Realm OC8 = new Realm("oc8", "oraclecloud8.com");
    public static final Realm OC9 = new Realm("oc9", "oraclecloud9.com");
    public static final Realm OC10 = new Realm("oc10", "oraclecloud10.com");
    public static final Realm OC14 = new Realm("oc14", "oraclecloud14.com");
    public static final Realm OC20 = new Realm("oc20", "oraclecloud20.com");
    public static final Realm OC19 = new Realm("oc19", "oraclecloud.eu");
    public static final Realm OC24 = new Realm("oc24", "oraclecloud24.com");
    public static final Realm OC21 = new Realm("oc21", "oraclecloud21.com");
    public static final Realm OC26 = new Realm("oc26", "oraclecloud26.com");
    public static final Realm OC15 = new Realm("oc15", "oraclecloud15.com");
    public static final Realm OC29 = new Realm("oc29", "oraclecloud29.com");
    public static final Realm OC23 = new Realm("oc23", "oraclecloud23.com");
    public static final Realm OC35 = new Realm("oc35", "oraclecloud35.com");
    private static final long serialVersionUID = -905344971L;
    /** The id of the realm. */
    private final String realmId;
    /** The second level domain of the realm. */
    private final String secondLevelDomain;

    private Realm(@Nonnull String realmId, @Nonnull String secondLevelDomain) {
        this(realmId, secondLevelDomain, false);
    }

    private Realm(
            @Nonnull String realmId, @Nonnull String secondLevelDomain, boolean isAlloyRealm) {
        if (realmId == null) {
            throw new java.lang.NullPointerException("realmId is marked non-null but is null");
        }
        if (secondLevelDomain == null) {
            throw new java.lang.NullPointerException(
                    "secondLevelDomain is marked non-null but is null");
        }
        this.realmId = realmId;
        this.secondLevelDomain = secondLevelDomain;
        writeLock.lock();
        try {
            // The field name is named after the regionId, but follows enum naming convention.
            // For backwards compatibility, we keep track of the enum-named field.
            if (isAlloyRealm) {
                ALLOY_REALMS.put(NameUtils.canonicalizeForEnumTypes(realmId), this);
            } else {
                KNOWN_REALMS.put(NameUtils.canonicalizeForEnumTypes(realmId), this);
            }
            ALL_REALMS.put(NameUtils.canonicalizeForEnumTypes(realmId), this);
        } finally {
            writeLock.unlock();
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
        readLock.lock();
        try {
            if (Alloy.doesAlloyConfigExist()) {
                if (Alloy.shouldUseOnlyAlloyRegions()) {
                    return ALLOY_REALMS.values().toArray(new Realm[ALLOY_REALMS.size()]);
                }
                return ALL_REALMS.values().toArray(new Realm[ALL_REALMS.size()]);
            }
            return KNOWN_REALMS.values().toArray(new Realm[KNOWN_REALMS.size()]);
        } finally {
            readLock.unlock();
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
        readLock.lock();
        try {
            Optional<Realm> maybeRealm;
            if (Alloy.doesAlloyConfigExist()) {
                maybeRealm = Optional.ofNullable(ALLOY_REALMS.get(name));
                if (maybeRealm.isPresent()) {
                    return maybeRealm.get();
                } else if (!Alloy.isAlloyRegionCoexistEnabled()) {
                    throw new IllegalArgumentException("Unknown realm " + name);
                }
            }
            maybeRealm = Optional.ofNullable(KNOWN_REALMS.get(name));
            if (!maybeRealm.isPresent()) {
                throw new IllegalArgumentException("Unknown realm " + name);
            }
            return maybeRealm.get();
        } finally {
            readLock.unlock();
        }
    }

    /**
     * Register a new Realm. Used to allow the SDK to be forward compatible with unreleased realms.
     *
     * @param realmId The realm id.
     * @param secondLevelDomain The second level domain of the realm.
     * @return The registered Realm (or existing one if found).
     */
    public static Realm register(@Nonnull String realmId, @Nonnull String secondLevelDomain) {
        return register(realmId, secondLevelDomain, false);
    }

    /**
     * Register a new Realm. Used to allow the SDK to be forward compatible with unreleased realms.
     *
     * @param realmId The realm id.
     * @param secondLevelDomain The second level domain of the realm.
     * @param isAlloyRealm 'true' if realm is from alloy configuration.
     * @return The registered Realm (or existing one if found).
     */
    public static Realm register(
            @Nonnull String realmId, @Nonnull String secondLevelDomain, boolean isAlloyRealm) {
        if (realmId == null) {
            throw new java.lang.NullPointerException("realmId is marked non-null but is null");
        }
        if (secondLevelDomain == null) {
            throw new java.lang.NullPointerException(
                    "secondLevelDomain is marked non-null but is null");
        }
        realmId = realmId.toLowerCase(Locale.US);
        secondLevelDomain = secondLevelDomain.toLowerCase(Locale.US);
        writeLock.lock();
        try {
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
            return new Realm(realmId, secondLevelDomain, isAlloyRealm);
        } finally {
            writeLock.unlock();
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

    @InternalSdk
    @VisibleForTesting
    protected static void clearAlloyRealms() {

        writeLock.lock();
        try {
            ALL_REALMS
                    .keySet()
                    .removeIf(
                            key ->
                                    (ALLOY_REALMS.containsKey(key)
                                            && !KNOWN_REALMS.containsKey(key)));
            ALLOY_REALMS.clear();
        } finally {
            writeLock.unlock();
        }
    }
}
