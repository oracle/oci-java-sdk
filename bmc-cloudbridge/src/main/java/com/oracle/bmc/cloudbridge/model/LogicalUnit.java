/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Logical unit of the host storage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LogicalUnit.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogicalUnit extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    public LogicalUnit(
            String address,
            Long discardMaxSizeInBytes,
            Boolean isDiscardZeroesData,
            String diskId,
            String id,
            Integer lunMapping,
            LunStatus lunStatus,
            String password,
            Integer paths,
            Integer port,
            String portal,
            String productId,
            String serial,
            Integer size,
            String storageDomainId,
            String target,
            String username,
            String vendorId,
            String volumeGroupId) {
        super();
        this.address = address;
        this.discardMaxSizeInBytes = discardMaxSizeInBytes;
        this.isDiscardZeroesData = isDiscardZeroesData;
        this.diskId = diskId;
        this.id = id;
        this.lunMapping = lunMapping;
        this.lunStatus = lunStatus;
        this.password = password != null ? password.toCharArray() : null;
        this.paths = paths;
        this.port = port;
        this.portal = portal;
        this.productId = productId;
        this.serial = serial;
        this.size = size;
        this.storageDomainId = storageDomainId;
        this.target = target;
        this.username = username;
        this.vendorId = vendorId;
        this.volumeGroupId = volumeGroupId;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "address",
        "discardMaxSizeInBytes",
        "isDiscardZeroesData",
        "diskId",
        "id",
        "lunMapping",
        "lunStatus",
        "password",
        "paths",
        "port",
        "portal",
        "productId",
        "serial",
        "size",
        "storageDomainId",
        "target",
        "username",
        "vendorId",
        "volumeGroupId"
    })
    public LogicalUnit(
            String address,
            Long discardMaxSizeInBytes,
            Boolean isDiscardZeroesData,
            String diskId,
            String id,
            Integer lunMapping,
            LunStatus lunStatus,
            char[] password,
            Integer paths,
            Integer port,
            String portal,
            String productId,
            String serial,
            Integer size,
            String storageDomainId,
            String target,
            String username,
            String vendorId,
            String volumeGroupId) {
        super();
        this.address = address;
        this.discardMaxSizeInBytes = discardMaxSizeInBytes;
        this.isDiscardZeroesData = isDiscardZeroesData;
        this.diskId = diskId;
        this.id = id;
        this.lunMapping = lunMapping;
        this.lunStatus = lunStatus;
        this.password = password;
        this.paths = paths;
        this.port = port;
        this.portal = portal;
        this.productId = productId;
        this.serial = serial;
        this.size = size;
        this.storageDomainId = storageDomainId;
        this.target = target;
        this.username = username;
        this.vendorId = vendorId;
        this.volumeGroupId = volumeGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Address of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * Address of the logical unit.
         * @param address the value to set
         * @return this builder
         **/
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /**
         * The maximum number of bytes that can be discarded by the logical unit\u2019s underlying storage in a single operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("discardMaxSizeInBytes")
        private Long discardMaxSizeInBytes;

        /**
         * The maximum number of bytes that can be discarded by the logical unit\u2019s underlying storage in a single operation.
         * @param discardMaxSizeInBytes the value to set
         * @return this builder
         **/
        public Builder discardMaxSizeInBytes(Long discardMaxSizeInBytes) {
            this.discardMaxSizeInBytes = discardMaxSizeInBytes;
            this.__explicitlySet__.add("discardMaxSizeInBytes");
            return this;
        }
        /**
         * True, if previously discarded blocks in the logical unit\u2019s underlying storage are read back as zeros.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDiscardZeroesData")
        private Boolean isDiscardZeroesData;

        /**
         * True, if previously discarded blocks in the logical unit\u2019s underlying storage are read back as zeros.
         * @param isDiscardZeroesData the value to set
         * @return this builder
         **/
        public Builder isDiscardZeroesData(Boolean isDiscardZeroesData) {
            this.isDiscardZeroesData = isDiscardZeroesData;
            this.__explicitlySet__.add("isDiscardZeroesData");
            return this;
        }
        /**
         * Disk ID of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskId")
        private String diskId;

        /**
         * Disk ID of the logical unit.
         * @param diskId the value to set
         * @return this builder
         **/
        public Builder diskId(String diskId) {
            this.diskId = diskId;
            this.__explicitlySet__.add("diskId");
            return this;
        }
        /**
         * a unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * a unique identifier.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * LUN Mapping
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lunMapping")
        private Integer lunMapping;

        /**
         * LUN Mapping
         * @param lunMapping the value to set
         * @return this builder
         **/
        public Builder lunMapping(Integer lunMapping) {
            this.lunMapping = lunMapping;
            this.__explicitlySet__.add("lunMapping");
            return this;
        }
        /**
         * LUN Status
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lunStatus")
        private LunStatus lunStatus;

        /**
         * LUN Status
         * @param lunStatus the value to set
         * @return this builder
         **/
        public Builder lunStatus(LunStatus lunStatus) {
            this.lunStatus = lunStatus;
            this.__explicitlySet__.add("lunStatus");
            return this;
        }
        /**
         * Password of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private char[] password;

        /**
         * Password of the logical unit.
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(char[] password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        public Builder password(String password) {
            this.password = password != null ? password.toCharArray() : null;
            this.__explicitlySet__.add("password");
            return this;
        }

        /**
         * Paths of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paths")
        private Integer paths;

        /**
         * Paths of the logical unit.
         * @param paths the value to set
         * @return this builder
         **/
        public Builder paths(Integer paths) {
            this.paths = paths;
            this.__explicitlySet__.add("paths");
            return this;
        }
        /**
         * Port of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port of the logical unit.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * Portal of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("portal")
        private String portal;

        /**
         * Portal of the logical unit.
         * @param portal the value to set
         * @return this builder
         **/
        public Builder portal(String portal) {
            this.portal = portal;
            this.__explicitlySet__.add("portal");
            return this;
        }
        /**
         * Product ID of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productId")
        private String productId;

        /**
         * Product ID of the logical unit.
         * @param productId the value to set
         * @return this builder
         **/
        public Builder productId(String productId) {
            this.productId = productId;
            this.__explicitlySet__.add("productId");
            return this;
        }
        /**
         * Serial of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serial")
        private String serial;

        /**
         * Serial of the logical unit.
         * @param serial the value to set
         * @return this builder
         **/
        public Builder serial(String serial) {
            this.serial = serial;
            this.__explicitlySet__.add("serial");
            return this;
        }
        /**
         * Size of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        /**
         * Size of the logical unit.
         * @param size the value to set
         * @return this builder
         **/
        public Builder size(Integer size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /**
         * Storage Domain ID of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageDomainId")
        private String storageDomainId;

        /**
         * Storage Domain ID of the logical unit.
         * @param storageDomainId the value to set
         * @return this builder
         **/
        public Builder storageDomainId(String storageDomainId) {
            this.storageDomainId = storageDomainId;
            this.__explicitlySet__.add("storageDomainId");
            return this;
        }
        /**
         * Target of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * Target of the logical unit.
         * @param target the value to set
         * @return this builder
         **/
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /**
         * Username of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * Username of the logical unit.
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * Vendor ID of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
        private String vendorId;

        /**
         * Vendor ID of the logical unit.
         * @param vendorId the value to set
         * @return this builder
         **/
        public Builder vendorId(String vendorId) {
            this.vendorId = vendorId;
            this.__explicitlySet__.add("vendorId");
            return this;
        }
        /**
         * Volume Group ID of the logical unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
        private String volumeGroupId;

        /**
         * Volume Group ID of the logical unit.
         * @param volumeGroupId the value to set
         * @return this builder
         **/
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            this.__explicitlySet__.add("volumeGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogicalUnit build() {
            LogicalUnit model =
                    new LogicalUnit(
                            this.address,
                            this.discardMaxSizeInBytes,
                            this.isDiscardZeroesData,
                            this.diskId,
                            this.id,
                            this.lunMapping,
                            this.lunStatus,
                            this.password,
                            this.paths,
                            this.port,
                            this.portal,
                            this.productId,
                            this.serial,
                            this.size,
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
        public Builder copy(LogicalUnit model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("discardMaxSizeInBytes")) {
                this.discardMaxSizeInBytes(model.getDiscardMaxSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("isDiscardZeroesData")) {
                this.isDiscardZeroesData(model.getIsDiscardZeroesData());
            }
            if (model.wasPropertyExplicitlySet("diskId")) {
                this.diskId(model.getDiskId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lunMapping")) {
                this.lunMapping(model.getLunMapping());
            }
            if (model.wasPropertyExplicitlySet("lunStatus")) {
                this.lunStatus(model.getLunStatus());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
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
            if (model.wasPropertyExplicitlySet("size")) {
                this.size(model.getSize());
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
     * Address of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * Address of the logical unit.
     * @return the value
     **/
    public String getAddress() {
        return address;
    }

    /**
     * The maximum number of bytes that can be discarded by the logical unit\u2019s underlying storage in a single operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discardMaxSizeInBytes")
    private final Long discardMaxSizeInBytes;

    /**
     * The maximum number of bytes that can be discarded by the logical unit\u2019s underlying storage in a single operation.
     * @return the value
     **/
    public Long getDiscardMaxSizeInBytes() {
        return discardMaxSizeInBytes;
    }

    /**
     * True, if previously discarded blocks in the logical unit\u2019s underlying storage are read back as zeros.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDiscardZeroesData")
    private final Boolean isDiscardZeroesData;

    /**
     * True, if previously discarded blocks in the logical unit\u2019s underlying storage are read back as zeros.
     * @return the value
     **/
    public Boolean getIsDiscardZeroesData() {
        return isDiscardZeroesData;
    }

    /**
     * Disk ID of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskId")
    private final String diskId;

    /**
     * Disk ID of the logical unit.
     * @return the value
     **/
    public String getDiskId() {
        return diskId;
    }

    /**
     * a unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * a unique identifier.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * LUN Mapping
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lunMapping")
    private final Integer lunMapping;

    /**
     * LUN Mapping
     * @return the value
     **/
    public Integer getLunMapping() {
        return lunMapping;
    }

    /**
     * LUN Status
     **/
    public enum LunStatus {
        Free("FREE"),
        Unusable("UNUSABLE"),
        Used("USED"),
        ;

        private final String value;
        private static java.util.Map<String, LunStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (LunStatus v : LunStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        LunStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LunStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LunStatus: " + key);
        }
    };
    /**
     * LUN Status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lunStatus")
    private final LunStatus lunStatus;

    /**
     * LUN Status
     * @return the value
     **/
    public LunStatus getLunStatus() {
        return lunStatus;
    }

    /**
     * Password of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final char[] password;

    /**
     * Password of the logical unit.
     * return the value
     * @Deprecated - Use getPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getPassword() {
        return password != null ? new String(password) : null;
    }

    /**
     * Password of the logical unit.
     * @return the value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    public char[] getPassword__AsCharArray() {
        return password;
    }

    /**
     * Paths of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paths")
    private final Integer paths;

    /**
     * Paths of the logical unit.
     * @return the value
     **/
    public Integer getPaths() {
        return paths;
    }

    /**
     * Port of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port of the logical unit.
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * Portal of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portal")
    private final String portal;

    /**
     * Portal of the logical unit.
     * @return the value
     **/
    public String getPortal() {
        return portal;
    }

    /**
     * Product ID of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productId")
    private final String productId;

    /**
     * Product ID of the logical unit.
     * @return the value
     **/
    public String getProductId() {
        return productId;
    }

    /**
     * Serial of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serial")
    private final String serial;

    /**
     * Serial of the logical unit.
     * @return the value
     **/
    public String getSerial() {
        return serial;
    }

    /**
     * Size of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Integer size;

    /**
     * Size of the logical unit.
     * @return the value
     **/
    public Integer getSize() {
        return size;
    }

    /**
     * Storage Domain ID of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageDomainId")
    private final String storageDomainId;

    /**
     * Storage Domain ID of the logical unit.
     * @return the value
     **/
    public String getStorageDomainId() {
        return storageDomainId;
    }

    /**
     * Target of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * Target of the logical unit.
     * @return the value
     **/
    public String getTarget() {
        return target;
    }

    /**
     * Username of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * Username of the logical unit.
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * Vendor ID of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
    private final String vendorId;

    /**
     * Vendor ID of the logical unit.
     * @return the value
     **/
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Volume Group ID of the logical unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
    private final String volumeGroupId;

    /**
     * Volume Group ID of the logical unit.
     * @return the value
     **/
    public String getVolumeGroupId() {
        return volumeGroupId;
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
        sb.append("LogicalUnit(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", discardMaxSizeInBytes=").append(String.valueOf(this.discardMaxSizeInBytes));
        sb.append(", isDiscardZeroesData=").append(String.valueOf(this.isDiscardZeroesData));
        sb.append(", diskId=").append(String.valueOf(this.diskId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lunMapping=").append(String.valueOf(this.lunMapping));
        sb.append(", lunStatus=").append(String.valueOf(this.lunStatus));
        sb.append(", password=").append("<redacted>");
        sb.append(", paths=").append(String.valueOf(this.paths));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", portal=").append(String.valueOf(this.portal));
        sb.append(", productId=").append(String.valueOf(this.productId));
        sb.append(", serial=").append(String.valueOf(this.serial));
        sb.append(", size=").append(String.valueOf(this.size));
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
        if (!(o instanceof LogicalUnit)) {
            return false;
        }

        LogicalUnit other = (LogicalUnit) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.discardMaxSizeInBytes, other.discardMaxSizeInBytes)
                && java.util.Objects.equals(this.isDiscardZeroesData, other.isDiscardZeroesData)
                && java.util.Objects.equals(this.diskId, other.diskId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lunMapping, other.lunMapping)
                && java.util.Objects.equals(this.lunStatus, other.lunStatus)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.paths, other.paths)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.portal, other.portal)
                && java.util.Objects.equals(this.productId, other.productId)
                && java.util.Objects.equals(this.serial, other.serial)
                && java.util.Objects.equals(this.size, other.size)
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
        result =
                (result * PRIME)
                        + (this.discardMaxSizeInBytes == null
                                ? 43
                                : this.discardMaxSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.isDiscardZeroesData == null
                                ? 43
                                : this.isDiscardZeroesData.hashCode());
        result = (result * PRIME) + (this.diskId == null ? 43 : this.diskId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.lunMapping == null ? 43 : this.lunMapping.hashCode());
        result = (result * PRIME) + (this.lunStatus == null ? 43 : this.lunStatus.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.paths == null ? 43 : this.paths.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.portal == null ? 43 : this.portal.hashCode());
        result = (result * PRIME) + (this.productId == null ? 43 : this.productId.hashCode());
        result = (result * PRIME) + (this.serial == null ? 43 : this.serial.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
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
