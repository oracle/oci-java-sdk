/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines the secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s held in Vault that represent the MACsec key.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateMacsecKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateMacsecKey {
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

        @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretId")
        private String connectivityAssociationKeySecretId;

        public Builder connectivityAssociationKeySecretId(
                String connectivityAssociationKeySecretId) {
            this.connectivityAssociationKeySecretId = connectivityAssociationKeySecretId;
            this.__explicitlySet__.add("connectivityAssociationKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMacsecKey build() {
            CreateMacsecKey __instance__ =
                    new CreateMacsecKey(
                            connectivityAssociationNameSecretId,
                            connectivityAssociationKeySecretId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMacsecKey o) {
            Builder copiedBuilder =
                    connectivityAssociationNameSecretId(o.getConnectivityAssociationNameSecretId())
                            .connectivityAssociationKeySecretId(
                                    o.getConnectivityAssociationKeySecretId());

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
     * Secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity association Key Name (CKN) of this MACsec key.
     * <p>
     * NOTE: Only the latest secret version will be used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationNameSecretId")
    String connectivityAssociationNameSecretId;

    /**
     * Secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) containing the Connectivity Association Key (CAK) of this MACsec key.
     * <p>
     * NOTE: Only the latest secret version will be used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectivityAssociationKeySecretId")
    String connectivityAssociationKeySecretId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
