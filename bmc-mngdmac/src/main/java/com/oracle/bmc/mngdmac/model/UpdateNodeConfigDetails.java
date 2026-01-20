/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mngdmac.model;

/**
 * The data to update a new NodeConfig. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250320")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateNodeConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateNodeConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "macAddress",
        "macOrderId",
        "switchHostname",
        "switchEthPort",
        "ipKvmHostname",
        "ipKvmPortNumber",
        "pduHostname",
        "pduPort",
        "buildVlanId",
        "buildIpAddress",
        "prodVlanId",
        "prodIpAddress",
        "rackLocation",
        "chipSet",
        "osVersion",
        "tenancyId"
    })
    public UpdateNodeConfigDetails(
            String macAddress,
            String macOrderId,
            String switchHostname,
            String switchEthPort,
            String ipKvmHostname,
            Integer ipKvmPortNumber,
            String pduHostname,
            Integer pduPort,
            Integer buildVlanId,
            String buildIpAddress,
            Integer prodVlanId,
            String prodIpAddress,
            String rackLocation,
            String chipSet,
            String osVersion,
            String tenancyId) {
        super();
        this.macAddress = macAddress;
        this.macOrderId = macOrderId;
        this.switchHostname = switchHostname;
        this.switchEthPort = switchEthPort;
        this.ipKvmHostname = ipKvmHostname;
        this.ipKvmPortNumber = ipKvmPortNumber;
        this.pduHostname = pduHostname;
        this.pduPort = pduPort;
        this.buildVlanId = buildVlanId;
        this.buildIpAddress = buildIpAddress;
        this.prodVlanId = prodVlanId;
        this.prodIpAddress = prodIpAddress;
        this.rackLocation = rackLocation;
        this.chipSet = chipSet;
        this.osVersion = osVersion;
        this.tenancyId = tenancyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The macAddress. */
        @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
        private String macAddress;

        /**
         * The macAddress.
         *
         * @param macAddress the value to set
         * @return this builder
         */
        public Builder macAddress(String macAddress) {
            this.macAddress = macAddress;
            this.__explicitlySet__.add("macAddress");
            return this;
        }
        /** The macOrderId. */
        @com.fasterxml.jackson.annotation.JsonProperty("macOrderId")
        private String macOrderId;

        /**
         * The macOrderId.
         *
         * @param macOrderId the value to set
         * @return this builder
         */
        public Builder macOrderId(String macOrderId) {
            this.macOrderId = macOrderId;
            this.__explicitlySet__.add("macOrderId");
            return this;
        }
        /** The switchHostname. */
        @com.fasterxml.jackson.annotation.JsonProperty("switchHostname")
        private String switchHostname;

        /**
         * The switchHostname.
         *
         * @param switchHostname the value to set
         * @return this builder
         */
        public Builder switchHostname(String switchHostname) {
            this.switchHostname = switchHostname;
            this.__explicitlySet__.add("switchHostname");
            return this;
        }
        /** The switchEthPort. */
        @com.fasterxml.jackson.annotation.JsonProperty("switchEthPort")
        private String switchEthPort;

        /**
         * The switchEthPort.
         *
         * @param switchEthPort the value to set
         * @return this builder
         */
        public Builder switchEthPort(String switchEthPort) {
            this.switchEthPort = switchEthPort;
            this.__explicitlySet__.add("switchEthPort");
            return this;
        }
        /** The ipKvmHostname. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipKvmHostname")
        private String ipKvmHostname;

        /**
         * The ipKvmHostname.
         *
         * @param ipKvmHostname the value to set
         * @return this builder
         */
        public Builder ipKvmHostname(String ipKvmHostname) {
            this.ipKvmHostname = ipKvmHostname;
            this.__explicitlySet__.add("ipKvmHostname");
            return this;
        }
        /** The ipKvmPortNumber. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipKvmPortNumber")
        private Integer ipKvmPortNumber;

        /**
         * The ipKvmPortNumber.
         *
         * @param ipKvmPortNumber the value to set
         * @return this builder
         */
        public Builder ipKvmPortNumber(Integer ipKvmPortNumber) {
            this.ipKvmPortNumber = ipKvmPortNumber;
            this.__explicitlySet__.add("ipKvmPortNumber");
            return this;
        }
        /** The pduHostname. */
        @com.fasterxml.jackson.annotation.JsonProperty("pduHostname")
        private String pduHostname;

        /**
         * The pduHostname.
         *
         * @param pduHostname the value to set
         * @return this builder
         */
        public Builder pduHostname(String pduHostname) {
            this.pduHostname = pduHostname;
            this.__explicitlySet__.add("pduHostname");
            return this;
        }
        /** The pduPort. */
        @com.fasterxml.jackson.annotation.JsonProperty("pduPort")
        private Integer pduPort;

        /**
         * The pduPort.
         *
         * @param pduPort the value to set
         * @return this builder
         */
        public Builder pduPort(Integer pduPort) {
            this.pduPort = pduPort;
            this.__explicitlySet__.add("pduPort");
            return this;
        }
        /** The buildVlanId. */
        @com.fasterxml.jackson.annotation.JsonProperty("buildVlanId")
        private Integer buildVlanId;

        /**
         * The buildVlanId.
         *
         * @param buildVlanId the value to set
         * @return this builder
         */
        public Builder buildVlanId(Integer buildVlanId) {
            this.buildVlanId = buildVlanId;
            this.__explicitlySet__.add("buildVlanId");
            return this;
        }
        /** The buildIpAddress. */
        @com.fasterxml.jackson.annotation.JsonProperty("buildIpAddress")
        private String buildIpAddress;

        /**
         * The buildIpAddress.
         *
         * @param buildIpAddress the value to set
         * @return this builder
         */
        public Builder buildIpAddress(String buildIpAddress) {
            this.buildIpAddress = buildIpAddress;
            this.__explicitlySet__.add("buildIpAddress");
            return this;
        }
        /** The prodVlanId. */
        @com.fasterxml.jackson.annotation.JsonProperty("prodVlanId")
        private Integer prodVlanId;

        /**
         * The prodVlanId.
         *
         * @param prodVlanId the value to set
         * @return this builder
         */
        public Builder prodVlanId(Integer prodVlanId) {
            this.prodVlanId = prodVlanId;
            this.__explicitlySet__.add("prodVlanId");
            return this;
        }
        /** The prodIpAddress. */
        @com.fasterxml.jackson.annotation.JsonProperty("prodIpAddress")
        private String prodIpAddress;

        /**
         * The prodIpAddress.
         *
         * @param prodIpAddress the value to set
         * @return this builder
         */
        public Builder prodIpAddress(String prodIpAddress) {
            this.prodIpAddress = prodIpAddress;
            this.__explicitlySet__.add("prodIpAddress");
            return this;
        }
        /** The rackLocation. */
        @com.fasterxml.jackson.annotation.JsonProperty("rackLocation")
        private String rackLocation;

        /**
         * The rackLocation.
         *
         * @param rackLocation the value to set
         * @return this builder
         */
        public Builder rackLocation(String rackLocation) {
            this.rackLocation = rackLocation;
            this.__explicitlySet__.add("rackLocation");
            return this;
        }
        /** The chipSetn. */
        @com.fasterxml.jackson.annotation.JsonProperty("chipSet")
        private String chipSet;

        /**
         * The chipSetn.
         *
         * @param chipSet the value to set
         * @return this builder
         */
        public Builder chipSet(String chipSet) {
            this.chipSet = chipSet;
            this.__explicitlySet__.add("chipSet");
            return this;
        }
        /** The osVersion. */
        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        /**
         * The osVersion.
         *
         * @param osVersion the value to set
         * @return this builder
         */
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }
        /** The tenancyId. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The tenancyId.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNodeConfigDetails build() {
            UpdateNodeConfigDetails model =
                    new UpdateNodeConfigDetails(
                            this.macAddress,
                            this.macOrderId,
                            this.switchHostname,
                            this.switchEthPort,
                            this.ipKvmHostname,
                            this.ipKvmPortNumber,
                            this.pduHostname,
                            this.pduPort,
                            this.buildVlanId,
                            this.buildIpAddress,
                            this.prodVlanId,
                            this.prodIpAddress,
                            this.rackLocation,
                            this.chipSet,
                            this.osVersion,
                            this.tenancyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNodeConfigDetails model) {
            if (model.wasPropertyExplicitlySet("macAddress")) {
                this.macAddress(model.getMacAddress());
            }
            if (model.wasPropertyExplicitlySet("macOrderId")) {
                this.macOrderId(model.getMacOrderId());
            }
            if (model.wasPropertyExplicitlySet("switchHostname")) {
                this.switchHostname(model.getSwitchHostname());
            }
            if (model.wasPropertyExplicitlySet("switchEthPort")) {
                this.switchEthPort(model.getSwitchEthPort());
            }
            if (model.wasPropertyExplicitlySet("ipKvmHostname")) {
                this.ipKvmHostname(model.getIpKvmHostname());
            }
            if (model.wasPropertyExplicitlySet("ipKvmPortNumber")) {
                this.ipKvmPortNumber(model.getIpKvmPortNumber());
            }
            if (model.wasPropertyExplicitlySet("pduHostname")) {
                this.pduHostname(model.getPduHostname());
            }
            if (model.wasPropertyExplicitlySet("pduPort")) {
                this.pduPort(model.getPduPort());
            }
            if (model.wasPropertyExplicitlySet("buildVlanId")) {
                this.buildVlanId(model.getBuildVlanId());
            }
            if (model.wasPropertyExplicitlySet("buildIpAddress")) {
                this.buildIpAddress(model.getBuildIpAddress());
            }
            if (model.wasPropertyExplicitlySet("prodVlanId")) {
                this.prodVlanId(model.getProdVlanId());
            }
            if (model.wasPropertyExplicitlySet("prodIpAddress")) {
                this.prodIpAddress(model.getProdIpAddress());
            }
            if (model.wasPropertyExplicitlySet("rackLocation")) {
                this.rackLocation(model.getRackLocation());
            }
            if (model.wasPropertyExplicitlySet("chipSet")) {
                this.chipSet(model.getChipSet());
            }
            if (model.wasPropertyExplicitlySet("osVersion")) {
                this.osVersion(model.getOsVersion());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
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

    /** The macAddress. */
    @com.fasterxml.jackson.annotation.JsonProperty("macAddress")
    private final String macAddress;

    /**
     * The macAddress.
     *
     * @return the value
     */
    public String getMacAddress() {
        return macAddress;
    }

    /** The macOrderId. */
    @com.fasterxml.jackson.annotation.JsonProperty("macOrderId")
    private final String macOrderId;

    /**
     * The macOrderId.
     *
     * @return the value
     */
    public String getMacOrderId() {
        return macOrderId;
    }

    /** The switchHostname. */
    @com.fasterxml.jackson.annotation.JsonProperty("switchHostname")
    private final String switchHostname;

    /**
     * The switchHostname.
     *
     * @return the value
     */
    public String getSwitchHostname() {
        return switchHostname;
    }

    /** The switchEthPort. */
    @com.fasterxml.jackson.annotation.JsonProperty("switchEthPort")
    private final String switchEthPort;

    /**
     * The switchEthPort.
     *
     * @return the value
     */
    public String getSwitchEthPort() {
        return switchEthPort;
    }

    /** The ipKvmHostname. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipKvmHostname")
    private final String ipKvmHostname;

    /**
     * The ipKvmHostname.
     *
     * @return the value
     */
    public String getIpKvmHostname() {
        return ipKvmHostname;
    }

    /** The ipKvmPortNumber. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipKvmPortNumber")
    private final Integer ipKvmPortNumber;

    /**
     * The ipKvmPortNumber.
     *
     * @return the value
     */
    public Integer getIpKvmPortNumber() {
        return ipKvmPortNumber;
    }

    /** The pduHostname. */
    @com.fasterxml.jackson.annotation.JsonProperty("pduHostname")
    private final String pduHostname;

    /**
     * The pduHostname.
     *
     * @return the value
     */
    public String getPduHostname() {
        return pduHostname;
    }

    /** The pduPort. */
    @com.fasterxml.jackson.annotation.JsonProperty("pduPort")
    private final Integer pduPort;

    /**
     * The pduPort.
     *
     * @return the value
     */
    public Integer getPduPort() {
        return pduPort;
    }

    /** The buildVlanId. */
    @com.fasterxml.jackson.annotation.JsonProperty("buildVlanId")
    private final Integer buildVlanId;

    /**
     * The buildVlanId.
     *
     * @return the value
     */
    public Integer getBuildVlanId() {
        return buildVlanId;
    }

    /** The buildIpAddress. */
    @com.fasterxml.jackson.annotation.JsonProperty("buildIpAddress")
    private final String buildIpAddress;

    /**
     * The buildIpAddress.
     *
     * @return the value
     */
    public String getBuildIpAddress() {
        return buildIpAddress;
    }

    /** The prodVlanId. */
    @com.fasterxml.jackson.annotation.JsonProperty("prodVlanId")
    private final Integer prodVlanId;

    /**
     * The prodVlanId.
     *
     * @return the value
     */
    public Integer getProdVlanId() {
        return prodVlanId;
    }

    /** The prodIpAddress. */
    @com.fasterxml.jackson.annotation.JsonProperty("prodIpAddress")
    private final String prodIpAddress;

    /**
     * The prodIpAddress.
     *
     * @return the value
     */
    public String getProdIpAddress() {
        return prodIpAddress;
    }

    /** The rackLocation. */
    @com.fasterxml.jackson.annotation.JsonProperty("rackLocation")
    private final String rackLocation;

    /**
     * The rackLocation.
     *
     * @return the value
     */
    public String getRackLocation() {
        return rackLocation;
    }

    /** The chipSetn. */
    @com.fasterxml.jackson.annotation.JsonProperty("chipSet")
    private final String chipSet;

    /**
     * The chipSetn.
     *
     * @return the value
     */
    public String getChipSet() {
        return chipSet;
    }

    /** The osVersion. */
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    private final String osVersion;

    /**
     * The osVersion.
     *
     * @return the value
     */
    public String getOsVersion() {
        return osVersion;
    }

    /** The tenancyId. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The tenancyId.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
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
        sb.append("UpdateNodeConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("macAddress=").append(String.valueOf(this.macAddress));
        sb.append(", macOrderId=").append(String.valueOf(this.macOrderId));
        sb.append(", switchHostname=").append(String.valueOf(this.switchHostname));
        sb.append(", switchEthPort=").append(String.valueOf(this.switchEthPort));
        sb.append(", ipKvmHostname=").append(String.valueOf(this.ipKvmHostname));
        sb.append(", ipKvmPortNumber=").append(String.valueOf(this.ipKvmPortNumber));
        sb.append(", pduHostname=").append(String.valueOf(this.pduHostname));
        sb.append(", pduPort=").append(String.valueOf(this.pduPort));
        sb.append(", buildVlanId=").append(String.valueOf(this.buildVlanId));
        sb.append(", buildIpAddress=").append(String.valueOf(this.buildIpAddress));
        sb.append(", prodVlanId=").append(String.valueOf(this.prodVlanId));
        sb.append(", prodIpAddress=").append(String.valueOf(this.prodIpAddress));
        sb.append(", rackLocation=").append(String.valueOf(this.rackLocation));
        sb.append(", chipSet=").append(String.valueOf(this.chipSet));
        sb.append(", osVersion=").append(String.valueOf(this.osVersion));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNodeConfigDetails)) {
            return false;
        }

        UpdateNodeConfigDetails other = (UpdateNodeConfigDetails) o;
        return java.util.Objects.equals(this.macAddress, other.macAddress)
                && java.util.Objects.equals(this.macOrderId, other.macOrderId)
                && java.util.Objects.equals(this.switchHostname, other.switchHostname)
                && java.util.Objects.equals(this.switchEthPort, other.switchEthPort)
                && java.util.Objects.equals(this.ipKvmHostname, other.ipKvmHostname)
                && java.util.Objects.equals(this.ipKvmPortNumber, other.ipKvmPortNumber)
                && java.util.Objects.equals(this.pduHostname, other.pduHostname)
                && java.util.Objects.equals(this.pduPort, other.pduPort)
                && java.util.Objects.equals(this.buildVlanId, other.buildVlanId)
                && java.util.Objects.equals(this.buildIpAddress, other.buildIpAddress)
                && java.util.Objects.equals(this.prodVlanId, other.prodVlanId)
                && java.util.Objects.equals(this.prodIpAddress, other.prodIpAddress)
                && java.util.Objects.equals(this.rackLocation, other.rackLocation)
                && java.util.Objects.equals(this.chipSet, other.chipSet)
                && java.util.Objects.equals(this.osVersion, other.osVersion)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.macAddress == null ? 43 : this.macAddress.hashCode());
        result = (result * PRIME) + (this.macOrderId == null ? 43 : this.macOrderId.hashCode());
        result =
                (result * PRIME)
                        + (this.switchHostname == null ? 43 : this.switchHostname.hashCode());
        result =
                (result * PRIME)
                        + (this.switchEthPort == null ? 43 : this.switchEthPort.hashCode());
        result =
                (result * PRIME)
                        + (this.ipKvmHostname == null ? 43 : this.ipKvmHostname.hashCode());
        result =
                (result * PRIME)
                        + (this.ipKvmPortNumber == null ? 43 : this.ipKvmPortNumber.hashCode());
        result = (result * PRIME) + (this.pduHostname == null ? 43 : this.pduHostname.hashCode());
        result = (result * PRIME) + (this.pduPort == null ? 43 : this.pduPort.hashCode());
        result = (result * PRIME) + (this.buildVlanId == null ? 43 : this.buildVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.buildIpAddress == null ? 43 : this.buildIpAddress.hashCode());
        result = (result * PRIME) + (this.prodVlanId == null ? 43 : this.prodVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.prodIpAddress == null ? 43 : this.prodIpAddress.hashCode());
        result = (result * PRIME) + (this.rackLocation == null ? 43 : this.rackLocation.hashCode());
        result = (result * PRIME) + (this.chipSet == null ? 43 : this.chipSet.hashCode());
        result = (result * PRIME) + (this.osVersion == null ? 43 : this.osVersion.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
