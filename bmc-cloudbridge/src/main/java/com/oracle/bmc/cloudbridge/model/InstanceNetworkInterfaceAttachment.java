/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Describes a network interface attachment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceNetworkInterfaceAttachment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceNetworkInterfaceAttachment
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attachmentKey",
        "timeAttach",
        "isDeleteOnTermination",
        "deviceIndex",
        "networkCardIndex",
        "status"
    })
    public InstanceNetworkInterfaceAttachment(
            String attachmentKey,
            java.util.Date timeAttach,
            Boolean isDeleteOnTermination,
            Integer deviceIndex,
            Integer networkCardIndex,
            String status) {
        super();
        this.attachmentKey = attachmentKey;
        this.timeAttach = timeAttach;
        this.isDeleteOnTermination = isDeleteOnTermination;
        this.deviceIndex = deviceIndex;
        this.networkCardIndex = networkCardIndex;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the network interface attachment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentKey")
        private String attachmentKey;

        /**
         * The ID of the network interface attachment.
         * @param attachmentKey the value to set
         * @return this builder
         **/
        public Builder attachmentKey(String attachmentKey) {
            this.attachmentKey = attachmentKey;
            this.__explicitlySet__.add("attachmentKey");
            return this;
        }
        /**
         * The timestamp when the attachment initiated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAttach")
        private java.util.Date timeAttach;

        /**
         * The timestamp when the attachment initiated.
         * @param timeAttach the value to set
         * @return this builder
         **/
        public Builder timeAttach(java.util.Date timeAttach) {
            this.timeAttach = timeAttach;
            this.__explicitlySet__.add("timeAttach");
            return this;
        }
        /**
         * Indicates whether the network interface is deleted when the instance is terminated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDeleteOnTermination")
        private Boolean isDeleteOnTermination;

        /**
         * Indicates whether the network interface is deleted when the instance is terminated.
         * @param isDeleteOnTermination the value to set
         * @return this builder
         **/
        public Builder isDeleteOnTermination(Boolean isDeleteOnTermination) {
            this.isDeleteOnTermination = isDeleteOnTermination;
            this.__explicitlySet__.add("isDeleteOnTermination");
            return this;
        }
        /**
         * The index of the device on the instance for the network interface attachment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deviceIndex")
        private Integer deviceIndex;

        /**
         * The index of the device on the instance for the network interface attachment.
         * @param deviceIndex the value to set
         * @return this builder
         **/
        public Builder deviceIndex(Integer deviceIndex) {
            this.deviceIndex = deviceIndex;
            this.__explicitlySet__.add("deviceIndex");
            return this;
        }
        /**
         * The index of the network card.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkCardIndex")
        private Integer networkCardIndex;

        /**
         * The index of the network card.
         * @param networkCardIndex the value to set
         * @return this builder
         **/
        public Builder networkCardIndex(Integer networkCardIndex) {
            this.networkCardIndex = networkCardIndex;
            this.__explicitlySet__.add("networkCardIndex");
            return this;
        }
        /**
         * The attachment state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The attachment state.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceNetworkInterfaceAttachment build() {
            InstanceNetworkInterfaceAttachment model =
                    new InstanceNetworkInterfaceAttachment(
                            this.attachmentKey,
                            this.timeAttach,
                            this.isDeleteOnTermination,
                            this.deviceIndex,
                            this.networkCardIndex,
                            this.status);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceNetworkInterfaceAttachment model) {
            if (model.wasPropertyExplicitlySet("attachmentKey")) {
                this.attachmentKey(model.getAttachmentKey());
            }
            if (model.wasPropertyExplicitlySet("timeAttach")) {
                this.timeAttach(model.getTimeAttach());
            }
            if (model.wasPropertyExplicitlySet("isDeleteOnTermination")) {
                this.isDeleteOnTermination(model.getIsDeleteOnTermination());
            }
            if (model.wasPropertyExplicitlySet("deviceIndex")) {
                this.deviceIndex(model.getDeviceIndex());
            }
            if (model.wasPropertyExplicitlySet("networkCardIndex")) {
                this.networkCardIndex(model.getNetworkCardIndex());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
     * The ID of the network interface attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentKey")
    private final String attachmentKey;

    /**
     * The ID of the network interface attachment.
     * @return the value
     **/
    public String getAttachmentKey() {
        return attachmentKey;
    }

    /**
     * The timestamp when the attachment initiated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAttach")
    private final java.util.Date timeAttach;

    /**
     * The timestamp when the attachment initiated.
     * @return the value
     **/
    public java.util.Date getTimeAttach() {
        return timeAttach;
    }

    /**
     * Indicates whether the network interface is deleted when the instance is terminated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteOnTermination")
    private final Boolean isDeleteOnTermination;

    /**
     * Indicates whether the network interface is deleted when the instance is terminated.
     * @return the value
     **/
    public Boolean getIsDeleteOnTermination() {
        return isDeleteOnTermination;
    }

    /**
     * The index of the device on the instance for the network interface attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deviceIndex")
    private final Integer deviceIndex;

    /**
     * The index of the device on the instance for the network interface attachment.
     * @return the value
     **/
    public Integer getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * The index of the network card.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkCardIndex")
    private final Integer networkCardIndex;

    /**
     * The index of the network card.
     * @return the value
     **/
    public Integer getNetworkCardIndex() {
        return networkCardIndex;
    }

    /**
     * The attachment state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The attachment state.
     * @return the value
     **/
    public String getStatus() {
        return status;
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
        sb.append("InstanceNetworkInterfaceAttachment(");
        sb.append("super=").append(super.toString());
        sb.append("attachmentKey=").append(String.valueOf(this.attachmentKey));
        sb.append(", timeAttach=").append(String.valueOf(this.timeAttach));
        sb.append(", isDeleteOnTermination=").append(String.valueOf(this.isDeleteOnTermination));
        sb.append(", deviceIndex=").append(String.valueOf(this.deviceIndex));
        sb.append(", networkCardIndex=").append(String.valueOf(this.networkCardIndex));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceNetworkInterfaceAttachment)) {
            return false;
        }

        InstanceNetworkInterfaceAttachment other = (InstanceNetworkInterfaceAttachment) o;
        return java.util.Objects.equals(this.attachmentKey, other.attachmentKey)
                && java.util.Objects.equals(this.timeAttach, other.timeAttach)
                && java.util.Objects.equals(this.isDeleteOnTermination, other.isDeleteOnTermination)
                && java.util.Objects.equals(this.deviceIndex, other.deviceIndex)
                && java.util.Objects.equals(this.networkCardIndex, other.networkCardIndex)
                && java.util.Objects.equals(this.status, other.status)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attachmentKey == null ? 43 : this.attachmentKey.hashCode());
        result = (result * PRIME) + (this.timeAttach == null ? 43 : this.timeAttach.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteOnTermination == null
                                ? 43
                                : this.isDeleteOnTermination.hashCode());
        result = (result * PRIME) + (this.deviceIndex == null ? 43 : this.deviceIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.networkCardIndex == null ? 43 : this.networkCardIndex.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
