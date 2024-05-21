/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Target System type and id for an autonomous database target system
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdbTargetSystemDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetSystemType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdbTargetSystemDetails extends TargetSystemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) for the autonomous database that Vault Secret connects to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adbId")
        private String adbId;

        /**
         * The unique identifier (OCID) for the autonomous database that Vault Secret connects to.
         *
         * @param adbId the value to set
         * @return this builder
         **/
        public Builder adbId(String adbId) {
            this.adbId = adbId;
            this.__explicitlySet__.add("adbId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdbTargetSystemDetails build() {
            AdbTargetSystemDetails model = new AdbTargetSystemDetails(this.adbId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdbTargetSystemDetails model) {
            if (model.wasPropertyExplicitlySet("adbId")) {
                this.adbId(model.getAdbId());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public AdbTargetSystemDetails(String adbId) {
        super();
        this.adbId = adbId;
    }

    /**
     * The unique identifier (OCID) for the autonomous database that Vault Secret connects to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adbId")
    private final String adbId;

    /**
     * The unique identifier (OCID) for the autonomous database that Vault Secret connects to.
     *
     * @return the value
     **/
    public String getAdbId() {
        return adbId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdbTargetSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", adbId=").append(String.valueOf(this.adbId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdbTargetSystemDetails)) {
            return false;
        }

        AdbTargetSystemDetails other = (AdbTargetSystemDetails) o;
        return java.util.Objects.equals(this.adbId, other.adbId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.adbId == null ? 43 : this.adbId.hashCode());
        return result;
    }
}
