/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for cloning a pluggable database to the same CDB.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LocalClonePluggableDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LocalClonePluggableDatabaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("clonedPdbName")
        private String clonedPdbName;

        public Builder clonedPdbName(String clonedPdbName) {
            this.clonedPdbName = clonedPdbName;
            this.__explicitlySet__.add("clonedPdbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
        private String pdbAdminPassword;

        public Builder pdbAdminPassword(String pdbAdminPassword) {
            this.pdbAdminPassword = pdbAdminPassword;
            this.__explicitlySet__.add("pdbAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetTdeWalletPassword")
        private String targetTdeWalletPassword;

        public Builder targetTdeWalletPassword(String targetTdeWalletPassword) {
            this.targetTdeWalletPassword = targetTdeWalletPassword;
            this.__explicitlySet__.add("targetTdeWalletPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LocalClonePluggableDatabaseDetails build() {
            LocalClonePluggableDatabaseDetails __instance__ =
                    new LocalClonePluggableDatabaseDetails(
                            clonedPdbName, pdbAdminPassword, targetTdeWalletPassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LocalClonePluggableDatabaseDetails o) {
            Builder copiedBuilder =
                    clonedPdbName(o.getClonedPdbName())
                            .pdbAdminPassword(o.getPdbAdminPassword())
                            .targetTdeWalletPassword(o.getTargetTdeWalletPassword());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name for the pluggable database. The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clonedPdbName")
    String clonedPdbName;

    /**
     * A strong password for PDB Admin of the newly cloned PDB. The password must be at least nine characters and contain at least two uppercase, two lowercase, two numbers, and two special characters. The special characters must be _, \\#, or -.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
    String pdbAdminPassword;

    /**
     * The existing TDE wallet password of the target CDB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetTdeWalletPassword")
    String targetTdeWalletPassword;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
