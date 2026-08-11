/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Details for creating a distributed database shard. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source",
        defaultImpl = CreateDistributedDatabaseShardDatabaseDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardWithExadbXsNewClusterDetails.class,
            name = "XS_NEW_CLUSTER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardWithExadbXsNewVaultAndClusterDetails.class,
            name = "XS_NEW_VAULT_AND_CLUSTER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardDatabaseWithExadbXsDetails.class,
            name = "XS_EXISTING_CLUSTER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardDatabaseWithDbHomeDetails.class,
            name = "EXISTING_DB_HOME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDistributedDatabaseShardDatabaseWithExadbXdDetails.class,
            name = "XD_EXISTING_CLUSTER")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateDistributedDatabaseShardDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected CreateDistributedDatabaseShardDatabaseDetails() {
        super();
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDistributedDatabaseShardDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDistributedDatabaseShardDatabaseDetails)) {
            return false;
        }

        CreateDistributedDatabaseShardDatabaseDetails other =
                (CreateDistributedDatabaseShardDatabaseDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The source of the Globally distributed database type. Use XS_EXISTING_CLUSTER for a database
     * on Exascale Infrastructure that uses a pre-existing cluster. Use XS_NEW_CLUSTER for a
     * database on Exascale Infrastructure that requires a new cluster created from scratch. Use
     * XS_NEW_VAULT_AND_CLUSTER for a database on Exascale Infrastructure that requires a new vault
     * and cluster created from scratch. Use XD_EXISTING_CLUSTER for a database on Dedicated
     * Infrastructure that uses a pre-existing cluster. Use EXISTING_DB_HOME for a database on a
     * pre-existing database home.
     */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        XsExistingCluster("XS_EXISTING_CLUSTER"),
        XsNewCluster("XS_NEW_CLUSTER"),
        XsNewVaultAndCluster("XS_NEW_VAULT_AND_CLUSTER"),
        XdExistingCluster("XD_EXISTING_CLUSTER"),
        ExistingDbHome("EXISTING_DB_HOME"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
}
