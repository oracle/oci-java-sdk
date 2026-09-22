/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of one TDE object encryption observation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CryptoAssessmentTdeObjectSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessmentTdeObjectSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assessmentId",
        "timeLastAssessed",
        "targetId",
        "tablespaceName",
        "schemaName",
        "tableName",
        "columnName",
        "encryptionObserved",
        "modeObserved",
        "sizeInGBs",
        "quantumReadiness"
    })
    public CryptoAssessmentTdeObjectSummary(
            String assessmentId,
            java.util.Date timeLastAssessed,
            String targetId,
            String tablespaceName,
            String schemaName,
            String tableName,
            String columnName,
            String encryptionObserved,
            String modeObserved,
            Double sizeInGBs,
            CryptoQuantumReadiness quantumReadiness) {
        super();
        this.assessmentId = assessmentId;
        this.timeLastAssessed = timeLastAssessed;
        this.targetId = targetId;
        this.tablespaceName = tablespaceName;
        this.schemaName = schemaName;
        this.tableName = tableName;
        this.columnName = columnName;
        this.encryptionObserved = encryptionObserved;
        this.modeObserved = modeObserved;
        this.sizeInGBs = sizeInGBs;
        this.quantumReadiness = quantumReadiness;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the crypto assessment that discovered the TDE object. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * OCID of the crypto assessment that discovered the TDE object.
         *
         * @param assessmentId the value to set
         * @return this builder
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            this.__explicitlySet__.add("assessmentId");
            return this;
        }
        /**
         * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
        private java.util.Date timeLastAssessed;

        /**
         * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
         *
         * @param timeLastAssessed the value to set
         * @return this builder
         */
        public Builder timeLastAssessed(java.util.Date timeLastAssessed) {
            this.timeLastAssessed = timeLastAssessed;
            this.__explicitlySet__.add("timeLastAssessed");
            return this;
        }
        /** OCID of the target database associated with the TDE object. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * OCID of the target database associated with the TDE object.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Name of the tablespace. This field is returned when objectType is TABLESPACE. */
        @com.fasterxml.jackson.annotation.JsonProperty("tablespaceName")
        private String tablespaceName;

        /**
         * Name of the tablespace. This field is returned when objectType is TABLESPACE.
         *
         * @param tablespaceName the value to set
         * @return this builder
         */
        public Builder tablespaceName(String tablespaceName) {
            this.tablespaceName = tablespaceName;
            this.__explicitlySet__.add("tablespaceName");
            return this;
        }
        /**
         * Name of the schema containing the encrypted column. This field is returned when
         * objectType is COLUMN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * Name of the schema containing the encrypted column. This field is returned when
         * objectType is COLUMN.
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /**
         * Name of the table containing the encrypted column. This field is returned when objectType
         * is COLUMN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        /**
         * Name of the table containing the encrypted column. This field is returned when objectType
         * is COLUMN.
         *
         * @param tableName the value to set
         * @return this builder
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }
        /** Name of the encrypted column. This field is returned when objectType is COLUMN. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * Name of the encrypted column. This field is returned when objectType is COLUMN.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /** Encryption algorithm observed for the TDE object. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionObserved")
        private String encryptionObserved;

        /**
         * Encryption algorithm observed for the TDE object.
         *
         * @param encryptionObserved the value to set
         * @return this builder
         */
        public Builder encryptionObserved(String encryptionObserved) {
            this.encryptionObserved = encryptionObserved;
            this.__explicitlySet__.add("encryptionObserved");
            return this;
        }
        /**
         * Encryption mode observed for the tablespace. This field is returned when objectType is
         * TABLESPACE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modeObserved")
        private String modeObserved;

        /**
         * Encryption mode observed for the tablespace. This field is returned when objectType is
         * TABLESPACE.
         *
         * @param modeObserved the value to set
         * @return this builder
         */
        public Builder modeObserved(String modeObserved) {
            this.modeObserved = modeObserved;
            this.__explicitlySet__.add("modeObserved");
            return this;
        }
        /** Tablespace size in gigabytes. This field is returned when objectType is TABLESPACE. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Double sizeInGBs;

        /**
         * Tablespace size in gigabytes. This field is returned when objectType is TABLESPACE.
         *
         * @param sizeInGBs the value to set
         * @return this builder
         */
        public Builder sizeInGBs(Double sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }
        /** Quantum-readiness classification for the observed TDE object encryption. */
        @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
        private CryptoQuantumReadiness quantumReadiness;

        /**
         * Quantum-readiness classification for the observed TDE object encryption.
         *
         * @param quantumReadiness the value to set
         * @return this builder
         */
        public Builder quantumReadiness(CryptoQuantumReadiness quantumReadiness) {
            this.quantumReadiness = quantumReadiness;
            this.__explicitlySet__.add("quantumReadiness");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentTdeObjectSummary build() {
            CryptoAssessmentTdeObjectSummary model =
                    new CryptoAssessmentTdeObjectSummary(
                            this.assessmentId,
                            this.timeLastAssessed,
                            this.targetId,
                            this.tablespaceName,
                            this.schemaName,
                            this.tableName,
                            this.columnName,
                            this.encryptionObserved,
                            this.modeObserved,
                            this.sizeInGBs,
                            this.quantumReadiness);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentTdeObjectSummary model) {
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("timeLastAssessed")) {
                this.timeLastAssessed(model.getTimeLastAssessed());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("tablespaceName")) {
                this.tablespaceName(model.getTablespaceName());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("tableName")) {
                this.tableName(model.getTableName());
            }
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("encryptionObserved")) {
                this.encryptionObserved(model.getEncryptionObserved());
            }
            if (model.wasPropertyExplicitlySet("modeObserved")) {
                this.modeObserved(model.getModeObserved());
            }
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("quantumReadiness")) {
                this.quantumReadiness(model.getQuantumReadiness());
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

    /** OCID of the crypto assessment that discovered the TDE object. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * OCID of the crypto assessment that discovered the TDE object.
     *
     * @return the value
     */
    public String getAssessmentId() {
        return assessmentId;
    }

    /** The date and time the associated crypto assessment was last assessed, in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
    private final java.util.Date timeLastAssessed;

    /**
     * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeLastAssessed() {
        return timeLastAssessed;
    }

    /** OCID of the target database associated with the TDE object. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * OCID of the target database associated with the TDE object.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Name of the tablespace. This field is returned when objectType is TABLESPACE. */
    @com.fasterxml.jackson.annotation.JsonProperty("tablespaceName")
    private final String tablespaceName;

    /**
     * Name of the tablespace. This field is returned when objectType is TABLESPACE.
     *
     * @return the value
     */
    public String getTablespaceName() {
        return tablespaceName;
    }

    /**
     * Name of the schema containing the encrypted column. This field is returned when objectType is
     * COLUMN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * Name of the schema containing the encrypted column. This field is returned when objectType is
     * COLUMN.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Name of the table containing the encrypted column. This field is returned when objectType is
     * COLUMN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * Name of the table containing the encrypted column. This field is returned when objectType is
     * COLUMN.
     *
     * @return the value
     */
    public String getTableName() {
        return tableName;
    }

    /** Name of the encrypted column. This field is returned when objectType is COLUMN. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * Name of the encrypted column. This field is returned when objectType is COLUMN.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /** Encryption algorithm observed for the TDE object. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionObserved")
    private final String encryptionObserved;

    /**
     * Encryption algorithm observed for the TDE object.
     *
     * @return the value
     */
    public String getEncryptionObserved() {
        return encryptionObserved;
    }

    /**
     * Encryption mode observed for the tablespace. This field is returned when objectType is
     * TABLESPACE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modeObserved")
    private final String modeObserved;

    /**
     * Encryption mode observed for the tablespace. This field is returned when objectType is
     * TABLESPACE.
     *
     * @return the value
     */
    public String getModeObserved() {
        return modeObserved;
    }

    /** Tablespace size in gigabytes. This field is returned when objectType is TABLESPACE. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Double sizeInGBs;

    /**
     * Tablespace size in gigabytes. This field is returned when objectType is TABLESPACE.
     *
     * @return the value
     */
    public Double getSizeInGBs() {
        return sizeInGBs;
    }

    /** Quantum-readiness classification for the observed TDE object encryption. */
    @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
    private final CryptoQuantumReadiness quantumReadiness;

    /**
     * Quantum-readiness classification for the observed TDE object encryption.
     *
     * @return the value
     */
    public CryptoQuantumReadiness getQuantumReadiness() {
        return quantumReadiness;
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
        sb.append("CryptoAssessmentTdeObjectSummary(");
        sb.append("super=").append(super.toString());
        sb.append("assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", timeLastAssessed=").append(String.valueOf(this.timeLastAssessed));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", tablespaceName=").append(String.valueOf(this.tablespaceName));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", encryptionObserved=").append(String.valueOf(this.encryptionObserved));
        sb.append(", modeObserved=").append(String.valueOf(this.modeObserved));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", quantumReadiness=").append(String.valueOf(this.quantumReadiness));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentTdeObjectSummary)) {
            return false;
        }

        CryptoAssessmentTdeObjectSummary other = (CryptoAssessmentTdeObjectSummary) o;
        return java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.timeLastAssessed, other.timeLastAssessed)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.tablespaceName, other.tablespaceName)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.encryptionObserved, other.encryptionObserved)
                && java.util.Objects.equals(this.modeObserved, other.modeObserved)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.quantumReadiness, other.quantumReadiness)
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
        result =
                (result * PRIME)
                        + (this.tablespaceName == null ? 43 : this.tablespaceName.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionObserved == null
                                ? 43
                                : this.encryptionObserved.hashCode());
        result = (result * PRIME) + (this.modeObserved == null ? 43 : this.modeObserved.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.quantumReadiness == null ? 43 : this.quantumReadiness.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
