/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of one backup set observed for a crypto assessment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CryptoAssessmentBackupSetSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CryptoAssessmentBackupSetSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assessmentId",
        "timeLastAssessed",
        "targetId",
        "backupSetKey",
        "setStamp",
        "backupType",
        "status",
        "backupPieces",
        "isEncrypted",
        "algorithmObserved",
        "cipherModeObserved",
        "isCompressed",
        "timeCreated",
        "sizeInGBs"
    })
    public CryptoAssessmentBackupSetSummary(
            String assessmentId,
            java.util.Date timeLastAssessed,
            String targetId,
            String backupSetKey,
            String setStamp,
            BackupType backupType,
            Status status,
            Integer backupPieces,
            Boolean isEncrypted,
            String algorithmObserved,
            String cipherModeObserved,
            Boolean isCompressed,
            java.util.Date timeCreated,
            Double sizeInGBs) {
        super();
        this.assessmentId = assessmentId;
        this.timeLastAssessed = timeLastAssessed;
        this.targetId = targetId;
        this.backupSetKey = backupSetKey;
        this.setStamp = setStamp;
        this.backupType = backupType;
        this.status = status;
        this.backupPieces = backupPieces;
        this.isEncrypted = isEncrypted;
        this.algorithmObserved = algorithmObserved;
        this.cipherModeObserved = cipherModeObserved;
        this.isCompressed = isCompressed;
        this.timeCreated = timeCreated;
        this.sizeInGBs = sizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the crypto assessment that discovered the backup set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * OCID of the crypto assessment that discovered the backup set.
         * @param assessmentId the value to set
         * @return this builder
         **/
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            this.__explicitlySet__.add("assessmentId");
            return this;
        }
        /**
         * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
        private java.util.Date timeLastAssessed;

        /**
         * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
         * @param timeLastAssessed the value to set
         * @return this builder
         **/
        public Builder timeLastAssessed(java.util.Date timeLastAssessed) {
            this.timeLastAssessed = timeLastAssessed;
            this.__explicitlySet__.add("timeLastAssessed");
            return this;
        }
        /**
         * OCID of the target database associated with the backup set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * OCID of the target database associated with the backup set.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Backup set key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupSetKey")
        private String backupSetKey;

        /**
         * Backup set key.
         * @param backupSetKey the value to set
         * @return this builder
         **/
        public Builder backupSetKey(String backupSetKey) {
            this.backupSetKey = backupSetKey;
            this.__explicitlySet__.add("backupSetKey");
            return this;
        }
        /**
         * Backup set stamp.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("setStamp")
        private String setStamp;

        /**
         * Backup set stamp.
         * @param setStamp the value to set
         * @return this builder
         **/
        public Builder setStamp(String setStamp) {
            this.setStamp = setStamp;
            this.__explicitlySet__.add("setStamp");
            return this;
        }
        /**
         * Backup type observed for the set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private BackupType backupType;

        /**
         * Backup type observed for the set.
         * @param backupType the value to set
         * @return this builder
         **/
        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /**
         * Current status of the backup set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Current status of the backup set.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Number of backup pieces in the set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupPieces")
        private Integer backupPieces;

        /**
         * Number of backup pieces in the set.
         * @param backupPieces the value to set
         * @return this builder
         **/
        public Builder backupPieces(Integer backupPieces) {
            this.backupPieces = backupPieces;
            this.__explicitlySet__.add("backupPieces");
            return this;
        }
        /**
         * Indicates whether the backup set is encrypted.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
        private Boolean isEncrypted;

        /**
         * Indicates whether the backup set is encrypted.
         * @param isEncrypted the value to set
         * @return this builder
         **/
        public Builder isEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            this.__explicitlySet__.add("isEncrypted");
            return this;
        }
        /**
         * Encryption algorithm observed for the backup set when encryption is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("algorithmObserved")
        private String algorithmObserved;

        /**
         * Encryption algorithm observed for the backup set when encryption is enabled.
         * @param algorithmObserved the value to set
         * @return this builder
         **/
        public Builder algorithmObserved(String algorithmObserved) {
            this.algorithmObserved = algorithmObserved;
            this.__explicitlySet__.add("algorithmObserved");
            return this;
        }
        /**
         * Cipher mode observed for the backup set when encryption is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cipherModeObserved")
        private String cipherModeObserved;

        /**
         * Cipher mode observed for the backup set when encryption is enabled.
         * @param cipherModeObserved the value to set
         * @return this builder
         **/
        public Builder cipherModeObserved(String cipherModeObserved) {
            this.cipherModeObserved = cipherModeObserved;
            this.__explicitlySet__.add("cipherModeObserved");
            return this;
        }
        /**
         * Indicates whether the backup set is compressed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCompressed")
        private Boolean isCompressed;

        /**
         * Indicates whether the backup set is compressed.
         * @param isCompressed the value to set
         * @return this builder
         **/
        public Builder isCompressed(Boolean isCompressed) {
            this.isCompressed = isCompressed;
            this.__explicitlySet__.add("isCompressed");
            return this;
        }
        /**
         * Backup set creation time in RFC3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Backup set creation time in RFC3339 format.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Backup set size in gigabytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Double sizeInGBs;

        /**
         * Backup set size in gigabytes.
         * @param sizeInGBs the value to set
         * @return this builder
         **/
        public Builder sizeInGBs(Double sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentBackupSetSummary build() {
            CryptoAssessmentBackupSetSummary model =
                    new CryptoAssessmentBackupSetSummary(
                            this.assessmentId,
                            this.timeLastAssessed,
                            this.targetId,
                            this.backupSetKey,
                            this.setStamp,
                            this.backupType,
                            this.status,
                            this.backupPieces,
                            this.isEncrypted,
                            this.algorithmObserved,
                            this.cipherModeObserved,
                            this.isCompressed,
                            this.timeCreated,
                            this.sizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentBackupSetSummary model) {
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("timeLastAssessed")) {
                this.timeLastAssessed(model.getTimeLastAssessed());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("backupSetKey")) {
                this.backupSetKey(model.getBackupSetKey());
            }
            if (model.wasPropertyExplicitlySet("setStamp")) {
                this.setStamp(model.getSetStamp());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("backupPieces")) {
                this.backupPieces(model.getBackupPieces());
            }
            if (model.wasPropertyExplicitlySet("isEncrypted")) {
                this.isEncrypted(model.getIsEncrypted());
            }
            if (model.wasPropertyExplicitlySet("algorithmObserved")) {
                this.algorithmObserved(model.getAlgorithmObserved());
            }
            if (model.wasPropertyExplicitlySet("cipherModeObserved")) {
                this.cipherModeObserved(model.getCipherModeObserved());
            }
            if (model.wasPropertyExplicitlySet("isCompressed")) {
                this.isCompressed(model.getIsCompressed());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
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
     * OCID of the crypto assessment that discovered the backup set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * OCID of the crypto assessment that discovered the backup set.
     * @return the value
     **/
    public String getAssessmentId() {
        return assessmentId;
    }

    /**
     * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
    private final java.util.Date timeLastAssessed;

    /**
     * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
     * @return the value
     **/
    public java.util.Date getTimeLastAssessed() {
        return timeLastAssessed;
    }

    /**
     * OCID of the target database associated with the backup set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * OCID of the target database associated with the backup set.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * Backup set key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupSetKey")
    private final String backupSetKey;

    /**
     * Backup set key.
     * @return the value
     **/
    public String getBackupSetKey() {
        return backupSetKey;
    }

    /**
     * Backup set stamp.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("setStamp")
    private final String setStamp;

    /**
     * Backup set stamp.
     * @return the value
     **/
    public String getSetStamp() {
        return setStamp;
    }

    /**
     * Backup type observed for the set.
     **/
    public enum BackupType {
        Datafile("DATAFILE"),
        Archived("ARCHIVED"),
        Incremental("INCREMENTAL"),
        NotSupported("NOT_SUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupType.class);

        private final String value;
        private static java.util.Map<String, BackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupType v : BackupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Backup type observed for the set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final BackupType backupType;

    /**
     * Backup type observed for the set.
     * @return the value
     **/
    public BackupType getBackupType() {
        return backupType;
    }

    /**
     * Current status of the backup set.
     **/
    public enum Status {
        Available("AVAILABLE"),
        Expired("EXPIRED"),
        Deleted("DELETED"),
        NotSupported("NOT_SUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Current status of the backup set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Current status of the backup set.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Number of backup pieces in the set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupPieces")
    private final Integer backupPieces;

    /**
     * Number of backup pieces in the set.
     * @return the value
     **/
    public Integer getBackupPieces() {
        return backupPieces;
    }

    /**
     * Indicates whether the backup set is encrypted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEncrypted")
    private final Boolean isEncrypted;

    /**
     * Indicates whether the backup set is encrypted.
     * @return the value
     **/
    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    /**
     * Encryption algorithm observed for the backup set when encryption is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithmObserved")
    private final String algorithmObserved;

    /**
     * Encryption algorithm observed for the backup set when encryption is enabled.
     * @return the value
     **/
    public String getAlgorithmObserved() {
        return algorithmObserved;
    }

    /**
     * Cipher mode observed for the backup set when encryption is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cipherModeObserved")
    private final String cipherModeObserved;

    /**
     * Cipher mode observed for the backup set when encryption is enabled.
     * @return the value
     **/
    public String getCipherModeObserved() {
        return cipherModeObserved;
    }

    /**
     * Indicates whether the backup set is compressed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCompressed")
    private final Boolean isCompressed;

    /**
     * Indicates whether the backup set is compressed.
     * @return the value
     **/
    public Boolean getIsCompressed() {
        return isCompressed;
    }

    /**
     * Backup set creation time in RFC3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Backup set creation time in RFC3339 format.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Backup set size in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Double sizeInGBs;

    /**
     * Backup set size in gigabytes.
     * @return the value
     **/
    public Double getSizeInGBs() {
        return sizeInGBs;
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
        sb.append("CryptoAssessmentBackupSetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", timeLastAssessed=").append(String.valueOf(this.timeLastAssessed));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", backupSetKey=").append(String.valueOf(this.backupSetKey));
        sb.append(", setStamp=").append(String.valueOf(this.setStamp));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", backupPieces=").append(String.valueOf(this.backupPieces));
        sb.append(", isEncrypted=").append(String.valueOf(this.isEncrypted));
        sb.append(", algorithmObserved=").append(String.valueOf(this.algorithmObserved));
        sb.append(", cipherModeObserved=").append(String.valueOf(this.cipherModeObserved));
        sb.append(", isCompressed=").append(String.valueOf(this.isCompressed));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentBackupSetSummary)) {
            return false;
        }

        CryptoAssessmentBackupSetSummary other = (CryptoAssessmentBackupSetSummary) o;
        return java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.timeLastAssessed, other.timeLastAssessed)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.backupSetKey, other.backupSetKey)
                && java.util.Objects.equals(this.setStamp, other.setStamp)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.backupPieces, other.backupPieces)
                && java.util.Objects.equals(this.isEncrypted, other.isEncrypted)
                && java.util.Objects.equals(this.algorithmObserved, other.algorithmObserved)
                && java.util.Objects.equals(this.cipherModeObserved, other.cipherModeObserved)
                && java.util.Objects.equals(this.isCompressed, other.isCompressed)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastAssessed == null ? 43 : this.timeLastAssessed.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.backupSetKey == null ? 43 : this.backupSetKey.hashCode());
        result = (result * PRIME) + (this.setStamp == null ? 43 : this.setStamp.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.backupPieces == null ? 43 : this.backupPieces.hashCode());
        result = (result * PRIME) + (this.isEncrypted == null ? 43 : this.isEncrypted.hashCode());
        result =
                (result * PRIME)
                        + (this.algorithmObserved == null ? 43 : this.algorithmObserved.hashCode());
        result =
                (result * PRIME)
                        + (this.cipherModeObserved == null
                                ? 43
                                : this.cipherModeObserved.hashCode());
        result = (result * PRIME) + (this.isCompressed == null ? 43 : this.isCompressed.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
