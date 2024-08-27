/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Request to move an execution action member to an execution action resource from another. <br>
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
        builder = MoveExecutionActionMemberDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MoveExecutionActionMemberDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceExecutionActionId",
        "executionActionMemberId",
        "executionActionMemberCount",
        "freeformTags",
        "definedTags"
    })
    public MoveExecutionActionMemberDetails(
            String sourceExecutionActionId,
            String executionActionMemberId,
            Integer executionActionMemberCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.sourceExecutionActionId = sourceExecutionActionId;
        this.executionActionMemberId = executionActionMemberId;
        this.executionActionMemberCount = executionActionMemberCount;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * source execution action resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceExecutionActionId")
        private String sourceExecutionActionId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * source execution action resource.
         *
         * @param sourceExecutionActionId the value to set
         * @return this builder
         */
        public Builder sourceExecutionActionId(String sourceExecutionActionId) {
            this.sourceExecutionActionId = sourceExecutionActionId;
            this.__explicitlySet__.add("sourceExecutionActionId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * execution action member to be moved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executionActionMemberId")
        private String executionActionMemberId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * execution action member to be moved.
         *
         * @param executionActionMemberId the value to set
         * @return this builder
         */
        public Builder executionActionMemberId(String executionActionMemberId) {
            this.executionActionMemberId = executionActionMemberId;
            this.__explicitlySet__.add("executionActionMemberId");
            return this;
        }
        /** The number of execution action member without ocids to be moved. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionActionMemberCount")
        private Integer executionActionMemberCount;

        /**
         * The number of execution action member without ocids to be moved.
         *
         * @param executionActionMemberCount the value to set
         * @return this builder
         */
        public Builder executionActionMemberCount(Integer executionActionMemberCount) {
            this.executionActionMemberCount = executionActionMemberCount;
            this.__explicitlySet__.add("executionActionMemberCount");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MoveExecutionActionMemberDetails build() {
            MoveExecutionActionMemberDetails model =
                    new MoveExecutionActionMemberDetails(
                            this.sourceExecutionActionId,
                            this.executionActionMemberId,
                            this.executionActionMemberCount,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MoveExecutionActionMemberDetails model) {
            if (model.wasPropertyExplicitlySet("sourceExecutionActionId")) {
                this.sourceExecutionActionId(model.getSourceExecutionActionId());
            }
            if (model.wasPropertyExplicitlySet("executionActionMemberId")) {
                this.executionActionMemberId(model.getExecutionActionMemberId());
            }
            if (model.wasPropertyExplicitlySet("executionActionMemberCount")) {
                this.executionActionMemberCount(model.getExecutionActionMemberCount());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * source execution action resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceExecutionActionId")
    private final String sourceExecutionActionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * source execution action resource.
     *
     * @return the value
     */
    public String getSourceExecutionActionId() {
        return sourceExecutionActionId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * execution action member to be moved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executionActionMemberId")
    private final String executionActionMemberId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * execution action member to be moved.
     *
     * @return the value
     */
    public String getExecutionActionMemberId() {
        return executionActionMemberId;
    }

    /** The number of execution action member without ocids to be moved. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionActionMemberCount")
    private final Integer executionActionMemberCount;

    /**
     * The number of execution action member without ocids to be moved.
     *
     * @return the value
     */
    public Integer getExecutionActionMemberCount() {
        return executionActionMemberCount;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("MoveExecutionActionMemberDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceExecutionActionId=").append(String.valueOf(this.sourceExecutionActionId));
        sb.append(", executionActionMemberId=")
                .append(String.valueOf(this.executionActionMemberId));
        sb.append(", executionActionMemberCount=")
                .append(String.valueOf(this.executionActionMemberCount));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MoveExecutionActionMemberDetails)) {
            return false;
        }

        MoveExecutionActionMemberDetails other = (MoveExecutionActionMemberDetails) o;
        return java.util.Objects.equals(this.sourceExecutionActionId, other.sourceExecutionActionId)
                && java.util.Objects.equals(
                        this.executionActionMemberId, other.executionActionMemberId)
                && java.util.Objects.equals(
                        this.executionActionMemberCount, other.executionActionMemberCount)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceExecutionActionId == null
                                ? 43
                                : this.sourceExecutionActionId.hashCode());
        result =
                (result * PRIME)
                        + (this.executionActionMemberId == null
                                ? 43
                                : this.executionActionMemberId.hashCode());
        result =
                (result * PRIME)
                        + (this.executionActionMemberCount == null
                                ? 43
                                : this.executionActionMemberCount.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
