/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Input payload to remove Log Analytics Log Group for given IntegrationInstance or its supported
 * attachments. Some actions may not be applicable to specific integration types. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RemoveLogAnalyticsLogGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveLogAnalyticsLogGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attachmentType"})
    public RemoveLogAnalyticsLogGroupDetails(AttachmentType attachmentType) {
        super();
        this.attachmentType = attachmentType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of attachment. Supported at this include PROCESS_AUTOMATION */
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
        private AttachmentType attachmentType;

        /**
         * Type of attachment. Supported at this include PROCESS_AUTOMATION
         *
         * @param attachmentType the value to set
         * @return this builder
         */
        public Builder attachmentType(AttachmentType attachmentType) {
            this.attachmentType = attachmentType;
            this.__explicitlySet__.add("attachmentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveLogAnalyticsLogGroupDetails build() {
            RemoveLogAnalyticsLogGroupDetails model =
                    new RemoveLogAnalyticsLogGroupDetails(this.attachmentType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveLogAnalyticsLogGroupDetails model) {
            if (model.wasPropertyExplicitlySet("attachmentType")) {
                this.attachmentType(model.getAttachmentType());
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

    /** Type of attachment. Supported at this include PROCESS_AUTOMATION */
    public enum AttachmentType implements com.oracle.bmc.http.internal.BmcEnum {
        ProcessAutomation("PROCESS_AUTOMATION"),
        ;

        private final String value;
        private static java.util.Map<String, AttachmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (AttachmentType v : AttachmentType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AttachmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttachmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AttachmentType: " + key);
        }
    };
    /** Type of attachment. Supported at this include PROCESS_AUTOMATION */
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
    private final AttachmentType attachmentType;

    /**
     * Type of attachment. Supported at this include PROCESS_AUTOMATION
     *
     * @return the value
     */
    public AttachmentType getAttachmentType() {
        return attachmentType;
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
        sb.append("RemoveLogAnalyticsLogGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("attachmentType=").append(String.valueOf(this.attachmentType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveLogAnalyticsLogGroupDetails)) {
            return false;
        }

        RemoveLogAnalyticsLogGroupDetails other = (RemoveLogAnalyticsLogGroupDetails) o;
        return java.util.Objects.equals(this.attachmentType, other.attachmentType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attachmentType == null ? 43 : this.attachmentType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
