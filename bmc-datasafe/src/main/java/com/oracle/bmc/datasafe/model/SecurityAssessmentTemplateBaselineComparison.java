/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Provides a list of the differences in a comparison of the security assessment with the template
 * baseline value. <br>
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
        builder = SecurityAssessmentTemplateBaselineComparison.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityAssessmentTemplateBaselineComparison
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "templateBaselineId",
        "templateBaselineName",
        "lifecycleState",
        "timeCreated",
        "auditing",
        "authorizationControl",
        "dataEncryption",
        "dbConfiguration",
        "fineGrainedAccessControl",
        "privilegesAndRoles",
        "userAccounts"
    })
    public SecurityAssessmentTemplateBaselineComparison(
            String id,
            String templateBaselineId,
            String templateBaselineName,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.List<TemplateBaselineDiffs> auditing,
            java.util.List<TemplateBaselineDiffs> authorizationControl,
            java.util.List<TemplateBaselineDiffs> dataEncryption,
            java.util.List<TemplateBaselineDiffs> dbConfiguration,
            java.util.List<TemplateBaselineDiffs> fineGrainedAccessControl,
            java.util.List<TemplateBaselineDiffs> privilegesAndRoles,
            java.util.List<TemplateBaselineDiffs> userAccounts) {
        super();
        this.id = id;
        this.templateBaselineId = templateBaselineId;
        this.templateBaselineName = templateBaselineName;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.auditing = auditing;
        this.authorizationControl = authorizationControl;
        this.dataEncryption = dataEncryption;
        this.dbConfiguration = dbConfiguration;
        this.fineGrainedAccessControl = fineGrainedAccessControl;
        this.privilegesAndRoles = privilegesAndRoles;
        this.userAccounts = userAccounts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the security assessment that is being compared with a template baseline
         * security assessment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the security assessment that is being compared with a template baseline
         * security assessment.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the security assessment that is set as a template baseline. */
        @com.fasterxml.jackson.annotation.JsonProperty("templateBaselineId")
        private String templateBaselineId;

        /**
         * The OCID of the security assessment that is set as a template baseline.
         *
         * @param templateBaselineId the value to set
         * @return this builder
         */
        public Builder templateBaselineId(String templateBaselineId) {
            this.templateBaselineId = templateBaselineId;
            this.__explicitlySet__.add("templateBaselineId");
            return this;
        }
        /** The display name of the security assessment that is set as a template baseline. */
        @com.fasterxml.jackson.annotation.JsonProperty("templateBaselineName")
        private String templateBaselineName;

        /**
         * The display name of the security assessment that is set as a template baseline.
         *
         * @param templateBaselineName the value to set
         * @return this builder
         */
        public Builder templateBaselineName(String templateBaselineName) {
            this.templateBaselineName = templateBaselineName;
            this.__explicitlySet__.add("templateBaselineName");
            return this;
        }
        /** The current state of the security assessment comparison. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the security assessment comparison.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time when the security assessment comparison was created. Conforms to the
         * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the security assessment comparison was created. Conforms to the
         * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** A comparison between findings belonging to Auditing category. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditing")
        private java.util.List<TemplateBaselineDiffs> auditing;

        /**
         * A comparison between findings belonging to Auditing category.
         *
         * @param auditing the value to set
         * @return this builder
         */
        public Builder auditing(java.util.List<TemplateBaselineDiffs> auditing) {
            this.auditing = auditing;
            this.__explicitlySet__.add("auditing");
            return this;
        }
        /** A comparison between findings belonging to Authorization Control category. */
        @com.fasterxml.jackson.annotation.JsonProperty("authorizationControl")
        private java.util.List<TemplateBaselineDiffs> authorizationControl;

        /**
         * A comparison between findings belonging to Authorization Control category.
         *
         * @param authorizationControl the value to set
         * @return this builder
         */
        public Builder authorizationControl(
                java.util.List<TemplateBaselineDiffs> authorizationControl) {
            this.authorizationControl = authorizationControl;
            this.__explicitlySet__.add("authorizationControl");
            return this;
        }
        /** Comparison between findings belonging to Data Encryption category. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataEncryption")
        private java.util.List<TemplateBaselineDiffs> dataEncryption;

        /**
         * Comparison between findings belonging to Data Encryption category.
         *
         * @param dataEncryption the value to set
         * @return this builder
         */
        public Builder dataEncryption(java.util.List<TemplateBaselineDiffs> dataEncryption) {
            this.dataEncryption = dataEncryption;
            this.__explicitlySet__.add("dataEncryption");
            return this;
        }
        /** Comparison between findings belonging to Database Configuration category. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbConfiguration")
        private java.util.List<TemplateBaselineDiffs> dbConfiguration;

        /**
         * Comparison between findings belonging to Database Configuration category.
         *
         * @param dbConfiguration the value to set
         * @return this builder
         */
        public Builder dbConfiguration(java.util.List<TemplateBaselineDiffs> dbConfiguration) {
            this.dbConfiguration = dbConfiguration;
            this.__explicitlySet__.add("dbConfiguration");
            return this;
        }
        /** Comparison between findings belonging to Fine-Grained Access Control category. */
        @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControl")
        private java.util.List<TemplateBaselineDiffs> fineGrainedAccessControl;

        /**
         * Comparison between findings belonging to Fine-Grained Access Control category.
         *
         * @param fineGrainedAccessControl the value to set
         * @return this builder
         */
        public Builder fineGrainedAccessControl(
                java.util.List<TemplateBaselineDiffs> fineGrainedAccessControl) {
            this.fineGrainedAccessControl = fineGrainedAccessControl;
            this.__explicitlySet__.add("fineGrainedAccessControl");
            return this;
        }
        /** Comparison between findings belonging to Privileges and Roles category. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRoles")
        private java.util.List<TemplateBaselineDiffs> privilegesAndRoles;

        /**
         * Comparison between findings belonging to Privileges and Roles category.
         *
         * @param privilegesAndRoles the value to set
         * @return this builder
         */
        public Builder privilegesAndRoles(
                java.util.List<TemplateBaselineDiffs> privilegesAndRoles) {
            this.privilegesAndRoles = privilegesAndRoles;
            this.__explicitlySet__.add("privilegesAndRoles");
            return this;
        }
        /** Comparison between findings belonging to User Accounts category. */
        @com.fasterxml.jackson.annotation.JsonProperty("userAccounts")
        private java.util.List<TemplateBaselineDiffs> userAccounts;

        /**
         * Comparison between findings belonging to User Accounts category.
         *
         * @param userAccounts the value to set
         * @return this builder
         */
        public Builder userAccounts(java.util.List<TemplateBaselineDiffs> userAccounts) {
            this.userAccounts = userAccounts;
            this.__explicitlySet__.add("userAccounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAssessmentTemplateBaselineComparison build() {
            SecurityAssessmentTemplateBaselineComparison model =
                    new SecurityAssessmentTemplateBaselineComparison(
                            this.id,
                            this.templateBaselineId,
                            this.templateBaselineName,
                            this.lifecycleState,
                            this.timeCreated,
                            this.auditing,
                            this.authorizationControl,
                            this.dataEncryption,
                            this.dbConfiguration,
                            this.fineGrainedAccessControl,
                            this.privilegesAndRoles,
                            this.userAccounts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessmentTemplateBaselineComparison model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("templateBaselineId")) {
                this.templateBaselineId(model.getTemplateBaselineId());
            }
            if (model.wasPropertyExplicitlySet("templateBaselineName")) {
                this.templateBaselineName(model.getTemplateBaselineName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("auditing")) {
                this.auditing(model.getAuditing());
            }
            if (model.wasPropertyExplicitlySet("authorizationControl")) {
                this.authorizationControl(model.getAuthorizationControl());
            }
            if (model.wasPropertyExplicitlySet("dataEncryption")) {
                this.dataEncryption(model.getDataEncryption());
            }
            if (model.wasPropertyExplicitlySet("dbConfiguration")) {
                this.dbConfiguration(model.getDbConfiguration());
            }
            if (model.wasPropertyExplicitlySet("fineGrainedAccessControl")) {
                this.fineGrainedAccessControl(model.getFineGrainedAccessControl());
            }
            if (model.wasPropertyExplicitlySet("privilegesAndRoles")) {
                this.privilegesAndRoles(model.getPrivilegesAndRoles());
            }
            if (model.wasPropertyExplicitlySet("userAccounts")) {
                this.userAccounts(model.getUserAccounts());
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
     * The OCID of the security assessment that is being compared with a template baseline security
     * assessment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the security assessment that is being compared with a template baseline security
     * assessment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the security assessment that is set as a template baseline. */
    @com.fasterxml.jackson.annotation.JsonProperty("templateBaselineId")
    private final String templateBaselineId;

    /**
     * The OCID of the security assessment that is set as a template baseline.
     *
     * @return the value
     */
    public String getTemplateBaselineId() {
        return templateBaselineId;
    }

    /** The display name of the security assessment that is set as a template baseline. */
    @com.fasterxml.jackson.annotation.JsonProperty("templateBaselineName")
    private final String templateBaselineName;

    /**
     * The display name of the security assessment that is set as a template baseline.
     *
     * @return the value
     */
    public String getTemplateBaselineName() {
        return templateBaselineName;
    }

    /** The current state of the security assessment comparison. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Deleted("DELETED"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the security assessment comparison. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the security assessment comparison.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time when the security assessment comparison was created. Conforms to the format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the security assessment comparison was created. Conforms to the format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** A comparison between findings belonging to Auditing category. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditing")
    private final java.util.List<TemplateBaselineDiffs> auditing;

    /**
     * A comparison between findings belonging to Auditing category.
     *
     * @return the value
     */
    public java.util.List<TemplateBaselineDiffs> getAuditing() {
        return auditing;
    }

    /** A comparison between findings belonging to Authorization Control category. */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationControl")
    private final java.util.List<TemplateBaselineDiffs> authorizationControl;

    /**
     * A comparison between findings belonging to Authorization Control category.
     *
     * @return the value
     */
    public java.util.List<TemplateBaselineDiffs> getAuthorizationControl() {
        return authorizationControl;
    }

    /** Comparison between findings belonging to Data Encryption category. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataEncryption")
    private final java.util.List<TemplateBaselineDiffs> dataEncryption;

    /**
     * Comparison between findings belonging to Data Encryption category.
     *
     * @return the value
     */
    public java.util.List<TemplateBaselineDiffs> getDataEncryption() {
        return dataEncryption;
    }

    /** Comparison between findings belonging to Database Configuration category. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbConfiguration")
    private final java.util.List<TemplateBaselineDiffs> dbConfiguration;

    /**
     * Comparison between findings belonging to Database Configuration category.
     *
     * @return the value
     */
    public java.util.List<TemplateBaselineDiffs> getDbConfiguration() {
        return dbConfiguration;
    }

    /** Comparison between findings belonging to Fine-Grained Access Control category. */
    @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControl")
    private final java.util.List<TemplateBaselineDiffs> fineGrainedAccessControl;

    /**
     * Comparison between findings belonging to Fine-Grained Access Control category.
     *
     * @return the value
     */
    public java.util.List<TemplateBaselineDiffs> getFineGrainedAccessControl() {
        return fineGrainedAccessControl;
    }

    /** Comparison between findings belonging to Privileges and Roles category. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRoles")
    private final java.util.List<TemplateBaselineDiffs> privilegesAndRoles;

    /**
     * Comparison between findings belonging to Privileges and Roles category.
     *
     * @return the value
     */
    public java.util.List<TemplateBaselineDiffs> getPrivilegesAndRoles() {
        return privilegesAndRoles;
    }

    /** Comparison between findings belonging to User Accounts category. */
    @com.fasterxml.jackson.annotation.JsonProperty("userAccounts")
    private final java.util.List<TemplateBaselineDiffs> userAccounts;

    /**
     * Comparison between findings belonging to User Accounts category.
     *
     * @return the value
     */
    public java.util.List<TemplateBaselineDiffs> getUserAccounts() {
        return userAccounts;
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
        sb.append("SecurityAssessmentTemplateBaselineComparison(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", templateBaselineId=").append(String.valueOf(this.templateBaselineId));
        sb.append(", templateBaselineName=").append(String.valueOf(this.templateBaselineName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", auditing=").append(String.valueOf(this.auditing));
        sb.append(", authorizationControl=").append(String.valueOf(this.authorizationControl));
        sb.append(", dataEncryption=").append(String.valueOf(this.dataEncryption));
        sb.append(", dbConfiguration=").append(String.valueOf(this.dbConfiguration));
        sb.append(", fineGrainedAccessControl=")
                .append(String.valueOf(this.fineGrainedAccessControl));
        sb.append(", privilegesAndRoles=").append(String.valueOf(this.privilegesAndRoles));
        sb.append(", userAccounts=").append(String.valueOf(this.userAccounts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityAssessmentTemplateBaselineComparison)) {
            return false;
        }

        SecurityAssessmentTemplateBaselineComparison other =
                (SecurityAssessmentTemplateBaselineComparison) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.templateBaselineId, other.templateBaselineId)
                && java.util.Objects.equals(this.templateBaselineName, other.templateBaselineName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.auditing, other.auditing)
                && java.util.Objects.equals(this.authorizationControl, other.authorizationControl)
                && java.util.Objects.equals(this.dataEncryption, other.dataEncryption)
                && java.util.Objects.equals(this.dbConfiguration, other.dbConfiguration)
                && java.util.Objects.equals(
                        this.fineGrainedAccessControl, other.fineGrainedAccessControl)
                && java.util.Objects.equals(this.privilegesAndRoles, other.privilegesAndRoles)
                && java.util.Objects.equals(this.userAccounts, other.userAccounts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.templateBaselineId == null
                                ? 43
                                : this.templateBaselineId.hashCode());
        result =
                (result * PRIME)
                        + (this.templateBaselineName == null
                                ? 43
                                : this.templateBaselineName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.auditing == null ? 43 : this.auditing.hashCode());
        result =
                (result * PRIME)
                        + (this.authorizationControl == null
                                ? 43
                                : this.authorizationControl.hashCode());
        result =
                (result * PRIME)
                        + (this.dataEncryption == null ? 43 : this.dataEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.dbConfiguration == null ? 43 : this.dbConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.fineGrainedAccessControl == null
                                ? 43
                                : this.fineGrainedAccessControl.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegesAndRoles == null
                                ? 43
                                : this.privilegesAndRoles.hashCode());
        result = (result * PRIME) + (this.userAccounts == null ? 43 : this.userAccounts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
