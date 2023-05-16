/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
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
        builder = AttachIScsiVolumeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttachIScsiVolumeDetails extends AttachVolumeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("device")
        private String device;

        public Builder device(String device) {
            this.device = device;
            this.__explicitlySet__.add("device");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
        private Boolean isReadOnly;

        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            this.__explicitlySet__.add("isReadOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isShareable")
        private Boolean isShareable;

        public Builder isShareable(Boolean isShareable) {
            this.isShareable = isShareable;
            this.__explicitlySet__.add("isShareable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        public Builder volumeId(String volumeId) {
            this.volumeId = volumeId;
            this.__explicitlySet__.add("volumeId");
            return this;
        }
        /** Whether to use CHAP authentication for the volume attachment. Defaults to false. */
        @com.fasterxml.jackson.annotation.JsonProperty("useChap")
        private Boolean useChap;

        /**
         * Whether to use CHAP authentication for the volume attachment. Defaults to false.
         *
         * @param useChap the value to set
         * @return this builder
         */
        public Builder useChap(Boolean useChap) {
            this.useChap = useChap;
            this.__explicitlySet__.add("useChap");
            return this;
        }
        /** Refer the top-level definition of encryptionInTransitType. The default value is NONE. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionInTransitType")
        private EncryptionInTransitType encryptionInTransitType;

        /**
         * Refer the top-level definition of encryptionInTransitType. The default value is NONE.
         *
         * @param encryptionInTransitType the value to set
         * @return this builder
         */
        public Builder encryptionInTransitType(EncryptionInTransitType encryptionInTransitType) {
            this.encryptionInTransitType = encryptionInTransitType;
            this.__explicitlySet__.add("encryptionInTransitType");
            return this;
        }
        /**
         * Whether to enable Oracle Cloud Agent to perform the iSCSI login and logout commands after
         * the volume attach or detach operations for non multipath-enabled iSCSI attachments.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoIscsiLoginEnabled")
        private Boolean isAgentAutoIscsiLoginEnabled;

        /**
         * Whether to enable Oracle Cloud Agent to perform the iSCSI login and logout commands after
         * the volume attach or detach operations for non multipath-enabled iSCSI attachments.
         *
         * @param isAgentAutoIscsiLoginEnabled the value to set
         * @return this builder
         */
        public Builder isAgentAutoIscsiLoginEnabled(Boolean isAgentAutoIscsiLoginEnabled) {
            this.isAgentAutoIscsiLoginEnabled = isAgentAutoIscsiLoginEnabled;
            this.__explicitlySet__.add("isAgentAutoIscsiLoginEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachIScsiVolumeDetails build() {
            AttachIScsiVolumeDetails model =
                    new AttachIScsiVolumeDetails(
                            this.device,
                            this.displayName,
                            this.instanceId,
                            this.isReadOnly,
                            this.isShareable,
                            this.volumeId,
                            this.useChap,
                            this.encryptionInTransitType,
                            this.isAgentAutoIscsiLoginEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachIScsiVolumeDetails model) {
            if (model.wasPropertyExplicitlySet("device")) {
                this.device(model.getDevice());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("isReadOnly")) {
                this.isReadOnly(model.getIsReadOnly());
            }
            if (model.wasPropertyExplicitlySet("isShareable")) {
                this.isShareable(model.getIsShareable());
            }
            if (model.wasPropertyExplicitlySet("volumeId")) {
                this.volumeId(model.getVolumeId());
            }
            if (model.wasPropertyExplicitlySet("useChap")) {
                this.useChap(model.getUseChap());
            }
            if (model.wasPropertyExplicitlySet("encryptionInTransitType")) {
                this.encryptionInTransitType(model.getEncryptionInTransitType());
            }
            if (model.wasPropertyExplicitlySet("isAgentAutoIscsiLoginEnabled")) {
                this.isAgentAutoIscsiLoginEnabled(model.getIsAgentAutoIscsiLoginEnabled());
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

    @Deprecated
    public AttachIScsiVolumeDetails(
            String device,
            String displayName,
            String instanceId,
            Boolean isReadOnly,
            Boolean isShareable,
            String volumeId,
            Boolean useChap,
            EncryptionInTransitType encryptionInTransitType,
            Boolean isAgentAutoIscsiLoginEnabled) {
        super(device, displayName, instanceId, isReadOnly, isShareable, volumeId);
        this.useChap = useChap;
        this.encryptionInTransitType = encryptionInTransitType;
        this.isAgentAutoIscsiLoginEnabled = isAgentAutoIscsiLoginEnabled;
    }

    /** Whether to use CHAP authentication for the volume attachment. Defaults to false. */
    @com.fasterxml.jackson.annotation.JsonProperty("useChap")
    private final Boolean useChap;

    /**
     * Whether to use CHAP authentication for the volume attachment. Defaults to false.
     *
     * @return the value
     */
    public Boolean getUseChap() {
        return useChap;
    }

    /** Refer the top-level definition of encryptionInTransitType. The default value is NONE. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionInTransitType")
    private final EncryptionInTransitType encryptionInTransitType;

    /**
     * Refer the top-level definition of encryptionInTransitType. The default value is NONE.
     *
     * @return the value
     */
    public EncryptionInTransitType getEncryptionInTransitType() {
        return encryptionInTransitType;
    }

    /**
     * Whether to enable Oracle Cloud Agent to perform the iSCSI login and logout commands after the
     * volume attach or detach operations for non multipath-enabled iSCSI attachments.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoIscsiLoginEnabled")
    private final Boolean isAgentAutoIscsiLoginEnabled;

    /**
     * Whether to enable Oracle Cloud Agent to perform the iSCSI login and logout commands after the
     * volume attach or detach operations for non multipath-enabled iSCSI attachments.
     *
     * @return the value
     */
    public Boolean getIsAgentAutoIscsiLoginEnabled() {
        return isAgentAutoIscsiLoginEnabled;
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
        sb.append("AttachIScsiVolumeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", useChap=").append(String.valueOf(this.useChap));
        sb.append(", encryptionInTransitType=")
                .append(String.valueOf(this.encryptionInTransitType));
        sb.append(", isAgentAutoIscsiLoginEnabled=")
                .append(String.valueOf(this.isAgentAutoIscsiLoginEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachIScsiVolumeDetails)) {
            return false;
        }

        AttachIScsiVolumeDetails other = (AttachIScsiVolumeDetails) o;
        return java.util.Objects.equals(this.useChap, other.useChap)
                && java.util.Objects.equals(
                        this.encryptionInTransitType, other.encryptionInTransitType)
                && java.util.Objects.equals(
                        this.isAgentAutoIscsiLoginEnabled, other.isAgentAutoIscsiLoginEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.useChap == null ? 43 : this.useChap.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionInTransitType == null
                                ? 43
                                : this.encryptionInTransitType.hashCode());
        result =
                (result * PRIME)
                        + (this.isAgentAutoIscsiLoginEnabled == null
                                ? 43
                                : this.isAgentAutoIscsiLoginEnabled.hashCode());
        return result;
    }
}
