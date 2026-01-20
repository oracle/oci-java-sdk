/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Describes volume attachment details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VolumeAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VolumeAttachment
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isDeleteOnTermination",
        "device",
        "instanceKey",
        "status",
        "volumeKey"
    })
    public VolumeAttachment(
            Boolean isDeleteOnTermination,
            String device,
            String instanceKey,
            String status,
            String volumeKey) {
        super();
        this.isDeleteOnTermination = isDeleteOnTermination;
        this.device = device;
        this.instanceKey = instanceKey;
        this.status = status;
        this.volumeKey = volumeKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether the EBS volume is deleted on instance termination. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDeleteOnTermination")
        private Boolean isDeleteOnTermination;

        /**
         * Indicates whether the EBS volume is deleted on instance termination.
         *
         * @param isDeleteOnTermination the value to set
         * @return this builder
         */
        public Builder isDeleteOnTermination(Boolean isDeleteOnTermination) {
            this.isDeleteOnTermination = isDeleteOnTermination;
            this.__explicitlySet__.add("isDeleteOnTermination");
            return this;
        }
        /** The device name. */
        @com.fasterxml.jackson.annotation.JsonProperty("device")
        private String device;

        /**
         * The device name.
         *
         * @param device the value to set
         * @return this builder
         */
        public Builder device(String device) {
            this.device = device;
            this.__explicitlySet__.add("device");
            return this;
        }
        /** The ID of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceKey")
        private String instanceKey;

        /**
         * The ID of the instance.
         *
         * @param instanceKey the value to set
         * @return this builder
         */
        public Builder instanceKey(String instanceKey) {
            this.instanceKey = instanceKey;
            this.__explicitlySet__.add("instanceKey");
            return this;
        }
        /** The attachment state of the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The attachment state of the volume.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The ID of the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeKey")
        private String volumeKey;

        /**
         * The ID of the volume.
         *
         * @param volumeKey the value to set
         * @return this builder
         */
        public Builder volumeKey(String volumeKey) {
            this.volumeKey = volumeKey;
            this.__explicitlySet__.add("volumeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeAttachment build() {
            VolumeAttachment model =
                    new VolumeAttachment(
                            this.isDeleteOnTermination,
                            this.device,
                            this.instanceKey,
                            this.status,
                            this.volumeKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeAttachment model) {
            if (model.wasPropertyExplicitlySet("isDeleteOnTermination")) {
                this.isDeleteOnTermination(model.getIsDeleteOnTermination());
            }
            if (model.wasPropertyExplicitlySet("device")) {
                this.device(model.getDevice());
            }
            if (model.wasPropertyExplicitlySet("instanceKey")) {
                this.instanceKey(model.getInstanceKey());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("volumeKey")) {
                this.volumeKey(model.getVolumeKey());
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

    /** Indicates whether the EBS volume is deleted on instance termination. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteOnTermination")
    private final Boolean isDeleteOnTermination;

    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     *
     * @return the value
     */
    public Boolean getIsDeleteOnTermination() {
        return isDeleteOnTermination;
    }

    /** The device name. */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    private final String device;

    /**
     * The device name.
     *
     * @return the value
     */
    public String getDevice() {
        return device;
    }

    /** The ID of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceKey")
    private final String instanceKey;

    /**
     * The ID of the instance.
     *
     * @return the value
     */
    public String getInstanceKey() {
        return instanceKey;
    }

    /** The attachment state of the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The attachment state of the volume.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The ID of the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeKey")
    private final String volumeKey;

    /**
     * The ID of the volume.
     *
     * @return the value
     */
    public String getVolumeKey() {
        return volumeKey;
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
        sb.append("VolumeAttachment(");
        sb.append("super=").append(super.toString());
        sb.append("isDeleteOnTermination=").append(String.valueOf(this.isDeleteOnTermination));
        sb.append(", device=").append(String.valueOf(this.device));
        sb.append(", instanceKey=").append(String.valueOf(this.instanceKey));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", volumeKey=").append(String.valueOf(this.volumeKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeAttachment)) {
            return false;
        }

        VolumeAttachment other = (VolumeAttachment) o;
        return java.util.Objects.equals(this.isDeleteOnTermination, other.isDeleteOnTermination)
                && java.util.Objects.equals(this.device, other.device)
                && java.util.Objects.equals(this.instanceKey, other.instanceKey)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.volumeKey, other.volumeKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isDeleteOnTermination == null
                                ? 43
                                : this.isDeleteOnTermination.hashCode());
        result = (result * PRIME) + (this.device == null ? 43 : this.device.hashCode());
        result = (result * PRIME) + (this.instanceKey == null ? 43 : this.instanceKey.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.volumeKey == null ? 43 : this.volumeKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
