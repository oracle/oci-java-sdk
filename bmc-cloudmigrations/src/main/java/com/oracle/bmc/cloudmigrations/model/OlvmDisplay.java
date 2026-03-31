/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Display object in OLVM
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmDisplay.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmDisplay extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "address",
        "isAllowOverride",
        "certificate",
        "isCopyPasteEnabled",
        "disconnectAction",
        "disconnectActionDelayInMinutes",
        "isFileTransferEnabled",
        "keyboardLayout",
        "monitors",
        "port",
        "proxy",
        "securePort",
        "isSingleQxlPci",
        "displayType"
    })
    public OlvmDisplay(
            String address,
            Boolean isAllowOverride,
            OlvmCertificate certificate,
            Boolean isCopyPasteEnabled,
            String disconnectAction,
            Integer disconnectActionDelayInMinutes,
            Boolean isFileTransferEnabled,
            String keyboardLayout,
            Integer monitors,
            Integer port,
            String proxy,
            Integer securePort,
            Boolean isSingleQxlPci,
            DisplayType displayType) {
        super();
        this.address = address;
        this.isAllowOverride = isAllowOverride;
        this.certificate = certificate;
        this.isCopyPasteEnabled = isCopyPasteEnabled;
        this.disconnectAction = disconnectAction;
        this.disconnectActionDelayInMinutes = disconnectActionDelayInMinutes;
        this.isFileTransferEnabled = isFileTransferEnabled;
        this.keyboardLayout = keyboardLayout;
        this.monitors = monitors;
        this.port = port;
        this.proxy = proxy;
        this.securePort = securePort;
        this.isSingleQxlPci = isSingleQxlPci;
        this.displayType = displayType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The IP address of the guest to connect the graphic console client to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * The IP address of the guest to connect the graphic console client to.
         * @param address the value to set
         * @return this builder
         **/
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /**
         * Indicates if to override the display address per host.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAllowOverride")
        private Boolean isAllowOverride;

        /**
         * Indicates if to override the display address per host.
         * @param isAllowOverride the value to set
         * @return this builder
         **/
        public Builder isAllowOverride(Boolean isAllowOverride) {
            this.isAllowOverride = isAllowOverride;
            this.__explicitlySet__.add("isAllowOverride");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private OlvmCertificate certificate;

        public Builder certificate(OlvmCertificate certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }
        /**
         * Indicates whether a user is able to copy and paste content from an external host into the graphic console.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCopyPasteEnabled")
        private Boolean isCopyPasteEnabled;

        /**
         * Indicates whether a user is able to copy and paste content from an external host into the graphic console.
         * @param isCopyPasteEnabled the value to set
         * @return this builder
         **/
        public Builder isCopyPasteEnabled(Boolean isCopyPasteEnabled) {
            this.isCopyPasteEnabled = isCopyPasteEnabled;
            this.__explicitlySet__.add("isCopyPasteEnabled");
            return this;
        }
        /**
         * Returns the action that will take place when the graphic console is disconnected.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("disconnectAction")
        private String disconnectAction;

        /**
         * Returns the action that will take place when the graphic console is disconnected.
         * @param disconnectAction the value to set
         * @return this builder
         **/
        public Builder disconnectAction(String disconnectAction) {
            this.disconnectAction = disconnectAction;
            this.__explicitlySet__.add("disconnectAction");
            return this;
        }
        /**
         * Delay (in minutes) before the graphic console disconnect action is carried out.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("disconnectActionDelayInMinutes")
        private Integer disconnectActionDelayInMinutes;

        /**
         * Delay (in minutes) before the graphic console disconnect action is carried out.
         * @param disconnectActionDelayInMinutes the value to set
         * @return this builder
         **/
        public Builder disconnectActionDelayInMinutes(Integer disconnectActionDelayInMinutes) {
            this.disconnectActionDelayInMinutes = disconnectActionDelayInMinutes;
            this.__explicitlySet__.add("disconnectActionDelayInMinutes");
            return this;
        }
        /**
         * Indicates if a user is able to drag and drop files from an external host into the graphic console.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFileTransferEnabled")
        private Boolean isFileTransferEnabled;

        /**
         * Indicates if a user is able to drag and drop files from an external host into the graphic console.
         * @param isFileTransferEnabled the value to set
         * @return this builder
         **/
        public Builder isFileTransferEnabled(Boolean isFileTransferEnabled) {
            this.isFileTransferEnabled = isFileTransferEnabled;
            this.__explicitlySet__.add("isFileTransferEnabled");
            return this;
        }
        /**
         * The keyboard layout to use with this graphic console.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyboardLayout")
        private String keyboardLayout;

        /**
         * The keyboard layout to use with this graphic console.
         * @param keyboardLayout the value to set
         * @return this builder
         **/
        public Builder keyboardLayout(String keyboardLayout) {
            this.keyboardLayout = keyboardLayout;
            this.__explicitlySet__.add("keyboardLayout");
            return this;
        }
        /**
         * The number of monitors opened for this graphic console.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("monitors")
        private Integer monitors;

        /**
         * The number of monitors opened for this graphic console.
         * @param monitors the value to set
         * @return this builder
         **/
        public Builder monitors(Integer monitors) {
            this.monitors = monitors;
            this.__explicitlySet__.add("monitors");
            return this;
        }
        /**
         * The port address on the guest to connect the graphic console client to
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port address on the guest to connect the graphic console client to
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The proxy IP which will be used by the graphic console client to connect to the guest.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("proxy")
        private String proxy;

        /**
         * The proxy IP which will be used by the graphic console client to connect to the guest.
         * @param proxy the value to set
         * @return this builder
         **/
        public Builder proxy(String proxy) {
            this.proxy = proxy;
            this.__explicitlySet__.add("proxy");
            return this;
        }
        /**
         * The secured port address on the guest, in case of using TLS, to connect the graphic console client to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securePort")
        private Integer securePort;

        /**
         * The secured port address on the guest, in case of using TLS, to connect the graphic console client to.
         * @param securePort the value to set
         * @return this builder
         **/
        public Builder securePort(Integer securePort) {
            this.securePort = securePort;
            this.__explicitlySet__.add("securePort");
            return this;
        }
        /**
         * The engine now sets it automatically according to the operating system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSingleQxlPci")
        private Boolean isSingleQxlPci;

        /**
         * The engine now sets it automatically according to the operating system.
         * @param isSingleQxlPci the value to set
         * @return this builder
         **/
        public Builder isSingleQxlPci(Boolean isSingleQxlPci) {
            this.isSingleQxlPci = isSingleQxlPci;
            this.__explicitlySet__.add("isSingleQxlPci");
            return this;
        }
        /**
         * The graphic console protocol type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayType")
        private DisplayType displayType;

        /**
         * The graphic console protocol type.
         * @param displayType the value to set
         * @return this builder
         **/
        public Builder displayType(DisplayType displayType) {
            this.displayType = displayType;
            this.__explicitlySet__.add("displayType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmDisplay build() {
            OlvmDisplay model =
                    new OlvmDisplay(
                            this.address,
                            this.isAllowOverride,
                            this.certificate,
                            this.isCopyPasteEnabled,
                            this.disconnectAction,
                            this.disconnectActionDelayInMinutes,
                            this.isFileTransferEnabled,
                            this.keyboardLayout,
                            this.monitors,
                            this.port,
                            this.proxy,
                            this.securePort,
                            this.isSingleQxlPci,
                            this.displayType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmDisplay model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("isAllowOverride")) {
                this.isAllowOverride(model.getIsAllowOverride());
            }
            if (model.wasPropertyExplicitlySet("certificate")) {
                this.certificate(model.getCertificate());
            }
            if (model.wasPropertyExplicitlySet("isCopyPasteEnabled")) {
                this.isCopyPasteEnabled(model.getIsCopyPasteEnabled());
            }
            if (model.wasPropertyExplicitlySet("disconnectAction")) {
                this.disconnectAction(model.getDisconnectAction());
            }
            if (model.wasPropertyExplicitlySet("disconnectActionDelayInMinutes")) {
                this.disconnectActionDelayInMinutes(model.getDisconnectActionDelayInMinutes());
            }
            if (model.wasPropertyExplicitlySet("isFileTransferEnabled")) {
                this.isFileTransferEnabled(model.getIsFileTransferEnabled());
            }
            if (model.wasPropertyExplicitlySet("keyboardLayout")) {
                this.keyboardLayout(model.getKeyboardLayout());
            }
            if (model.wasPropertyExplicitlySet("monitors")) {
                this.monitors(model.getMonitors());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("proxy")) {
                this.proxy(model.getProxy());
            }
            if (model.wasPropertyExplicitlySet("securePort")) {
                this.securePort(model.getSecurePort());
            }
            if (model.wasPropertyExplicitlySet("isSingleQxlPci")) {
                this.isSingleQxlPci(model.getIsSingleQxlPci());
            }
            if (model.wasPropertyExplicitlySet("displayType")) {
                this.displayType(model.getDisplayType());
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
     * The IP address of the guest to connect the graphic console client to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * The IP address of the guest to connect the graphic console client to.
     * @return the value
     **/
    public String getAddress() {
        return address;
    }

    /**
     * Indicates if to override the display address per host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowOverride")
    private final Boolean isAllowOverride;

    /**
     * Indicates if to override the display address per host.
     * @return the value
     **/
    public Boolean getIsAllowOverride() {
        return isAllowOverride;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    private final OlvmCertificate certificate;

    public OlvmCertificate getCertificate() {
        return certificate;
    }

    /**
     * Indicates whether a user is able to copy and paste content from an external host into the graphic console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCopyPasteEnabled")
    private final Boolean isCopyPasteEnabled;

    /**
     * Indicates whether a user is able to copy and paste content from an external host into the graphic console.
     * @return the value
     **/
    public Boolean getIsCopyPasteEnabled() {
        return isCopyPasteEnabled;
    }

    /**
     * Returns the action that will take place when the graphic console is disconnected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disconnectAction")
    private final String disconnectAction;

    /**
     * Returns the action that will take place when the graphic console is disconnected.
     * @return the value
     **/
    public String getDisconnectAction() {
        return disconnectAction;
    }

    /**
     * Delay (in minutes) before the graphic console disconnect action is carried out.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disconnectActionDelayInMinutes")
    private final Integer disconnectActionDelayInMinutes;

    /**
     * Delay (in minutes) before the graphic console disconnect action is carried out.
     * @return the value
     **/
    public Integer getDisconnectActionDelayInMinutes() {
        return disconnectActionDelayInMinutes;
    }

    /**
     * Indicates if a user is able to drag and drop files from an external host into the graphic console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFileTransferEnabled")
    private final Boolean isFileTransferEnabled;

    /**
     * Indicates if a user is able to drag and drop files from an external host into the graphic console.
     * @return the value
     **/
    public Boolean getIsFileTransferEnabled() {
        return isFileTransferEnabled;
    }

    /**
     * The keyboard layout to use with this graphic console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyboardLayout")
    private final String keyboardLayout;

    /**
     * The keyboard layout to use with this graphic console.
     * @return the value
     **/
    public String getKeyboardLayout() {
        return keyboardLayout;
    }

    /**
     * The number of monitors opened for this graphic console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monitors")
    private final Integer monitors;

    /**
     * The number of monitors opened for this graphic console.
     * @return the value
     **/
    public Integer getMonitors() {
        return monitors;
    }

    /**
     * The port address on the guest to connect the graphic console client to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port address on the guest to connect the graphic console client to
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The proxy IP which will be used by the graphic console client to connect to the guest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("proxy")
    private final String proxy;

    /**
     * The proxy IP which will be used by the graphic console client to connect to the guest.
     * @return the value
     **/
    public String getProxy() {
        return proxy;
    }

    /**
     * The secured port address on the guest, in case of using TLS, to connect the graphic console client to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securePort")
    private final Integer securePort;

    /**
     * The secured port address on the guest, in case of using TLS, to connect the graphic console client to.
     * @return the value
     **/
    public Integer getSecurePort() {
        return securePort;
    }

    /**
     * The engine now sets it automatically according to the operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleQxlPci")
    private final Boolean isSingleQxlPci;

    /**
     * The engine now sets it automatically according to the operating system.
     * @return the value
     **/
    public Boolean getIsSingleQxlPci() {
        return isSingleQxlPci;
    }

    /**
     * The graphic console protocol type.
     **/
    public enum DisplayType {
        Spice("SPICE"),
        Vnc("VNC"),
        ;

        private final String value;
        private static java.util.Map<String, DisplayType> map;

        static {
            map = new java.util.HashMap<>();
            for (DisplayType v : DisplayType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DisplayType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DisplayType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DisplayType: " + key);
        }
    };
    /**
     * The graphic console protocol type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayType")
    private final DisplayType displayType;

    /**
     * The graphic console protocol type.
     * @return the value
     **/
    public DisplayType getDisplayType() {
        return displayType;
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
        sb.append("OlvmDisplay(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", isAllowOverride=").append(String.valueOf(this.isAllowOverride));
        sb.append(", certificate=").append(String.valueOf(this.certificate));
        sb.append(", isCopyPasteEnabled=").append(String.valueOf(this.isCopyPasteEnabled));
        sb.append(", disconnectAction=").append(String.valueOf(this.disconnectAction));
        sb.append(", disconnectActionDelayInMinutes=")
                .append(String.valueOf(this.disconnectActionDelayInMinutes));
        sb.append(", isFileTransferEnabled=").append(String.valueOf(this.isFileTransferEnabled));
        sb.append(", keyboardLayout=").append(String.valueOf(this.keyboardLayout));
        sb.append(", monitors=").append(String.valueOf(this.monitors));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", proxy=").append(String.valueOf(this.proxy));
        sb.append(", securePort=").append(String.valueOf(this.securePort));
        sb.append(", isSingleQxlPci=").append(String.valueOf(this.isSingleQxlPci));
        sb.append(", displayType=").append(String.valueOf(this.displayType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmDisplay)) {
            return false;
        }

        OlvmDisplay other = (OlvmDisplay) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.isAllowOverride, other.isAllowOverride)
                && java.util.Objects.equals(this.certificate, other.certificate)
                && java.util.Objects.equals(this.isCopyPasteEnabled, other.isCopyPasteEnabled)
                && java.util.Objects.equals(this.disconnectAction, other.disconnectAction)
                && java.util.Objects.equals(
                        this.disconnectActionDelayInMinutes, other.disconnectActionDelayInMinutes)
                && java.util.Objects.equals(this.isFileTransferEnabled, other.isFileTransferEnabled)
                && java.util.Objects.equals(this.keyboardLayout, other.keyboardLayout)
                && java.util.Objects.equals(this.monitors, other.monitors)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.proxy, other.proxy)
                && java.util.Objects.equals(this.securePort, other.securePort)
                && java.util.Objects.equals(this.isSingleQxlPci, other.isSingleQxlPci)
                && java.util.Objects.equals(this.displayType, other.displayType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result =
                (result * PRIME)
                        + (this.isAllowOverride == null ? 43 : this.isAllowOverride.hashCode());
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
        result =
                (result * PRIME)
                        + (this.isCopyPasteEnabled == null
                                ? 43
                                : this.isCopyPasteEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.disconnectAction == null ? 43 : this.disconnectAction.hashCode());
        result =
                (result * PRIME)
                        + (this.disconnectActionDelayInMinutes == null
                                ? 43
                                : this.disconnectActionDelayInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.isFileTransferEnabled == null
                                ? 43
                                : this.isFileTransferEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.keyboardLayout == null ? 43 : this.keyboardLayout.hashCode());
        result = (result * PRIME) + (this.monitors == null ? 43 : this.monitors.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.proxy == null ? 43 : this.proxy.hashCode());
        result = (result * PRIME) + (this.securePort == null ? 43 : this.securePort.hashCode());
        result =
                (result * PRIME)
                        + (this.isSingleQxlPci == null ? 43 : this.isSingleQxlPci.hashCode());
        result = (result * PRIME) + (this.displayType == null ? 43 : this.displayType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
