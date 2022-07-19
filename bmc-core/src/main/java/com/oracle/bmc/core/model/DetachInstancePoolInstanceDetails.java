/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An instance that is to be detached from an instance pool.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetachInstancePoolInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetachInstancePoolInstanceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"instanceId", "isDecrementSize", "isAutoTerminate"})
    public DetachInstancePoolInstanceDetails(
            String instanceId, Boolean isDecrementSize, Boolean isAutoTerminate) {
        super();
        this.instanceId = instanceId;
        this.isDecrementSize = isDecrementSize;
        this.isAutoTerminate = isAutoTerminate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Whether to decrease the size of the instance pool when the instance is detached. If {@code true}, the
         * pool size is decreased. If {@code false}, the pool will provision a new, replacement instance
         * using the pool's instance configuration as a template. Default is {@code true}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDecrementSize")
        private Boolean isDecrementSize;

        /**
         * Whether to decrease the size of the instance pool when the instance is detached. If {@code true}, the
         * pool size is decreased. If {@code false}, the pool will provision a new, replacement instance
         * using the pool's instance configuration as a template. Default is {@code true}.
         *
         * @param isDecrementSize the value to set
         * @return this builder
         **/
        public Builder isDecrementSize(Boolean isDecrementSize) {
            this.isDecrementSize = isDecrementSize;
            this.__explicitlySet__.add("isDecrementSize");
            return this;
        }
        /**
         * Whether to permanently terminate (delete) the instance and its attached boot volume
         * when detaching it from the instance pool. Default is {@code false}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoTerminate")
        private Boolean isAutoTerminate;

        /**
         * Whether to permanently terminate (delete) the instance and its attached boot volume
         * when detaching it from the instance pool. Default is {@code false}.
         *
         * @param isAutoTerminate the value to set
         * @return this builder
         **/
        public Builder isAutoTerminate(Boolean isAutoTerminate) {
            this.isAutoTerminate = isAutoTerminate;
            this.__explicitlySet__.add("isAutoTerminate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachInstancePoolInstanceDetails build() {
            DetachInstancePoolInstanceDetails __instance__ =
                    new DetachInstancePoolInstanceDetails(
                            instanceId, isDecrementSize, isAutoTerminate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachInstancePoolInstanceDetails o) {
            Builder copiedBuilder =
                    instanceId(o.getInstanceId())
                            .isDecrementSize(o.getIsDecrementSize())
                            .isAutoTerminate(o.getIsAutoTerminate());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the instance.
     * @return the value
     **/
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Whether to decrease the size of the instance pool when the instance is detached. If {@code true}, the
     * pool size is decreased. If {@code false}, the pool will provision a new, replacement instance
     * using the pool's instance configuration as a template. Default is {@code true}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDecrementSize")
    private final Boolean isDecrementSize;

    /**
     * Whether to decrease the size of the instance pool when the instance is detached. If {@code true}, the
     * pool size is decreased. If {@code false}, the pool will provision a new, replacement instance
     * using the pool's instance configuration as a template. Default is {@code true}.
     *
     * @return the value
     **/
    public Boolean getIsDecrementSize() {
        return isDecrementSize;
    }

    /**
     * Whether to permanently terminate (delete) the instance and its attached boot volume
     * when detaching it from the instance pool. Default is {@code false}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoTerminate")
    private final Boolean isAutoTerminate;

    /**
     * Whether to permanently terminate (delete) the instance and its attached boot volume
     * when detaching it from the instance pool. Default is {@code false}.
     *
     * @return the value
     **/
    public Boolean getIsAutoTerminate() {
        return isAutoTerminate;
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
        sb.append("DetachInstancePoolInstanceDetails(");
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", isDecrementSize=").append(String.valueOf(this.isDecrementSize));
        sb.append(", isAutoTerminate=").append(String.valueOf(this.isAutoTerminate));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachInstancePoolInstanceDetails)) {
            return false;
        }

        DetachInstancePoolInstanceDetails other = (DetachInstancePoolInstanceDetails) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.isDecrementSize, other.isDecrementSize)
                && java.util.Objects.equals(this.isAutoTerminate, other.isAutoTerminate)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDecrementSize == null ? 43 : this.isDecrementSize.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoTerminate == null ? 43 : this.isAutoTerminate.hashCode());
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
