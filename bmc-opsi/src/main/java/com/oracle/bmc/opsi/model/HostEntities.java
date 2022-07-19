/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Database entities running on the host
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostEntities.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostEntities extends HostConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Name of the database entity
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * Name of the database entity
         * @param entityName the value to set
         * @return this builder
         **/
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /**
         * Type of the database entity
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * Type of the database entity
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostEntities build() {
            HostEntities __instance__ = new HostEntities(timeCollected, entityName, entityType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostEntities o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .entityName(o.getEntityName())
                            .entityType(o.getEntityType());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public HostEntities(java.util.Date timeCollected, String entityName, String entityType) {
        super(timeCollected);
        this.entityName = entityName;
        this.entityType = entityType;
    }

    /**
     * Name of the database entity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * Name of the database entity
     * @return the value
     **/
    public String getEntityName() {
        return entityName;
    }

    /**
     * Type of the database entity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * Type of the database entity
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
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
        sb.append("HostEntities(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostEntities)) {
            return false;
        }

        HostEntities other = (HostEntities) o;
        return java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
