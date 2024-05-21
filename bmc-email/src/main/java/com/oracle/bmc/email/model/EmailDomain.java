/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.model;

/**
 * The properties that define an email domain.
 * An email domain contains configuration used to assert responsibility for emails sent from that domain.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EmailDomain.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmailDomain extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "id",
        "compartmentId",
        "lifecycleState",
        "activeDkimId",
        "isSpf",
        "domainVerificationStatus",
        "domainVerificationId",
        "description",
        "timeCreated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public EmailDomain(
            String name,
            String id,
            String compartmentId,
            LifecycleState lifecycleState,
            String activeDkimId,
            Boolean isSpf,
            DomainVerificationStatusType domainVerificationStatus,
            String domainVerificationId,
            String description,
            java.util.Date timeCreated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.name = name;
        this.id = id;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.activeDkimId = activeDkimId;
        this.isSpf = isSpf;
        this.domainVerificationStatus = domainVerificationStatus;
        this.domainVerificationId = domainVerificationId;
        this.description = description;
        this.timeCreated = timeCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the email domain in the Internet Domain Name System (DNS).
         * <p>
         * Example: {@code mydomain.example.com}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the email domain in the Internet Domain Name System (DNS).
         * <p>
         * Example: {@code mydomain.example.com}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the email domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the email domain.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains this email domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains this email domain.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The current state of the email domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the email domain.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DKIM key
         * that will be used to sign mail sent from this email domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activeDkimId")
        private String activeDkimId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DKIM key
         * that will be used to sign mail sent from this email domain.
         *
         * @param activeDkimId the value to set
         * @return this builder
         **/
        public Builder activeDkimId(String activeDkimId) {
            this.activeDkimId = activeDkimId;
            this.__explicitlySet__.add("activeDkimId");
            return this;
        }
        /**
         * Value of the SPF field. For more information about SPF, please see
         * [SPF Authentication](https://docs.cloud.oracle.com/iaas/Content/Email/Concepts/overview.htm#components).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSpf")
        private Boolean isSpf;

        /**
         * Value of the SPF field. For more information about SPF, please see
         * [SPF Authentication](https://docs.cloud.oracle.com/iaas/Content/Email/Concepts/overview.htm#components).
         *
         * @param isSpf the value to set
         * @return this builder
         **/
        public Builder isSpf(Boolean isSpf) {
            this.isSpf = isSpf;
            this.__explicitlySet__.add("isSpf");
            return this;
        }
        /**
         * The current domain verification status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainVerificationStatus")
        private DomainVerificationStatusType domainVerificationStatus;

        /**
         * The current domain verification status.
         * @param domainVerificationStatus the value to set
         * @return this builder
         **/
        public Builder domainVerificationStatus(
                DomainVerificationStatusType domainVerificationStatus) {
            this.domainVerificationStatus = domainVerificationStatus;
            this.__explicitlySet__.add("domainVerificationStatus");
            return this;
        }
        /**
         * Id for Domain in Domain Management (under governance) if DOMAINID verification method used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainVerificationId")
        private String domainVerificationId;

        /**
         * Id for Domain in Domain Management (under governance) if DOMAINID verification method used.
         * @param domainVerificationId the value to set
         * @return this builder
         **/
        public Builder domainVerificationId(String domainVerificationId) {
            this.domainVerificationId = domainVerificationId;
            this.__explicitlySet__.add("domainVerificationId");
            return this;
        }
        /**
         * The description of an email domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of an email domain.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The time the email domain was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format, "YYYY-MM-ddThh:mmZ".
         * <p>
         * Example: {@code 2021-02-12T22:47:12.613Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the email domain was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format, "YYYY-MM-ddThh:mmZ".
         * <p>
         * Example: {@code 2021-02-12T22:47:12.613Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmailDomain build() {
            EmailDomain model =
                    new EmailDomain(
                            this.name,
                            this.id,
                            this.compartmentId,
                            this.lifecycleState,
                            this.activeDkimId,
                            this.isSpf,
                            this.domainVerificationStatus,
                            this.domainVerificationId,
                            this.description,
                            this.timeCreated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmailDomain model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("activeDkimId")) {
                this.activeDkimId(model.getActiveDkimId());
            }
            if (model.wasPropertyExplicitlySet("isSpf")) {
                this.isSpf(model.getIsSpf());
            }
            if (model.wasPropertyExplicitlySet("domainVerificationStatus")) {
                this.domainVerificationStatus(model.getDomainVerificationStatus());
            }
            if (model.wasPropertyExplicitlySet("domainVerificationId")) {
                this.domainVerificationId(model.getDomainVerificationId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The name of the email domain in the Internet Domain Name System (DNS).
     * <p>
     * Example: {@code mydomain.example.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the email domain in the Internet Domain Name System (DNS).
     * <p>
     * Example: {@code mydomain.example.com}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the email domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the email domain.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains this email domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains this email domain.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The current state of the email domain.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current state of the email domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the email domain.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DKIM key
     * that will be used to sign mail sent from this email domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeDkimId")
    private final String activeDkimId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DKIM key
     * that will be used to sign mail sent from this email domain.
     *
     * @return the value
     **/
    public String getActiveDkimId() {
        return activeDkimId;
    }

    /**
     * Value of the SPF field. For more information about SPF, please see
     * [SPF Authentication](https://docs.cloud.oracle.com/iaas/Content/Email/Concepts/overview.htm#components).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSpf")
    private final Boolean isSpf;

    /**
     * Value of the SPF field. For more information about SPF, please see
     * [SPF Authentication](https://docs.cloud.oracle.com/iaas/Content/Email/Concepts/overview.htm#components).
     *
     * @return the value
     **/
    public Boolean getIsSpf() {
        return isSpf;
    }

    /**
     * The current domain verification status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainVerificationStatus")
    private final DomainVerificationStatusType domainVerificationStatus;

    /**
     * The current domain verification status.
     * @return the value
     **/
    public DomainVerificationStatusType getDomainVerificationStatus() {
        return domainVerificationStatus;
    }

    /**
     * Id for Domain in Domain Management (under governance) if DOMAINID verification method used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainVerificationId")
    private final String domainVerificationId;

    /**
     * Id for Domain in Domain Management (under governance) if DOMAINID verification method used.
     * @return the value
     **/
    public String getDomainVerificationId() {
        return domainVerificationId;
    }

    /**
     * The description of an email domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of an email domain.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The time the email domain was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format, "YYYY-MM-ddThh:mmZ".
     * <p>
     * Example: {@code 2021-02-12T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the email domain was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format, "YYYY-MM-ddThh:mmZ".
     * <p>
     * Example: {@code 2021-02-12T22:47:12.613Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("EmailDomain(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", activeDkimId=").append(String.valueOf(this.activeDkimId));
        sb.append(", isSpf=").append(String.valueOf(this.isSpf));
        sb.append(", domainVerificationStatus=")
                .append(String.valueOf(this.domainVerificationStatus));
        sb.append(", domainVerificationId=").append(String.valueOf(this.domainVerificationId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmailDomain)) {
            return false;
        }

        EmailDomain other = (EmailDomain) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.activeDkimId, other.activeDkimId)
                && java.util.Objects.equals(this.isSpf, other.isSpf)
                && java.util.Objects.equals(
                        this.domainVerificationStatus, other.domainVerificationStatus)
                && java.util.Objects.equals(this.domainVerificationId, other.domainVerificationId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.activeDkimId == null ? 43 : this.activeDkimId.hashCode());
        result = (result * PRIME) + (this.isSpf == null ? 43 : this.isSpf.hashCode());
        result =
                (result * PRIME)
                        + (this.domainVerificationStatus == null
                                ? 43
                                : this.domainVerificationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.domainVerificationId == null
                                ? 43
                                : this.domainVerificationId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
