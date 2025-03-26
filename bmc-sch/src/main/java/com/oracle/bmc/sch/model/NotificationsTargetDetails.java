/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The destination topic for data transferred from the source.
 * For configuration instructions, see
 * [Creating a Connector](https://docs.oracle.com/iaas/Content/connector-hub/create-service-connector.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NotificationsTargetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NotificationsTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("topicId")
        private String topicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic.
         *
         * @param topicId the value to set
         * @return this builder
         **/
        public Builder topicId(String topicId) {
            this.topicId = topicId;
            this.__explicitlySet__.add("topicId");
            return this;
        }
        /**
         * Whether to apply a simplified, user-friendly format to the message. Applies only when friendly formatting is supported by the connector source and the subscription protocol.
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enableFormattedMessaging")
        private Boolean enableFormattedMessaging;

        /**
         * Whether to apply a simplified, user-friendly format to the message. Applies only when friendly formatting is supported by the connector source and the subscription protocol.
         * Example: {@code true}
         *
         * @param enableFormattedMessaging the value to set
         * @return this builder
         **/
        public Builder enableFormattedMessaging(Boolean enableFormattedMessaging) {
            this.enableFormattedMessaging = enableFormattedMessaging;
            this.__explicitlySet__.add("enableFormattedMessaging");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NotificationsTargetDetails build() {
            NotificationsTargetDetails model =
                    new NotificationsTargetDetails(this.topicId, this.enableFormattedMessaging);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotificationsTargetDetails model) {
            if (model.wasPropertyExplicitlySet("topicId")) {
                this.topicId(model.getTopicId());
            }
            if (model.wasPropertyExplicitlySet("enableFormattedMessaging")) {
                this.enableFormattedMessaging(model.getEnableFormattedMessaging());
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
    public NotificationsTargetDetails(String topicId, Boolean enableFormattedMessaging) {
        super();
        this.topicId = topicId;
        this.enableFormattedMessaging = enableFormattedMessaging;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topicId")
    private final String topicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic.
     *
     * @return the value
     **/
    public String getTopicId() {
        return topicId;
    }

    /**
     * Whether to apply a simplified, user-friendly format to the message. Applies only when friendly formatting is supported by the connector source and the subscription protocol.
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enableFormattedMessaging")
    private final Boolean enableFormattedMessaging;

    /**
     * Whether to apply a simplified, user-friendly format to the message. Applies only when friendly formatting is supported by the connector source and the subscription protocol.
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getEnableFormattedMessaging() {
        return enableFormattedMessaging;
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
        sb.append("NotificationsTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", topicId=").append(String.valueOf(this.topicId));
        sb.append(", enableFormattedMessaging=")
                .append(String.valueOf(this.enableFormattedMessaging));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationsTargetDetails)) {
            return false;
        }

        NotificationsTargetDetails other = (NotificationsTargetDetails) o;
        return java.util.Objects.equals(this.topicId, other.topicId)
                && java.util.Objects.equals(
                        this.enableFormattedMessaging, other.enableFormattedMessaging)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.topicId == null ? 43 : this.topicId.hashCode());
        result =
                (result * PRIME)
                        + (this.enableFormattedMessaging == null
                                ? 43
                                : this.enableFormattedMessaging.hashCode());
        return result;
    }
}
