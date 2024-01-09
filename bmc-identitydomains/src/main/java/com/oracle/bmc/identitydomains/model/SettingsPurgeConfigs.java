/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Purge Configs for different Resource Types <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SettingsPurgeConfigs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SettingsPurgeConfigs
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceName", "retentionPeriod"})
    public SettingsPurgeConfigs(String resourceName, Integer retentionPeriod) {
        super();
        this.resourceName = resourceName;
        this.retentionPeriod = retentionPeriod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Resource Name
         *
         * <p>*Deprecated Since: 19.1.6**
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Resource Name
         *
         * <p>*Deprecated Since: 19.1.6**
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * Retention Period
         *
         * <p>*Deprecated Since: 19.1.6**
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
        private Integer retentionPeriod;

        /**
         * Retention Period
         *
         * <p>*Deprecated Since: 19.1.6**
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: integer
         *
         * @param retentionPeriod the value to set
         * @return this builder
         */
        public Builder retentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            this.__explicitlySet__.add("retentionPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SettingsPurgeConfigs build() {
            SettingsPurgeConfigs model =
                    new SettingsPurgeConfigs(this.resourceName, this.retentionPeriod);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SettingsPurgeConfigs model) {
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriod")) {
                this.retentionPeriod(model.getRetentionPeriod());
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
     * Resource Name
     *
     * <p>*Deprecated Since: 19.1.6**
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Resource Name
     *
     * <p>*Deprecated Since: 19.1.6**
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Retention Period
     *
     * <p>*Deprecated Since: 19.1.6**
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
    private final Integer retentionPeriod;

    /**
     * Retention Period
     *
     * <p>*Deprecated Since: 19.1.6**
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: integer
     *
     * @return the value
     */
    public Integer getRetentionPeriod() {
        return retentionPeriod;
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
        sb.append("SettingsPurgeConfigs(");
        sb.append("super=").append(super.toString());
        sb.append("resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", retentionPeriod=").append(String.valueOf(this.retentionPeriod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SettingsPurgeConfigs)) {
            return false;
        }

        SettingsPurgeConfigs other = (SettingsPurgeConfigs) o;
        return java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.retentionPeriod, other.retentionPeriod)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriod == null ? 43 : this.retentionPeriod.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
