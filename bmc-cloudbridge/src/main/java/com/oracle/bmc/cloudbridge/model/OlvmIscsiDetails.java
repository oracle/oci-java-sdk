/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The host iSCSI details. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmIscsiDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmIscsiDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "address",
        "diskId",
        "initiator",
        "lunMapping",
        "paths",
        "port",
        "portal",
        "productId",
        "serial",
        "sizeInBytes",
        "status",
        "storageDomainId",
        "target",
        "username",
        "vendorId",
        "volumeGroupId"
    })
    public OlvmIscsiDetails(
            String address,
            String diskId,
            String initiator,
            Integer lunMapping,
            Integer paths,
            Integer port,
            String portal,
            String productId,
            String serial,
            Long sizeInBytes,
            String status,
            String storageDomainId,
            String target,
            String username,
            String vendorId,
            String volumeGroupId) {
        super();
        this.address = address;
        this.diskId = diskId;
        this.initiator = initiator;
        this.lunMapping = lunMapping;
        this.paths = paths;
        this.port = port;
        this.portal = portal;
        this.productId = productId;
        this.serial = serial;
        this.sizeInBytes = sizeInBytes;
        this.status = status;
        this.storageDomainId = storageDomainId;
        this.target = target;
        this.username = username;
        this.vendorId = vendorId;
        this.volumeGroupId = volumeGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Address of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * Address of iSCSI
         *
         * @param address the value to set
         * @return this builder
         */
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /** Disk ID of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("diskId")
        private String diskId;

        /**
         * Disk ID of iSCSI
         *
         * @param diskId the value to set
         * @return this builder
         */
        public Builder diskId(String diskId) {
            this.diskId = diskId;
            this.__explicitlySet__.add("diskId");
            return this;
        }
        /** Initiator of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("initiator")
        private String initiator;

        /**
         * Initiator of iSCSI
         *
         * @param initiator the value to set
         * @return this builder
         */
        public Builder initiator(String initiator) {
            this.initiator = initiator;
            this.__explicitlySet__.add("initiator");
            return this;
        }
        /** LUN Mapping of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("lunMapping")
        private Integer lunMapping;

        /**
         * LUN Mapping of iSCSI
         *
         * @param lunMapping the value to set
         * @return this builder
         */
        public Builder lunMapping(Integer lunMapping) {
            this.lunMapping = lunMapping;
            this.__explicitlySet__.add("lunMapping");
            return this;
        }
        /** Number of paths of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("paths")
        private Integer paths;

        /**
         * Number of paths of iSCSI
         *
         * @param paths the value to set
         * @return this builder
         */
        public Builder paths(Integer paths) {
            this.paths = paths;
            this.__explicitlySet__.add("paths");
            return this;
        }
        /** Port number of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port number of iSCSI
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Portal of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("portal")
        private String portal;

        /**
         * Portal of iSCSI
         *
         * @param portal the value to set
         * @return this builder
         */
        public Builder portal(String portal) {
            this.portal = portal;
            this.__explicitlySet__.add("portal");
            return this;
        }
        /** Product ID of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("productId")
        private String productId;

        /**
         * Product ID of iSCSI
         *
         * @param productId the value to set
         * @return this builder
         */
        public Builder productId(String productId) {
            this.productId = productId;
            this.__explicitlySet__.add("productId");
            return this;
        }
        /** Serial of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("serial")
        private String serial;

        /**
         * Serial of iSCSI
         *
         * @param serial the value to set
         * @return this builder
         */
        public Builder serial(String serial) {
            this.serial = serial;
            this.__explicitlySet__.add("serial");
            return this;
        }
        /** size of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * size of iSCSI
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /** Status of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Status of iSCSI
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Storage Domain ID of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("storageDomainId")
        private String storageDomainId;

        /**
         * Storage Domain ID of iSCSI
         *
         * @param storageDomainId the value to set
         * @return this builder
         */
        public Builder storageDomainId(String storageDomainId) {
            this.storageDomainId = storageDomainId;
            this.__explicitlySet__.add("storageDomainId");
            return this;
        }
        /** target of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * target of iSCSI
         *
         * @param target the value to set
         * @return this builder
         */
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /** Username of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * Username of iSCSI
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** Vendor ID of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
        private String vendorId;

        /**
         * Vendor ID of iSCSI
         *
         * @param vendorId the value to set
         * @return this builder
         */
        public Builder vendorId(String vendorId) {
            this.vendorId = vendorId;
            this.__explicitlySet__.add("vendorId");
            return this;
        }
        /** Volume Group ID of iSCSI */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
        private String volumeGroupId;

        /**
         * Volume Group ID of iSCSI
         *
         * @param volumeGroupId the value to set
         * @return this builder
         */
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            this.__explicitlySet__.add("volumeGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmIscsiDetails build() {
            OlvmIscsiDetails model =
                    new OlvmIscsiDetails(
                            this.address,
                            this.diskId,
                            this.initiator,
                            this.lunMapping,
                            this.paths,
                            this.port,
                            this.portal,
                            this.productId,
                            this.serial,
                            this.sizeInBytes,
                            this.status,
                            this.storageDomainId,
                            this.target,
                            this.username,
                            this.vendorId,
                            this.volumeGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmIscsiDetails model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("diskId")) {
                this.diskId(model.getDiskId());
            }
            if (model.wasPropertyExplicitlySet("initiator")) {
                this.initiator(model.getInitiator());
            }
            if (model.wasPropertyExplicitlySet("lunMapping")) {
                this.lunMapping(model.getLunMapping());
            }
            if (model.wasPropertyExplicitlySet("paths")) {
                this.paths(model.getPaths());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("portal")) {
                this.portal(model.getPortal());
            }
            if (model.wasPropertyExplicitlySet("productId")) {
                this.productId(model.getProductId());
            }
            if (model.wasPropertyExplicitlySet("serial")) {
                this.serial(model.getSerial());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("storageDomainId")) {
                this.storageDomainId(model.getStorageDomainId());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("vendorId")) {
                this.vendorId(model.getVendorId());
            }
            if (model.wasPropertyExplicitlySet("volumeGroupId")) {
                this.volumeGroupId(model.getVolumeGroupId());
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

    /** Address of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * Address of iSCSI
     *
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /** Disk ID of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("diskId")
    private final String diskId;

    /**
     * Disk ID of iSCSI
     *
     * @return the value
     */
    public String getDiskId() {
        return diskId;
    }

    /** Initiator of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("initiator")
    private final String initiator;

    /**
     * Initiator of iSCSI
     *
     * @return the value
     */
    public String getInitiator() {
        return initiator;
    }

    /** LUN Mapping of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("lunMapping")
    private final Integer lunMapping;

    /**
     * LUN Mapping of iSCSI
     *
     * @return the value
     */
    public Integer getLunMapping() {
        return lunMapping;
    }

    /** Number of paths of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("paths")
    private final Integer paths;

    /**
     * Number of paths of iSCSI
     *
     * @return the value
     */
    public Integer getPaths() {
        return paths;
    }

    /** Port number of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port number of iSCSI
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Portal of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("portal")
    private final String portal;

    /**
     * Portal of iSCSI
     *
     * @return the value
     */
    public String getPortal() {
        return portal;
    }

    /** Product ID of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("productId")
    private final String productId;

    /**
     * Product ID of iSCSI
     *
     * @return the value
     */
    public String getProductId() {
        return productId;
    }

    /** Serial of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("serial")
    private final String serial;

    /**
     * Serial of iSCSI
     *
     * @return the value
     */
    public String getSerial() {
        return serial;
    }

    /** size of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * size of iSCSI
     *
     * @return the value
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /** Status of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Status of iSCSI
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** Storage Domain ID of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("storageDomainId")
    private final String storageDomainId;

    /**
     * Storage Domain ID of iSCSI
     *
     * @return the value
     */
    public String getStorageDomainId() {
        return storageDomainId;
    }

    /** target of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * target of iSCSI
     *
     * @return the value
     */
    public String getTarget() {
        return target;
    }

    /** Username of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * Username of iSCSI
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** Vendor ID of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
    private final String vendorId;

    /**
     * Vendor ID of iSCSI
     *
     * @return the value
     */
    public String getVendorId() {
        return vendorId;
    }

    /** Volume Group ID of iSCSI */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
    private final String volumeGroupId;

    /**
     * Volume Group ID of iSCSI
     *
     * @return the value
     */
    public String getVolumeGroupId() {
        return volumeGroupId;
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
        sb.append("OlvmIscsiDetails(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", diskId=").append(String.valueOf(this.diskId));
        sb.append(", initiator=").append(String.valueOf(this.initiator));
        sb.append(", lunMapping=").append(String.valueOf(this.lunMapping));
        sb.append(", paths=").append(String.valueOf(this.paths));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", portal=").append(String.valueOf(this.portal));
        sb.append(", productId=").append(String.valueOf(this.productId));
        sb.append(", serial=").append(String.valueOf(this.serial));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", storageDomainId=").append(String.valueOf(this.storageDomainId));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", vendorId=").append(String.valueOf(this.vendorId));
        sb.append(", volumeGroupId=").append(String.valueOf(this.volumeGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmIscsiDetails)) {
            return false;
        }

        OlvmIscsiDetails other = (OlvmIscsiDetails) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.diskId, other.diskId)
                && java.util.Objects.equals(this.initiator, other.initiator)
                && java.util.Objects.equals(this.lunMapping, other.lunMapping)
                && java.util.Objects.equals(this.paths, other.paths)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.portal, other.portal)
                && java.util.Objects.equals(this.productId, other.productId)
                && java.util.Objects.equals(this.serial, other.serial)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.storageDomainId, other.storageDomainId)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.vendorId, other.vendorId)
                && java.util.Objects.equals(this.volumeGroupId, other.volumeGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.diskId == null ? 43 : this.diskId.hashCode());
        result = (result * PRIME) + (this.initiator == null ? 43 : this.initiator.hashCode());
        result = (result * PRIME) + (this.lunMapping == null ? 43 : this.lunMapping.hashCode());
        result = (result * PRIME) + (this.paths == null ? 43 : this.paths.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.portal == null ? 43 : this.portal.hashCode());
        result = (result * PRIME) + (this.productId == null ? 43 : this.productId.hashCode());
        result = (result * PRIME) + (this.serial == null ? 43 : this.serial.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.storageDomainId == null ? 43 : this.storageDomainId.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.vendorId == null ? 43 : this.vendorId.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupId == null ? 43 : this.volumeGroupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
