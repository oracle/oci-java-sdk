/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the identity connector <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IdentityConnectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityConnectorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "cloudProvider"})
    public IdentityConnectorDetails(String id, CloudProvider cloudProvider) {
        super();
        this.id = id;
        this.cloudProvider = cloudProvider;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the identity connector */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the identity connector
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Cloud provider */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudProvider")
        private CloudProvider cloudProvider;

        /**
         * Cloud provider
         *
         * @param cloudProvider the value to set
         * @return this builder
         */
        public Builder cloudProvider(CloudProvider cloudProvider) {
            this.cloudProvider = cloudProvider;
            this.__explicitlySet__.add("cloudProvider");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityConnectorDetails build() {
            IdentityConnectorDetails model =
                    new IdentityConnectorDetails(this.id, this.cloudProvider);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityConnectorDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("cloudProvider")) {
                this.cloudProvider(model.getCloudProvider());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the identity connector */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the identity connector
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Cloud provider */
    public enum CloudProvider implements com.oracle.bmc.http.internal.BmcEnum {
        Azure("AZURE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CloudProvider.class);

        private final String value;
        private static java.util.Map<String, CloudProvider> map;

        static {
            map = new java.util.HashMap<>();
            for (CloudProvider v : CloudProvider.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CloudProvider(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CloudProvider create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CloudProvider', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Cloud provider */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudProvider")
    private final CloudProvider cloudProvider;

    /**
     * Cloud provider
     *
     * @return the value
     */
    public CloudProvider getCloudProvider() {
        return cloudProvider;
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
        sb.append("IdentityConnectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", cloudProvider=").append(String.valueOf(this.cloudProvider));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityConnectorDetails)) {
            return false;
        }

        IdentityConnectorDetails other = (IdentityConnectorDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.cloudProvider, other.cloudProvider)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudProvider == null ? 43 : this.cloudProvider.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
