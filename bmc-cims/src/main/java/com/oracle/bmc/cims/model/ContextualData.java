/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ContextualData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ContextualData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clientId", "schemaName", "schemaVersion", "payload"})
    public ContextualData(
            String clientId, String schemaName, String schemaVersion, String payload) {
        super();
        this.clientId = clientId;
        this.schemaName = schemaName;
        this.schemaVersion = schemaVersion;
        this.payload = payload;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique client identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * The unique client identifier
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /** The schema name */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The schema name
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** The schema version */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaVersion")
        private String schemaVersion;

        /**
         * The schema version
         *
         * @param schemaVersion the value to set
         * @return this builder
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            this.__explicitlySet__.add("schemaVersion");
            return this;
        }
        /** The context data payload */
        @com.fasterxml.jackson.annotation.JsonProperty("payload")
        private String payload;

        /**
         * The context data payload
         *
         * @param payload the value to set
         * @return this builder
         */
        public Builder payload(String payload) {
            this.payload = payload;
            this.__explicitlySet__.add("payload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContextualData build() {
            ContextualData model =
                    new ContextualData(
                            this.clientId, this.schemaName, this.schemaVersion, this.payload);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContextualData model) {
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("schemaVersion")) {
                this.schemaVersion(model.getSchemaVersion());
            }
            if (model.wasPropertyExplicitlySet("payload")) {
                this.payload(model.getPayload());
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

    /** The unique client identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * The unique client identifier
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /** The schema name */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The schema name
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** The schema version */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaVersion")
    private final String schemaVersion;

    /**
     * The schema version
     *
     * @return the value
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /** The context data payload */
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    private final String payload;

    /**
     * The context data payload
     *
     * @return the value
     */
    public String getPayload() {
        return payload;
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
        sb.append("ContextualData(");
        sb.append("super=").append(super.toString());
        sb.append("clientId=").append(String.valueOf(this.clientId));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", schemaVersion=").append(String.valueOf(this.schemaVersion));
        sb.append(", payload=").append(String.valueOf(this.payload));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContextualData)) {
            return false;
        }

        ContextualData other = (ContextualData) o;
        return java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.schemaVersion, other.schemaVersion)
                && java.util.Objects.equals(this.payload, other.payload)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaVersion == null ? 43 : this.schemaVersion.hashCode());
        result = (result * PRIME) + (this.payload == null ? 43 : this.payload.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
