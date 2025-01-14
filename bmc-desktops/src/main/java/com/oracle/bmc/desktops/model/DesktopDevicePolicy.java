/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides the settings for desktop and client device options, such as audio in and out, client
 * drive mapping, and clipboard access. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DesktopDevicePolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DesktopDevicePolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clipboardMode",
        "audioMode",
        "cdmMode",
        "isPrintingEnabled",
        "isPointerEnabled",
        "isKeyboardEnabled",
        "isDisplayEnabled"
    })
    public DesktopDevicePolicy(
            ClipboardMode clipboardMode,
            AudioMode audioMode,
            CdmMode cdmMode,
            Boolean isPrintingEnabled,
            Boolean isPointerEnabled,
            Boolean isKeyboardEnabled,
            Boolean isDisplayEnabled) {
        super();
        this.clipboardMode = clipboardMode;
        this.audioMode = audioMode;
        this.cdmMode = cdmMode;
        this.isPrintingEnabled = isPrintingEnabled;
        this.isPointerEnabled = isPointerEnabled;
        this.isKeyboardEnabled = isKeyboardEnabled;
        this.isDisplayEnabled = isDisplayEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The clipboard mode. NONE: No access to the local clipboard is permitted. TODESKTOP: The
         * clipboard can be used to transfer data to the desktop only. FROMDESKTOP: The clipboard
         * can be used to transfer data from the desktop only. FULL: The clipboard can be used to
         * transfer data to and from the desktop.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clipboardMode")
        private ClipboardMode clipboardMode;

        /**
         * The clipboard mode. NONE: No access to the local clipboard is permitted. TODESKTOP: The
         * clipboard can be used to transfer data to the desktop only. FROMDESKTOP: The clipboard
         * can be used to transfer data from the desktop only. FULL: The clipboard can be used to
         * transfer data to and from the desktop.
         *
         * @param clipboardMode the value to set
         * @return this builder
         */
        public Builder clipboardMode(ClipboardMode clipboardMode) {
            this.clipboardMode = clipboardMode;
            this.__explicitlySet__.add("clipboardMode");
            return this;
        }
        /**
         * The audio mode. NONE: No access to the local audio devices is permitted. TODESKTOP: The
         * user may record audio on their desktop. FROMDESKTOP: The user may play audio on their
         * desktop. FULL: The user may play and record audio on their desktop.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("audioMode")
        private AudioMode audioMode;

        /**
         * The audio mode. NONE: No access to the local audio devices is permitted. TODESKTOP: The
         * user may record audio on their desktop. FROMDESKTOP: The user may play audio on their
         * desktop. FULL: The user may play and record audio on their desktop.
         *
         * @param audioMode the value to set
         * @return this builder
         */
        public Builder audioMode(AudioMode audioMode) {
            this.audioMode = audioMode;
            this.__explicitlySet__.add("audioMode");
            return this;
        }
        /**
         * The client local drive access mode. NONE: No access to local drives permitted. READONLY:
         * The user may read from local drives on their desktop. FULL: The user may read from and
         * write to their local drives on their desktop.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cdmMode")
        private CdmMode cdmMode;

        /**
         * The client local drive access mode. NONE: No access to local drives permitted. READONLY:
         * The user may read from local drives on their desktop. FULL: The user may read from and
         * write to their local drives on their desktop.
         *
         * @param cdmMode the value to set
         * @return this builder
         */
        public Builder cdmMode(CdmMode cdmMode) {
            this.cdmMode = cdmMode;
            this.__explicitlySet__.add("cdmMode");
            return this;
        }
        /** Indicates whether printing is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrintingEnabled")
        private Boolean isPrintingEnabled;

        /**
         * Indicates whether printing is enabled.
         *
         * @param isPrintingEnabled the value to set
         * @return this builder
         */
        public Builder isPrintingEnabled(Boolean isPrintingEnabled) {
            this.isPrintingEnabled = isPrintingEnabled;
            this.__explicitlySet__.add("isPrintingEnabled");
            return this;
        }
        /** Indicates whether the pointer is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPointerEnabled")
        private Boolean isPointerEnabled;

        /**
         * Indicates whether the pointer is enabled.
         *
         * @param isPointerEnabled the value to set
         * @return this builder
         */
        public Builder isPointerEnabled(Boolean isPointerEnabled) {
            this.isPointerEnabled = isPointerEnabled;
            this.__explicitlySet__.add("isPointerEnabled");
            return this;
        }
        /** Indicates whether the keyboard is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isKeyboardEnabled")
        private Boolean isKeyboardEnabled;

        /**
         * Indicates whether the keyboard is enabled.
         *
         * @param isKeyboardEnabled the value to set
         * @return this builder
         */
        public Builder isKeyboardEnabled(Boolean isKeyboardEnabled) {
            this.isKeyboardEnabled = isKeyboardEnabled;
            this.__explicitlySet__.add("isKeyboardEnabled");
            return this;
        }
        /** Indicates whether the display is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisplayEnabled")
        private Boolean isDisplayEnabled;

        /**
         * Indicates whether the display is enabled.
         *
         * @param isDisplayEnabled the value to set
         * @return this builder
         */
        public Builder isDisplayEnabled(Boolean isDisplayEnabled) {
            this.isDisplayEnabled = isDisplayEnabled;
            this.__explicitlySet__.add("isDisplayEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DesktopDevicePolicy build() {
            DesktopDevicePolicy model =
                    new DesktopDevicePolicy(
                            this.clipboardMode,
                            this.audioMode,
                            this.cdmMode,
                            this.isPrintingEnabled,
                            this.isPointerEnabled,
                            this.isKeyboardEnabled,
                            this.isDisplayEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DesktopDevicePolicy model) {
            if (model.wasPropertyExplicitlySet("clipboardMode")) {
                this.clipboardMode(model.getClipboardMode());
            }
            if (model.wasPropertyExplicitlySet("audioMode")) {
                this.audioMode(model.getAudioMode());
            }
            if (model.wasPropertyExplicitlySet("cdmMode")) {
                this.cdmMode(model.getCdmMode());
            }
            if (model.wasPropertyExplicitlySet("isPrintingEnabled")) {
                this.isPrintingEnabled(model.getIsPrintingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isPointerEnabled")) {
                this.isPointerEnabled(model.getIsPointerEnabled());
            }
            if (model.wasPropertyExplicitlySet("isKeyboardEnabled")) {
                this.isKeyboardEnabled(model.getIsKeyboardEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDisplayEnabled")) {
                this.isDisplayEnabled(model.getIsDisplayEnabled());
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
     * The clipboard mode. NONE: No access to the local clipboard is permitted. TODESKTOP: The
     * clipboard can be used to transfer data to the desktop only. FROMDESKTOP: The clipboard can be
     * used to transfer data from the desktop only. FULL: The clipboard can be used to transfer data
     * to and from the desktop.
     */
    public enum ClipboardMode implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Todesktop("TODESKTOP"),
        Fromdesktop("FROMDESKTOP"),
        Full("FULL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClipboardMode.class);

        private final String value;
        private static java.util.Map<String, ClipboardMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ClipboardMode v : ClipboardMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClipboardMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClipboardMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClipboardMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The clipboard mode. NONE: No access to the local clipboard is permitted. TODESKTOP: The
     * clipboard can be used to transfer data to the desktop only. FROMDESKTOP: The clipboard can be
     * used to transfer data from the desktop only. FULL: The clipboard can be used to transfer data
     * to and from the desktop.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clipboardMode")
    private final ClipboardMode clipboardMode;

    /**
     * The clipboard mode. NONE: No access to the local clipboard is permitted. TODESKTOP: The
     * clipboard can be used to transfer data to the desktop only. FROMDESKTOP: The clipboard can be
     * used to transfer data from the desktop only. FULL: The clipboard can be used to transfer data
     * to and from the desktop.
     *
     * @return the value
     */
    public ClipboardMode getClipboardMode() {
        return clipboardMode;
    }

    /**
     * The audio mode. NONE: No access to the local audio devices is permitted. TODESKTOP: The user
     * may record audio on their desktop. FROMDESKTOP: The user may play audio on their desktop.
     * FULL: The user may play and record audio on their desktop.
     */
    public enum AudioMode implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Todesktop("TODESKTOP"),
        Fromdesktop("FROMDESKTOP"),
        Full("FULL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AudioMode.class);

        private final String value;
        private static java.util.Map<String, AudioMode> map;

        static {
            map = new java.util.HashMap<>();
            for (AudioMode v : AudioMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AudioMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AudioMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AudioMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The audio mode. NONE: No access to the local audio devices is permitted. TODESKTOP: The user
     * may record audio on their desktop. FROMDESKTOP: The user may play audio on their desktop.
     * FULL: The user may play and record audio on their desktop.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("audioMode")
    private final AudioMode audioMode;

    /**
     * The audio mode. NONE: No access to the local audio devices is permitted. TODESKTOP: The user
     * may record audio on their desktop. FROMDESKTOP: The user may play audio on their desktop.
     * FULL: The user may play and record audio on their desktop.
     *
     * @return the value
     */
    public AudioMode getAudioMode() {
        return audioMode;
    }

    /**
     * The client local drive access mode. NONE: No access to local drives permitted. READONLY: The
     * user may read from local drives on their desktop. FULL: The user may read from and write to
     * their local drives on their desktop.
     */
    public enum CdmMode implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Readonly("READONLY"),
        Full("FULL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CdmMode.class);

        private final String value;
        private static java.util.Map<String, CdmMode> map;

        static {
            map = new java.util.HashMap<>();
            for (CdmMode v : CdmMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CdmMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CdmMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CdmMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The client local drive access mode. NONE: No access to local drives permitted. READONLY: The
     * user may read from local drives on their desktop. FULL: The user may read from and write to
     * their local drives on their desktop.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cdmMode")
    private final CdmMode cdmMode;

    /**
     * The client local drive access mode. NONE: No access to local drives permitted. READONLY: The
     * user may read from local drives on their desktop. FULL: The user may read from and write to
     * their local drives on their desktop.
     *
     * @return the value
     */
    public CdmMode getCdmMode() {
        return cdmMode;
    }

    /** Indicates whether printing is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrintingEnabled")
    private final Boolean isPrintingEnabled;

    /**
     * Indicates whether printing is enabled.
     *
     * @return the value
     */
    public Boolean getIsPrintingEnabled() {
        return isPrintingEnabled;
    }

    /** Indicates whether the pointer is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPointerEnabled")
    private final Boolean isPointerEnabled;

    /**
     * Indicates whether the pointer is enabled.
     *
     * @return the value
     */
    public Boolean getIsPointerEnabled() {
        return isPointerEnabled;
    }

    /** Indicates whether the keyboard is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isKeyboardEnabled")
    private final Boolean isKeyboardEnabled;

    /**
     * Indicates whether the keyboard is enabled.
     *
     * @return the value
     */
    public Boolean getIsKeyboardEnabled() {
        return isKeyboardEnabled;
    }

    /** Indicates whether the display is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisplayEnabled")
    private final Boolean isDisplayEnabled;

    /**
     * Indicates whether the display is enabled.
     *
     * @return the value
     */
    public Boolean getIsDisplayEnabled() {
        return isDisplayEnabled;
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
        sb.append("DesktopDevicePolicy(");
        sb.append("super=").append(super.toString());
        sb.append("clipboardMode=").append(String.valueOf(this.clipboardMode));
        sb.append(", audioMode=").append(String.valueOf(this.audioMode));
        sb.append(", cdmMode=").append(String.valueOf(this.cdmMode));
        sb.append(", isPrintingEnabled=").append(String.valueOf(this.isPrintingEnabled));
        sb.append(", isPointerEnabled=").append(String.valueOf(this.isPointerEnabled));
        sb.append(", isKeyboardEnabled=").append(String.valueOf(this.isKeyboardEnabled));
        sb.append(", isDisplayEnabled=").append(String.valueOf(this.isDisplayEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesktopDevicePolicy)) {
            return false;
        }

        DesktopDevicePolicy other = (DesktopDevicePolicy) o;
        return java.util.Objects.equals(this.clipboardMode, other.clipboardMode)
                && java.util.Objects.equals(this.audioMode, other.audioMode)
                && java.util.Objects.equals(this.cdmMode, other.cdmMode)
                && java.util.Objects.equals(this.isPrintingEnabled, other.isPrintingEnabled)
                && java.util.Objects.equals(this.isPointerEnabled, other.isPointerEnabled)
                && java.util.Objects.equals(this.isKeyboardEnabled, other.isKeyboardEnabled)
                && java.util.Objects.equals(this.isDisplayEnabled, other.isDisplayEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clipboardMode == null ? 43 : this.clipboardMode.hashCode());
        result = (result * PRIME) + (this.audioMode == null ? 43 : this.audioMode.hashCode());
        result = (result * PRIME) + (this.cdmMode == null ? 43 : this.cdmMode.hashCode());
        result =
                (result * PRIME)
                        + (this.isPrintingEnabled == null ? 43 : this.isPrintingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isPointerEnabled == null ? 43 : this.isPointerEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isKeyboardEnabled == null ? 43 : this.isKeyboardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisplayEnabled == null ? 43 : this.isDisplayEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
