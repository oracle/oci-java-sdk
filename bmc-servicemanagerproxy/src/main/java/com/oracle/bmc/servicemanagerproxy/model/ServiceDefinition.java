/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemanagerproxy.model;

/**
 * Details for a service definition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210914")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ServiceDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServiceDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "displayName", "shortDisplayName"})
    public ServiceDefinition(String type, String displayName, String shortDisplayName) {
        super();
        this.type = type;
        this.displayName = displayName;
        this.shortDisplayName = shortDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The service definition type. For example, a service definition type "RGBUOROMS" would be
         * for the service "Oracle Retail Order Management Cloud Service".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The service definition type. For example, a service definition type "RGBUOROMS" would be
         * for the service "Oracle Retail Order Management Cloud Service".
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Display name of the service. For example, "Oracle Retail Order Management Cloud Service".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the service. For example, "Oracle Retail Order Management Cloud Service".
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Short display name of the service. For example, "Retail Order Management". */
        @com.fasterxml.jackson.annotation.JsonProperty("shortDisplayName")
        private String shortDisplayName;

        /**
         * Short display name of the service. For example, "Retail Order Management".
         *
         * @param shortDisplayName the value to set
         * @return this builder
         */
        public Builder shortDisplayName(String shortDisplayName) {
            this.shortDisplayName = shortDisplayName;
            this.__explicitlySet__.add("shortDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceDefinition build() {
            ServiceDefinition model =
                    new ServiceDefinition(this.type, this.displayName, this.shortDisplayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceDefinition model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("shortDisplayName")) {
                this.shortDisplayName(model.getShortDisplayName());
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

    /**
     * The service definition type. For example, a service definition type "RGBUOROMS" would be for
     * the service "Oracle Retail Order Management Cloud Service".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The service definition type. For example, a service definition type "RGBUOROMS" would be for
     * the service "Oracle Retail Order Management Cloud Service".
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Display name of the service. For example, "Oracle Retail Order Management Cloud Service". */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the service. For example, "Oracle Retail Order Management Cloud Service".
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Short display name of the service. For example, "Retail Order Management". */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDisplayName")
    private final String shortDisplayName;

    /**
     * Short display name of the service. For example, "Retail Order Management".
     *
     * @return the value
     */
    public String getShortDisplayName() {
        return shortDisplayName;
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
        sb.append("ServiceDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shortDisplayName=").append(String.valueOf(this.shortDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceDefinition)) {
            return false;
        }

        ServiceDefinition other = (ServiceDefinition) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shortDisplayName, other.shortDisplayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDisplayName == null ? 43 : this.shortDisplayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
