/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to attach a lifecycle stage to a profile.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachLifecycleStageToProfileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttachLifecycleStageToProfileDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lifecycleStageId"})
    public AttachLifecycleStageToProfileDetails(String lifecycleStageId) {
        super();
        this.lifecycleStageId = lifecycleStageId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage that the instance will be associated with.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageId")
        private String lifecycleStageId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage that the instance will be associated with.
         * @param lifecycleStageId the value to set
         * @return this builder
         **/
        public Builder lifecycleStageId(String lifecycleStageId) {
            this.lifecycleStageId = lifecycleStageId;
            this.__explicitlySet__.add("lifecycleStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachLifecycleStageToProfileDetails build() {
            AttachLifecycleStageToProfileDetails model =
                    new AttachLifecycleStageToProfileDetails(this.lifecycleStageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachLifecycleStageToProfileDetails model) {
            if (model.wasPropertyExplicitlySet("lifecycleStageId")) {
                this.lifecycleStageId(model.getLifecycleStageId());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage that the instance will be associated with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStageId")
    private final String lifecycleStageId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage that the instance will be associated with.
     * @return the value
     **/
    public String getLifecycleStageId() {
        return lifecycleStageId;
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
        sb.append("AttachLifecycleStageToProfileDetails(");
        sb.append("super=").append(super.toString());
        sb.append("lifecycleStageId=").append(String.valueOf(this.lifecycleStageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachLifecycleStageToProfileDetails)) {
            return false;
        }

        AttachLifecycleStageToProfileDetails other = (AttachLifecycleStageToProfileDetails) o;
        return java.util.Objects.equals(this.lifecycleStageId, other.lifecycleStageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lifecycleStageId == null ? 43 : this.lifecycleStageId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
