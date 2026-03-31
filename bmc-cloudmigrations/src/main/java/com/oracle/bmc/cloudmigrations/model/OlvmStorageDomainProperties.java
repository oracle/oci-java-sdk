/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * OLVM Storage Domain properties.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OlvmStorageDomainProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmStorageDomainProperties
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "storageDomainName",
        "storageDomainDescription",
        "comment",
        "availableSpaceInBytes",
        "usedSpaceInBytes",
        "committedSpaceInBytes",
        "blockSizeInBytes",
        "isBackup",
        "isPrimary",
        "isImport",
        "isDiscardAfterDelete",
        "isSupportDiscard",
        "isSupportDiscardZeroesData",
        "isWipeAfterDelete",
        "criticalSpaceActionBlockerInGBs",
        "warningLowSpaceIndicatorInPercentage",
        "externalStatus",
        "storageDomainStatus",
        "storage",
        "storageFormat",
        "storageDomainType",
        "dataCenters"
    })
    public OlvmStorageDomainProperties(
            String storageDomainName,
            String storageDomainDescription,
            String comment,
            Long availableSpaceInBytes,
            Long usedSpaceInBytes,
            Long committedSpaceInBytes,
            Long blockSizeInBytes,
            Boolean isBackup,
            Boolean isPrimary,
            Boolean isImport,
            Boolean isDiscardAfterDelete,
            Boolean isSupportDiscard,
            Boolean isSupportDiscardZeroesData,
            Boolean isWipeAfterDelete,
            Integer criticalSpaceActionBlockerInGBs,
            Integer warningLowSpaceIndicatorInPercentage,
            ExternalStatus externalStatus,
            StorageDomainStatus storageDomainStatus,
            Storage storage,
            StorageFormat storageFormat,
            StorageDomainType storageDomainType,
            java.util.List<OlvmDataCenter> dataCenters) {
        super();
        this.storageDomainName = storageDomainName;
        this.storageDomainDescription = storageDomainDescription;
        this.comment = comment;
        this.availableSpaceInBytes = availableSpaceInBytes;
        this.usedSpaceInBytes = usedSpaceInBytes;
        this.committedSpaceInBytes = committedSpaceInBytes;
        this.blockSizeInBytes = blockSizeInBytes;
        this.isBackup = isBackup;
        this.isPrimary = isPrimary;
        this.isImport = isImport;
        this.isDiscardAfterDelete = isDiscardAfterDelete;
        this.isSupportDiscard = isSupportDiscard;
        this.isSupportDiscardZeroesData = isSupportDiscardZeroesData;
        this.isWipeAfterDelete = isWipeAfterDelete;
        this.criticalSpaceActionBlockerInGBs = criticalSpaceActionBlockerInGBs;
        this.warningLowSpaceIndicatorInPercentage = warningLowSpaceIndicatorInPercentage;
        this.externalStatus = externalStatus;
        this.storageDomainStatus = storageDomainStatus;
        this.storage = storage;
        this.storageFormat = storageFormat;
        this.storageDomainType = storageDomainType;
        this.dataCenters = dataCenters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A human-readable name in plain text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageDomainName")
        private String storageDomainName;

        /**
         * A human-readable name in plain text.
         * @param storageDomainName the value to set
         * @return this builder
         **/
        public Builder storageDomainName(String storageDomainName) {
            this.storageDomainName = storageDomainName;
            this.__explicitlySet__.add("storageDomainName");
            return this;
        }
        /**
         * A human-readable description in plain text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageDomainDescription")
        private String storageDomainDescription;

        /**
         * A human-readable description in plain text.
         * @param storageDomainDescription the value to set
         * @return this builder
         **/
        public Builder storageDomainDescription(String storageDomainDescription) {
            this.storageDomainDescription = storageDomainDescription;
            this.__explicitlySet__.add("storageDomainDescription");
            return this;
        }
        /**
         * Free text containing comments about this object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Free text containing comments about this object.
         * @param comment the value to set
         * @return this builder
         **/
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /**
         * Space available in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableSpaceInBytes")
        private Long availableSpaceInBytes;

        /**
         * Space available in bytes.
         * @param availableSpaceInBytes the value to set
         * @return this builder
         **/
        public Builder availableSpaceInBytes(Long availableSpaceInBytes) {
            this.availableSpaceInBytes = availableSpaceInBytes;
            this.__explicitlySet__.add("availableSpaceInBytes");
            return this;
        }
        /**
         * Space used in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceInBytes")
        private Long usedSpaceInBytes;

        /**
         * Space used in bytes.
         * @param usedSpaceInBytes the value to set
         * @return this builder
         **/
        public Builder usedSpaceInBytes(Long usedSpaceInBytes) {
            this.usedSpaceInBytes = usedSpaceInBytes;
            this.__explicitlySet__.add("usedSpaceInBytes");
            return this;
        }
        /**
         * Space committed in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("committedSpaceInBytes")
        private Long committedSpaceInBytes;

        /**
         * Space committed in bytes.
         * @param committedSpaceInBytes the value to set
         * @return this builder
         **/
        public Builder committedSpaceInBytes(Long committedSpaceInBytes) {
            this.committedSpaceInBytes = committedSpaceInBytes;
            this.__explicitlySet__.add("committedSpaceInBytes");
            return this;
        }
        /**
         * Block size in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockSizeInBytes")
        private Long blockSizeInBytes;

        /**
         * Block size in bytes.
         * @param blockSizeInBytes the value to set
         * @return this builder
         **/
        public Builder blockSizeInBytes(Long blockSizeInBytes) {
            this.blockSizeInBytes = blockSizeInBytes;
            this.__explicitlySet__.add("blockSizeInBytes");
            return this;
        }
        /**
         * Whether a data storage domain is used as backup domain or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBackup")
        private Boolean isBackup;

        /**
         * Whether a data storage domain is used as backup domain or not.
         * @param isBackup the value to set
         * @return this builder
         **/
        public Builder isBackup(Boolean isBackup) {
            this.isBackup = isBackup;
            this.__explicitlySet__.add("isBackup");
            return this;
        }
        /**
         * Indicates if this is the primary (master) storage domain of a data center.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        /**
         * Indicates if this is the primary (master) storage domain of a data center.
         * @param isPrimary the value to set
         * @return this builder
         **/
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
            return this;
        }
        /**
         * Whether this storage domain is imported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isImport")
        private Boolean isImport;

        /**
         * Whether this storage domain is imported.
         * @param isImport the value to set
         * @return this builder
         **/
        public Builder isImport(Boolean isImport) {
            this.isImport = isImport;
            this.__explicitlySet__.add("isImport");
            return this;
        }
        /**
         * Indicates whether disks' blocks on block storage domains will be discarded right before they are deleted.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDiscardAfterDelete")
        private Boolean isDiscardAfterDelete;

        /**
         * Indicates whether disks' blocks on block storage domains will be discarded right before they are deleted.
         * @param isDiscardAfterDelete the value to set
         * @return this builder
         **/
        public Builder isDiscardAfterDelete(Boolean isDiscardAfterDelete) {
            this.isDiscardAfterDelete = isDiscardAfterDelete;
            this.__explicitlySet__.add("isDiscardAfterDelete");
            return this;
        }
        /**
         * Indicates whether a block storage domain supports discard operations
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSupportDiscard")
        private Boolean isSupportDiscard;

        /**
         * Indicates whether a block storage domain supports discard operations
         * @param isSupportDiscard the value to set
         * @return this builder
         **/
        public Builder isSupportDiscard(Boolean isSupportDiscard) {
            this.isSupportDiscard = isSupportDiscard;
            this.__explicitlySet__.add("isSupportDiscard");
            return this;
        }
        /**
         * Indicates whether a block storage domain supports the property that discard zeroes the data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSupportDiscardZeroesData")
        private Boolean isSupportDiscardZeroesData;

        /**
         * Indicates whether a block storage domain supports the property that discard zeroes the data.
         * @param isSupportDiscardZeroesData the value to set
         * @return this builder
         **/
        public Builder isSupportDiscardZeroesData(Boolean isSupportDiscardZeroesData) {
            this.isSupportDiscardZeroesData = isSupportDiscardZeroesData;
            this.__explicitlySet__.add("isSupportDiscardZeroesData");
            return this;
        }
        /**
         * Serves as the default value of wipe_after_delete for disks on this storage domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isWipeAfterDelete")
        private Boolean isWipeAfterDelete;

        /**
         * Serves as the default value of wipe_after_delete for disks on this storage domain.
         * @param isWipeAfterDelete the value to set
         * @return this builder
         **/
        public Builder isWipeAfterDelete(Boolean isWipeAfterDelete) {
            this.isWipeAfterDelete = isWipeAfterDelete;
            this.__explicitlySet__.add("isWipeAfterDelete");
            return this;
        }
        /**
         * Ensure storage domain always has at least this amount of unoccupied space in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("criticalSpaceActionBlockerInGBs")
        private Integer criticalSpaceActionBlockerInGBs;

        /**
         * Ensure storage domain always has at least this amount of unoccupied space in GBs.
         * @param criticalSpaceActionBlockerInGBs the value to set
         * @return this builder
         **/
        public Builder criticalSpaceActionBlockerInGBs(Integer criticalSpaceActionBlockerInGBs) {
            this.criticalSpaceActionBlockerInGBs = criticalSpaceActionBlockerInGBs;
            this.__explicitlySet__.add("criticalSpaceActionBlockerInGBs");
            return this;
        }
        /**
         * If the free space available on the storage domain is below this percentage, warning messages are displayed to the user and logged.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("warningLowSpaceIndicatorInPercentage")
        private Integer warningLowSpaceIndicatorInPercentage;

        /**
         * If the free space available on the storage domain is below this percentage, warning messages are displayed to the user and logged.
         * @param warningLowSpaceIndicatorInPercentage the value to set
         * @return this builder
         **/
        public Builder warningLowSpaceIndicatorInPercentage(
                Integer warningLowSpaceIndicatorInPercentage) {
            this.warningLowSpaceIndicatorInPercentage = warningLowSpaceIndicatorInPercentage;
            this.__explicitlySet__.add("warningLowSpaceIndicatorInPercentage");
            return this;
        }
        /**
         * Status of storage domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalStatus")
        private ExternalStatus externalStatus;

        /**
         * Status of storage domain.
         * @param externalStatus the value to set
         * @return this builder
         **/
        public Builder externalStatus(ExternalStatus externalStatus) {
            this.externalStatus = externalStatus;
            this.__explicitlySet__.add("externalStatus");
            return this;
        }
        /**
         * Status of storage domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageDomainStatus")
        private StorageDomainStatus storageDomainStatus;

        /**
         * Status of storage domain.
         * @param storageDomainStatus the value to set
         * @return this builder
         **/
        public Builder storageDomainStatus(StorageDomainStatus storageDomainStatus) {
            this.storageDomainStatus = storageDomainStatus;
            this.__explicitlySet__.add("storageDomainStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storage")
        private Storage storage;

        public Builder storage(Storage storage) {
            this.storage = storage;
            this.__explicitlySet__.add("storage");
            return this;
        }
        /**
         * Type which represents a format of storage domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageFormat")
        private StorageFormat storageFormat;

        /**
         * Type which represents a format of storage domain.
         * @param storageFormat the value to set
         * @return this builder
         **/
        public Builder storageFormat(StorageFormat storageFormat) {
            this.storageFormat = storageFormat;
            this.__explicitlySet__.add("storageFormat");
            return this;
        }
        /**
         * Indicates the kind of data managed by a storage domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageDomainType")
        private StorageDomainType storageDomainType;

        /**
         * Indicates the kind of data managed by a storage domain.
         * @param storageDomainType the value to set
         * @return this builder
         **/
        public Builder storageDomainType(StorageDomainType storageDomainType) {
            this.storageDomainType = storageDomainType;
            this.__explicitlySet__.add("storageDomainType");
            return this;
        }
        /**
         * List of data centers where storage domain belongs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenters")
        private java.util.List<OlvmDataCenter> dataCenters;

        /**
         * List of data centers where storage domain belongs
         * @param dataCenters the value to set
         * @return this builder
         **/
        public Builder dataCenters(java.util.List<OlvmDataCenter> dataCenters) {
            this.dataCenters = dataCenters;
            this.__explicitlySet__.add("dataCenters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmStorageDomainProperties build() {
            OlvmStorageDomainProperties model =
                    new OlvmStorageDomainProperties(
                            this.storageDomainName,
                            this.storageDomainDescription,
                            this.comment,
                            this.availableSpaceInBytes,
                            this.usedSpaceInBytes,
                            this.committedSpaceInBytes,
                            this.blockSizeInBytes,
                            this.isBackup,
                            this.isPrimary,
                            this.isImport,
                            this.isDiscardAfterDelete,
                            this.isSupportDiscard,
                            this.isSupportDiscardZeroesData,
                            this.isWipeAfterDelete,
                            this.criticalSpaceActionBlockerInGBs,
                            this.warningLowSpaceIndicatorInPercentage,
                            this.externalStatus,
                            this.storageDomainStatus,
                            this.storage,
                            this.storageFormat,
                            this.storageDomainType,
                            this.dataCenters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmStorageDomainProperties model) {
            if (model.wasPropertyExplicitlySet("storageDomainName")) {
                this.storageDomainName(model.getStorageDomainName());
            }
            if (model.wasPropertyExplicitlySet("storageDomainDescription")) {
                this.storageDomainDescription(model.getStorageDomainDescription());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("availableSpaceInBytes")) {
                this.availableSpaceInBytes(model.getAvailableSpaceInBytes());
            }
            if (model.wasPropertyExplicitlySet("usedSpaceInBytes")) {
                this.usedSpaceInBytes(model.getUsedSpaceInBytes());
            }
            if (model.wasPropertyExplicitlySet("committedSpaceInBytes")) {
                this.committedSpaceInBytes(model.getCommittedSpaceInBytes());
            }
            if (model.wasPropertyExplicitlySet("blockSizeInBytes")) {
                this.blockSizeInBytes(model.getBlockSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("isBackup")) {
                this.isBackup(model.getIsBackup());
            }
            if (model.wasPropertyExplicitlySet("isPrimary")) {
                this.isPrimary(model.getIsPrimary());
            }
            if (model.wasPropertyExplicitlySet("isImport")) {
                this.isImport(model.getIsImport());
            }
            if (model.wasPropertyExplicitlySet("isDiscardAfterDelete")) {
                this.isDiscardAfterDelete(model.getIsDiscardAfterDelete());
            }
            if (model.wasPropertyExplicitlySet("isSupportDiscard")) {
                this.isSupportDiscard(model.getIsSupportDiscard());
            }
            if (model.wasPropertyExplicitlySet("isSupportDiscardZeroesData")) {
                this.isSupportDiscardZeroesData(model.getIsSupportDiscardZeroesData());
            }
            if (model.wasPropertyExplicitlySet("isWipeAfterDelete")) {
                this.isWipeAfterDelete(model.getIsWipeAfterDelete());
            }
            if (model.wasPropertyExplicitlySet("criticalSpaceActionBlockerInGBs")) {
                this.criticalSpaceActionBlockerInGBs(model.getCriticalSpaceActionBlockerInGBs());
            }
            if (model.wasPropertyExplicitlySet("warningLowSpaceIndicatorInPercentage")) {
                this.warningLowSpaceIndicatorInPercentage(
                        model.getWarningLowSpaceIndicatorInPercentage());
            }
            if (model.wasPropertyExplicitlySet("externalStatus")) {
                this.externalStatus(model.getExternalStatus());
            }
            if (model.wasPropertyExplicitlySet("storageDomainStatus")) {
                this.storageDomainStatus(model.getStorageDomainStatus());
            }
            if (model.wasPropertyExplicitlySet("storage")) {
                this.storage(model.getStorage());
            }
            if (model.wasPropertyExplicitlySet("storageFormat")) {
                this.storageFormat(model.getStorageFormat());
            }
            if (model.wasPropertyExplicitlySet("storageDomainType")) {
                this.storageDomainType(model.getStorageDomainType());
            }
            if (model.wasPropertyExplicitlySet("dataCenters")) {
                this.dataCenters(model.getDataCenters());
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
     * A human-readable name in plain text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageDomainName")
    private final String storageDomainName;

    /**
     * A human-readable name in plain text.
     * @return the value
     **/
    public String getStorageDomainName() {
        return storageDomainName;
    }

    /**
     * A human-readable description in plain text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageDomainDescription")
    private final String storageDomainDescription;

    /**
     * A human-readable description in plain text.
     * @return the value
     **/
    public String getStorageDomainDescription() {
        return storageDomainDescription;
    }

    /**
     * Free text containing comments about this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Free text containing comments about this object.
     * @return the value
     **/
    public String getComment() {
        return comment;
    }

    /**
     * Space available in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableSpaceInBytes")
    private final Long availableSpaceInBytes;

    /**
     * Space available in bytes.
     * @return the value
     **/
    public Long getAvailableSpaceInBytes() {
        return availableSpaceInBytes;
    }

    /**
     * Space used in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceInBytes")
    private final Long usedSpaceInBytes;

    /**
     * Space used in bytes.
     * @return the value
     **/
    public Long getUsedSpaceInBytes() {
        return usedSpaceInBytes;
    }

    /**
     * Space committed in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("committedSpaceInBytes")
    private final Long committedSpaceInBytes;

    /**
     * Space committed in bytes.
     * @return the value
     **/
    public Long getCommittedSpaceInBytes() {
        return committedSpaceInBytes;
    }

    /**
     * Block size in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockSizeInBytes")
    private final Long blockSizeInBytes;

    /**
     * Block size in bytes.
     * @return the value
     **/
    public Long getBlockSizeInBytes() {
        return blockSizeInBytes;
    }

    /**
     * Whether a data storage domain is used as backup domain or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBackup")
    private final Boolean isBackup;

    /**
     * Whether a data storage domain is used as backup domain or not.
     * @return the value
     **/
    public Boolean getIsBackup() {
        return isBackup;
    }

    /**
     * Indicates if this is the primary (master) storage domain of a data center.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    private final Boolean isPrimary;

    /**
     * Indicates if this is the primary (master) storage domain of a data center.
     * @return the value
     **/
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Whether this storage domain is imported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isImport")
    private final Boolean isImport;

    /**
     * Whether this storage domain is imported.
     * @return the value
     **/
    public Boolean getIsImport() {
        return isImport;
    }

    /**
     * Indicates whether disks' blocks on block storage domains will be discarded right before they are deleted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDiscardAfterDelete")
    private final Boolean isDiscardAfterDelete;

    /**
     * Indicates whether disks' blocks on block storage domains will be discarded right before they are deleted.
     * @return the value
     **/
    public Boolean getIsDiscardAfterDelete() {
        return isDiscardAfterDelete;
    }

    /**
     * Indicates whether a block storage domain supports discard operations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSupportDiscard")
    private final Boolean isSupportDiscard;

    /**
     * Indicates whether a block storage domain supports discard operations
     * @return the value
     **/
    public Boolean getIsSupportDiscard() {
        return isSupportDiscard;
    }

    /**
     * Indicates whether a block storage domain supports the property that discard zeroes the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSupportDiscardZeroesData")
    private final Boolean isSupportDiscardZeroesData;

    /**
     * Indicates whether a block storage domain supports the property that discard zeroes the data.
     * @return the value
     **/
    public Boolean getIsSupportDiscardZeroesData() {
        return isSupportDiscardZeroesData;
    }

    /**
     * Serves as the default value of wipe_after_delete for disks on this storage domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isWipeAfterDelete")
    private final Boolean isWipeAfterDelete;

    /**
     * Serves as the default value of wipe_after_delete for disks on this storage domain.
     * @return the value
     **/
    public Boolean getIsWipeAfterDelete() {
        return isWipeAfterDelete;
    }

    /**
     * Ensure storage domain always has at least this amount of unoccupied space in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("criticalSpaceActionBlockerInGBs")
    private final Integer criticalSpaceActionBlockerInGBs;

    /**
     * Ensure storage domain always has at least this amount of unoccupied space in GBs.
     * @return the value
     **/
    public Integer getCriticalSpaceActionBlockerInGBs() {
        return criticalSpaceActionBlockerInGBs;
    }

    /**
     * If the free space available on the storage domain is below this percentage, warning messages are displayed to the user and logged.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningLowSpaceIndicatorInPercentage")
    private final Integer warningLowSpaceIndicatorInPercentage;

    /**
     * If the free space available on the storage domain is below this percentage, warning messages are displayed to the user and logged.
     * @return the value
     **/
    public Integer getWarningLowSpaceIndicatorInPercentage() {
        return warningLowSpaceIndicatorInPercentage;
    }

    /**
     * Status of storage domain.
     **/
    public enum ExternalStatus {
        Error("ERROR"),
        Failure("FAILURE"),
        Info("INFO"),
        Ok("OK"),
        Warning("WARNING"),
        ;

        private final String value;
        private static java.util.Map<String, ExternalStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ExternalStatus v : ExternalStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        ExternalStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExternalStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ExternalStatus: " + key);
        }
    };
    /**
     * Status of storage domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalStatus")
    private final ExternalStatus externalStatus;

    /**
     * Status of storage domain.
     * @return the value
     **/
    public ExternalStatus getExternalStatus() {
        return externalStatus;
    }

    /**
     * Status of storage domain.
     **/
    public enum StorageDomainStatus {
        Activating("ACTIVATING"),
        Active("ACTIVE"),
        Detaching("DETACHING"),
        Inactive("INACTIVE"),
        Locked("LOCKED"),
        Maintenance("MAINTENANCE"),
        Mixed("MIXED"),
        PreparingForMaintenance("PREPARING_FOR_MAINTENANCE"),
        Unattached("UNATTACHED"),
        Unknown("UNKNOWN"),
        ;

        private final String value;
        private static java.util.Map<String, StorageDomainStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageDomainStatus v : StorageDomainStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageDomainStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageDomainStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StorageDomainStatus: " + key);
        }
    };
    /**
     * Status of storage domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageDomainStatus")
    private final StorageDomainStatus storageDomainStatus;

    /**
     * Status of storage domain.
     * @return the value
     **/
    public StorageDomainStatus getStorageDomainStatus() {
        return storageDomainStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    private final Storage storage;

    public Storage getStorage() {
        return storage;
    }

    /**
     * Type which represents a format of storage domain.
     **/
    public enum StorageFormat {
        V1("V1"),
        V2("V2"),
        V3("V3"),
        V4("V4"),
        V5("V5"),
        ;

        private final String value;
        private static java.util.Map<String, StorageFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageFormat v : StorageFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StorageFormat: " + key);
        }
    };
    /**
     * Type which represents a format of storage domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageFormat")
    private final StorageFormat storageFormat;

    /**
     * Type which represents a format of storage domain.
     * @return the value
     **/
    public StorageFormat getStorageFormat() {
        return storageFormat;
    }

    /**
     * Indicates the kind of data managed by a storage domain.
     **/
    public enum StorageDomainType {
        Data("DATA"),
        Export("EXPORT"),
        Image("IMAGE"),
        Iso("ISO"),
        ManagedBlockStorage("MANAGED_BLOCK_STORAGE"),
        Volume("VOLUME"),
        ;

        private final String value;
        private static java.util.Map<String, StorageDomainType> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageDomainType v : StorageDomainType.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageDomainType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageDomainType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StorageDomainType: " + key);
        }
    };
    /**
     * Indicates the kind of data managed by a storage domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageDomainType")
    private final StorageDomainType storageDomainType;

    /**
     * Indicates the kind of data managed by a storage domain.
     * @return the value
     **/
    public StorageDomainType getStorageDomainType() {
        return storageDomainType;
    }

    /**
     * List of data centers where storage domain belongs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenters")
    private final java.util.List<OlvmDataCenter> dataCenters;

    /**
     * List of data centers where storage domain belongs
     * @return the value
     **/
    public java.util.List<OlvmDataCenter> getDataCenters() {
        return dataCenters;
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
        sb.append("OlvmStorageDomainProperties(");
        sb.append("super=").append(super.toString());
        sb.append("storageDomainName=").append(String.valueOf(this.storageDomainName));
        sb.append(", storageDomainDescription=")
                .append(String.valueOf(this.storageDomainDescription));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", availableSpaceInBytes=").append(String.valueOf(this.availableSpaceInBytes));
        sb.append(", usedSpaceInBytes=").append(String.valueOf(this.usedSpaceInBytes));
        sb.append(", committedSpaceInBytes=").append(String.valueOf(this.committedSpaceInBytes));
        sb.append(", blockSizeInBytes=").append(String.valueOf(this.blockSizeInBytes));
        sb.append(", isBackup=").append(String.valueOf(this.isBackup));
        sb.append(", isPrimary=").append(String.valueOf(this.isPrimary));
        sb.append(", isImport=").append(String.valueOf(this.isImport));
        sb.append(", isDiscardAfterDelete=").append(String.valueOf(this.isDiscardAfterDelete));
        sb.append(", isSupportDiscard=").append(String.valueOf(this.isSupportDiscard));
        sb.append(", isSupportDiscardZeroesData=")
                .append(String.valueOf(this.isSupportDiscardZeroesData));
        sb.append(", isWipeAfterDelete=").append(String.valueOf(this.isWipeAfterDelete));
        sb.append(", criticalSpaceActionBlockerInGBs=")
                .append(String.valueOf(this.criticalSpaceActionBlockerInGBs));
        sb.append(", warningLowSpaceIndicatorInPercentage=")
                .append(String.valueOf(this.warningLowSpaceIndicatorInPercentage));
        sb.append(", externalStatus=").append(String.valueOf(this.externalStatus));
        sb.append(", storageDomainStatus=").append(String.valueOf(this.storageDomainStatus));
        sb.append(", storage=").append(String.valueOf(this.storage));
        sb.append(", storageFormat=").append(String.valueOf(this.storageFormat));
        sb.append(", storageDomainType=").append(String.valueOf(this.storageDomainType));
        sb.append(", dataCenters=").append(String.valueOf(this.dataCenters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmStorageDomainProperties)) {
            return false;
        }

        OlvmStorageDomainProperties other = (OlvmStorageDomainProperties) o;
        return java.util.Objects.equals(this.storageDomainName, other.storageDomainName)
                && java.util.Objects.equals(
                        this.storageDomainDescription, other.storageDomainDescription)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.availableSpaceInBytes, other.availableSpaceInBytes)
                && java.util.Objects.equals(this.usedSpaceInBytes, other.usedSpaceInBytes)
                && java.util.Objects.equals(this.committedSpaceInBytes, other.committedSpaceInBytes)
                && java.util.Objects.equals(this.blockSizeInBytes, other.blockSizeInBytes)
                && java.util.Objects.equals(this.isBackup, other.isBackup)
                && java.util.Objects.equals(this.isPrimary, other.isPrimary)
                && java.util.Objects.equals(this.isImport, other.isImport)
                && java.util.Objects.equals(this.isDiscardAfterDelete, other.isDiscardAfterDelete)
                && java.util.Objects.equals(this.isSupportDiscard, other.isSupportDiscard)
                && java.util.Objects.equals(
                        this.isSupportDiscardZeroesData, other.isSupportDiscardZeroesData)
                && java.util.Objects.equals(this.isWipeAfterDelete, other.isWipeAfterDelete)
                && java.util.Objects.equals(
                        this.criticalSpaceActionBlockerInGBs, other.criticalSpaceActionBlockerInGBs)
                && java.util.Objects.equals(
                        this.warningLowSpaceIndicatorInPercentage,
                        other.warningLowSpaceIndicatorInPercentage)
                && java.util.Objects.equals(this.externalStatus, other.externalStatus)
                && java.util.Objects.equals(this.storageDomainStatus, other.storageDomainStatus)
                && java.util.Objects.equals(this.storage, other.storage)
                && java.util.Objects.equals(this.storageFormat, other.storageFormat)
                && java.util.Objects.equals(this.storageDomainType, other.storageDomainType)
                && java.util.Objects.equals(this.dataCenters, other.dataCenters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.storageDomainName == null ? 43 : this.storageDomainName.hashCode());
        result =
                (result * PRIME)
                        + (this.storageDomainDescription == null
                                ? 43
                                : this.storageDomainDescription.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result =
                (result * PRIME)
                        + (this.availableSpaceInBytes == null
                                ? 43
                                : this.availableSpaceInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.usedSpaceInBytes == null ? 43 : this.usedSpaceInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.committedSpaceInBytes == null
                                ? 43
                                : this.committedSpaceInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.blockSizeInBytes == null ? 43 : this.blockSizeInBytes.hashCode());
        result = (result * PRIME) + (this.isBackup == null ? 43 : this.isBackup.hashCode());
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result = (result * PRIME) + (this.isImport == null ? 43 : this.isImport.hashCode());
        result =
                (result * PRIME)
                        + (this.isDiscardAfterDelete == null
                                ? 43
                                : this.isDiscardAfterDelete.hashCode());
        result =
                (result * PRIME)
                        + (this.isSupportDiscard == null ? 43 : this.isSupportDiscard.hashCode());
        result =
                (result * PRIME)
                        + (this.isSupportDiscardZeroesData == null
                                ? 43
                                : this.isSupportDiscardZeroesData.hashCode());
        result =
                (result * PRIME)
                        + (this.isWipeAfterDelete == null ? 43 : this.isWipeAfterDelete.hashCode());
        result =
                (result * PRIME)
                        + (this.criticalSpaceActionBlockerInGBs == null
                                ? 43
                                : this.criticalSpaceActionBlockerInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.warningLowSpaceIndicatorInPercentage == null
                                ? 43
                                : this.warningLowSpaceIndicatorInPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.externalStatus == null ? 43 : this.externalStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.storageDomainStatus == null
                                ? 43
                                : this.storageDomainStatus.hashCode());
        result = (result * PRIME) + (this.storage == null ? 43 : this.storage.hashCode());
        result =
                (result * PRIME)
                        + (this.storageFormat == null ? 43 : this.storageFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.storageDomainType == null ? 43 : this.storageDomainType.hashCode());
        result = (result * PRIME) + (this.dataCenters == null ? 43 : this.dataCenters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
