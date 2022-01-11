/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An object defining the OCID of the Secret held in Vault that represent the MACsec key.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateMacsecKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateMacsecKey {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretId")
        private String connectivityAssociationNameSecretId;

        public Builder connectivityAssociationNameSecretId(
                String connectivityAssociationNameSecretId) {
            this.connectivityAssociationNameSecretId = connectivityAssociationNameSecretId;
            this.__explicitlySet__.add("connectivityAssociationNameSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretVersion")
        private Long connectivityAssociationNameSecretVersion;

        public Builder connectivityAssociationNameSecretVersion(
                Long connectivityAssociationNameSecretVersion) {
            this.connectivityAssociationNameSecretVersion =
                    connectivityAssociationNameSecretVersion;
            this.__explicitlySet__.add("connectivityAssociationNameSecretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretId")
        private String connectivityAssociationKeySecretId;

        public Builder connectivityAssociationKeySecretId(
                String connectivityAssociationKeySecretId) {
            this.connectivityAssociationKeySecretId = connectivityAssociationKeySecretId;
            this.__explicitlySet__.add("connectivityAssociationKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretVersion")
        private Long connectivityAssociationKeySecretVersion;

        public Builder connectivityAssociationKeySecretVersion(
                Long connectivityAssociationKeySecretVersion) {
            this.connectivityAssociationKeySecretVersion = connectivityAssociationKeySecretVersion;
            this.__explicitlySet__.add("connectivityAssociationKeySecretVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMacsecKey build() {
            UpdateMacsecKey __instance__ =
                    new UpdateMacsecKey(
                            connectivityAssociationNameSecretId,
                            connectivityAssociationNameSecretVersion,
                            connectivityAssociationKeySecretId,
                            connectivityAssociationKeySecretVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMacsecKey o) {
            Builder copiedBuilder =
                    connectivityAssociationNameSecretId(o.getConnectivityAssociationNameSecretId())
                            .connectivityAssociationNameSecretVersion(
                                    o.getConnectivityAssociationNameSecretVersion())
                            .connectivityAssociationKeySecretId(
                                    o.getConnectivityAssociationKeySecretId())
                            .connectivityAssociationKeySecretVersion(
                                    o.getConnectivityAssociationKeySecretVersion());

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
     * Secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key Name (CKN) of this MACsec key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretId")
    String connectivityAssociationNameSecretId;

    /**
     * The secret version of the connectivity association name secret in Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretVersion")
    Long connectivityAssociationNameSecretVersion;

    /**
     * Secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key (CAK) of this MACsec key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretId")
    String connectivityAssociationKeySecretId;

    /**
     * The secret version of the connectivityAssociationKey secret in Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretVersion")
    Long connectivityAssociationKeySecretVersion;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
