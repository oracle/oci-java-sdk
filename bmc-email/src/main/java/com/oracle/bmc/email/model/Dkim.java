/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.model;

/**
 * The properties that define a DKIM. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Dkim.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Dkim extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "id",
        "emailDomainId",
        "compartmentId",
        "lifecycleState",
        "lifecycleDetails",
        "description",
        "timeCreated",
        "timeUpdated",
        "dnsSubdomainName",
        "cnameRecordValue",
        "txtRecordValue",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Dkim(
            String name,
            String id,
            String emailDomainId,
            String compartmentId,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String dnsSubdomainName,
            String cnameRecordValue,
            String txtRecordValue,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.name = name;
        this.id = id;
        this.emailDomainId = emailDomainId;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.dnsSubdomainName = dnsSubdomainName;
        this.cnameRecordValue = cnameRecordValue;
        this.txtRecordValue = txtRecordValue;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The DKIM selector. If the same domain is managed in more than one region, each region
         * must use different selectors.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The DKIM selector. If the same domain is managed in more than one region, each region
         * must use different selectors.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DKIM.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DKIM.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the email domain that this DKIM belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("emailDomainId")
        private String emailDomainId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the email domain that this DKIM belongs to.
         *
         * @param emailDomainId the value to set
         * @return this builder
         */
        public Builder emailDomainId(String emailDomainId) {
            this.emailDomainId = emailDomainId;
            this.__explicitlySet__.add("emailDomainId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains this DKIM.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains this DKIM.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The current state of the DKIM. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the DKIM.
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
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The description of the DKIM. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the DKIM. Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The time the DKIM was created. Times are expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, "YYYY-MM-ddThh:mmZ".
         *
         * <p>Example: {@code 2021-02-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the DKIM was created. Times are expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, "YYYY-MM-ddThh:mmZ".
         *
         * <p>Example: {@code 2021-02-12T22:47:12.613Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time of the last change to the DKIM configuration, due to a state change or an update
         * operation. Times are expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format, "YYYY-MM-ddThh:mmZ".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time of the last change to the DKIM configuration, due to a state change or an update
         * operation. Times are expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format, "YYYY-MM-ddThh:mmZ".
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The name of the DNS subdomain that must be provisioned to enable email recipients to
         * verify DKIM signatures. It is usually created with a CNAME record set to the
         * cnameRecordValue.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsSubdomainName")
        private String dnsSubdomainName;

        /**
         * The name of the DNS subdomain that must be provisioned to enable email recipients to
         * verify DKIM signatures. It is usually created with a CNAME record set to the
         * cnameRecordValue.
         *
         * @param dnsSubdomainName the value to set
         * @return this builder
         */
        public Builder dnsSubdomainName(String dnsSubdomainName) {
            this.dnsSubdomainName = dnsSubdomainName;
            this.__explicitlySet__.add("dnsSubdomainName");
            return this;
        }
        /**
         * The DNS CNAME record value to provision to the DKIM DNS subdomain, when using the CNAME
         * method for DKIM setup (preferred).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cnameRecordValue")
        private String cnameRecordValue;

        /**
         * The DNS CNAME record value to provision to the DKIM DNS subdomain, when using the CNAME
         * method for DKIM setup (preferred).
         *
         * @param cnameRecordValue the value to set
         * @return this builder
         */
        public Builder cnameRecordValue(String cnameRecordValue) {
            this.cnameRecordValue = cnameRecordValue;
            this.__explicitlySet__.add("cnameRecordValue");
            return this;
        }
        /**
         * The DNS TXT record value to provision to the DKIM DNS subdomain in place of using a CNAME
         * record. This is used in cases where a CNAME cannot be used, such as when the
         * cnameRecordValue would exceed the maximum length for a DNS entry. You can also use this
         * if you have an existing procedure to directly provision TXT records for DKIM. Many DNS
         * APIs require you to break this string into segments of fewer than 255 characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("txtRecordValue")
        private String txtRecordValue;

        /**
         * The DNS TXT record value to provision to the DKIM DNS subdomain in place of using a CNAME
         * record. This is used in cases where a CNAME cannot be used, such as when the
         * cnameRecordValue would exceed the maximum length for a DNS entry. You can also use this
         * if you have an existing procedure to directly provision TXT records for DKIM. Many DNS
         * APIs require you to break this string into segments of fewer than 255 characters.
         *
         * @param txtRecordValue the value to set
         * @return this builder
         */
        public Builder txtRecordValue(String txtRecordValue) {
            this.txtRecordValue = txtRecordValue;
            this.__explicitlySet__.add("txtRecordValue");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Dkim build() {
            Dkim model =
                    new Dkim(
                            this.name,
                            this.id,
                            this.emailDomainId,
                            this.compartmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.dnsSubdomainName,
                            this.cnameRecordValue,
                            this.txtRecordValue,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Dkim model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("emailDomainId")) {
                this.emailDomainId(model.getEmailDomainId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("dnsSubdomainName")) {
                this.dnsSubdomainName(model.getDnsSubdomainName());
            }
            if (model.wasPropertyExplicitlySet("cnameRecordValue")) {
                this.cnameRecordValue(model.getCnameRecordValue());
            }
            if (model.wasPropertyExplicitlySet("txtRecordValue")) {
                this.txtRecordValue(model.getTxtRecordValue());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The DKIM selector. If the same domain is managed in more than one region, each region must
     * use different selectors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The DKIM selector. If the same domain is managed in more than one region, each region must
     * use different selectors.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DKIM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DKIM.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the email domain that this DKIM belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emailDomainId")
    private final String emailDomainId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the email domain that this DKIM belongs to.
     *
     * @return the value
     */
    public String getEmailDomainId() {
        return emailDomainId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains this DKIM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains this DKIM.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The current state of the DKIM. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Inactive("INACTIVE"),
        NeedsAttention("NEEDS_ATTENTION"),
        Updating("UPDATING"),

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
    /** The current state of the DKIM. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the DKIM.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The description of the DKIM. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the DKIM. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The time the DKIM was created. Times are expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, "YYYY-MM-ddThh:mmZ".
     *
     * <p>Example: {@code 2021-02-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the DKIM was created. Times are expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, "YYYY-MM-ddThh:mmZ".
     *
     * <p>Example: {@code 2021-02-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time of the last change to the DKIM configuration, due to a state change or an update
     * operation. Times are expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp
     * format, "YYYY-MM-ddThh:mmZ".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time of the last change to the DKIM configuration, due to a state change or an update
     * operation. Times are expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp
     * format, "YYYY-MM-ddThh:mmZ".
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The name of the DNS subdomain that must be provisioned to enable email recipients to verify
     * DKIM signatures. It is usually created with a CNAME record set to the cnameRecordValue.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsSubdomainName")
    private final String dnsSubdomainName;

    /**
     * The name of the DNS subdomain that must be provisioned to enable email recipients to verify
     * DKIM signatures. It is usually created with a CNAME record set to the cnameRecordValue.
     *
     * @return the value
     */
    public String getDnsSubdomainName() {
        return dnsSubdomainName;
    }

    /**
     * The DNS CNAME record value to provision to the DKIM DNS subdomain, when using the CNAME
     * method for DKIM setup (preferred).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cnameRecordValue")
    private final String cnameRecordValue;

    /**
     * The DNS CNAME record value to provision to the DKIM DNS subdomain, when using the CNAME
     * method for DKIM setup (preferred).
     *
     * @return the value
     */
    public String getCnameRecordValue() {
        return cnameRecordValue;
    }

    /**
     * The DNS TXT record value to provision to the DKIM DNS subdomain in place of using a CNAME
     * record. This is used in cases where a CNAME cannot be used, such as when the cnameRecordValue
     * would exceed the maximum length for a DNS entry. You can also use this if you have an
     * existing procedure to directly provision TXT records for DKIM. Many DNS APIs require you to
     * break this string into segments of fewer than 255 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("txtRecordValue")
    private final String txtRecordValue;

    /**
     * The DNS TXT record value to provision to the DKIM DNS subdomain in place of using a CNAME
     * record. This is used in cases where a CNAME cannot be used, such as when the cnameRecordValue
     * would exceed the maximum length for a DNS entry. You can also use this if you have an
     * existing procedure to directly provision TXT records for DKIM. Many DNS APIs require you to
     * break this string into segments of fewer than 255 characters.
     *
     * @return the value
     */
    public String getTxtRecordValue() {
        return txtRecordValue;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Dkim(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", emailDomainId=").append(String.valueOf(this.emailDomainId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", dnsSubdomainName=").append(String.valueOf(this.dnsSubdomainName));
        sb.append(", cnameRecordValue=").append(String.valueOf(this.cnameRecordValue));
        sb.append(", txtRecordValue=").append(String.valueOf(this.txtRecordValue));
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
        if (!(o instanceof Dkim)) {
            return false;
        }

        Dkim other = (Dkim) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.emailDomainId, other.emailDomainId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.dnsSubdomainName, other.dnsSubdomainName)
                && java.util.Objects.equals(this.cnameRecordValue, other.cnameRecordValue)
                && java.util.Objects.equals(this.txtRecordValue, other.txtRecordValue)
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
                        + (this.emailDomainId == null ? 43 : this.emailDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsSubdomainName == null ? 43 : this.dnsSubdomainName.hashCode());
        result =
                (result * PRIME)
                        + (this.cnameRecordValue == null ? 43 : this.cnameRecordValue.hashCode());
        result =
                (result * PRIME)
                        + (this.txtRecordValue == null ? 43 : this.txtRecordValue.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
