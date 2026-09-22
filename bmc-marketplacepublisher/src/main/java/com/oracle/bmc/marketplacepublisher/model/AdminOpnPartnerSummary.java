/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * OPN partner summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdminOpnPartnerSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdminOpnPartnerSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "companyId",
        "partnerName",
        "levelProgramName",
        "startDate",
        "endDate",
        "membershipStatus",
        "membershipType",
        "streetAddress1",
        "streetAddress2",
        "city",
        "state",
        "zipcode",
        "country",
        "phoneNumber",
        "partnerUrl",
        "numberOfEmployees",
        "lastUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AdminOpnPartnerSummary(
            String companyId,
            String partnerName,
            String levelProgramName,
            String startDate,
            String endDate,
            MembershipStatus membershipStatus,
            String membershipType,
            String streetAddress1,
            String streetAddress2,
            String city,
            String state,
            String zipcode,
            String country,
            String phoneNumber,
            String partnerUrl,
            String numberOfEmployees,
            String lastUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.companyId = companyId;
        this.partnerName = partnerName;
        this.levelProgramName = levelProgramName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.membershipStatus = membershipStatus;
        this.membershipType = membershipType;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.partnerUrl = partnerUrl;
        this.numberOfEmployees = numberOfEmployees;
        this.lastUpdated = lastUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id for company.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("companyId")
        private String companyId;

        /**
         * The id for company.
         * @param companyId the value to set
         * @return this builder
         **/
        public Builder companyId(String companyId) {
            this.companyId = companyId;
            this.__explicitlySet__.add("companyId");
            return this;
        }
        /**
         * Partner Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partnerName")
        private String partnerName;

        /**
         * Partner Name.
         * @param partnerName the value to set
         * @return this builder
         **/
        public Builder partnerName(String partnerName) {
            this.partnerName = partnerName;
            this.__explicitlySet__.add("partnerName");
            return this;
        }
        /**
         * Partner Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("levelProgramName")
        private String levelProgramName;

        /**
         * Partner Name.
         * @param levelProgramName the value to set
         * @return this builder
         **/
        public Builder levelProgramName(String levelProgramName) {
            this.levelProgramName = levelProgramName;
            this.__explicitlySet__.add("levelProgramName");
            return this;
        }
        /**
         * The start date.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private String startDate;

        /**
         * The start date.
         * @param startDate the value to set
         * @return this builder
         **/
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }
        /**
         * The end date.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private String endDate;

        /**
         * The end date.
         * @param endDate the value to set
         * @return this builder
         **/
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }
        /**
         * The OPN membership status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("membershipStatus")
        private MembershipStatus membershipStatus;

        /**
         * The OPN membership status.
         * @param membershipStatus the value to set
         * @return this builder
         **/
        public Builder membershipStatus(MembershipStatus membershipStatus) {
            this.membershipStatus = membershipStatus;
            this.__explicitlySet__.add("membershipStatus");
            return this;
        }
        /**
         * OPN membership type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("membershipType")
        private String membershipType;

        /**
         * OPN membership type
         * @param membershipType the value to set
         * @return this builder
         **/
        public Builder membershipType(String membershipType) {
            this.membershipType = membershipType;
            this.__explicitlySet__.add("membershipType");
            return this;
        }
        /**
         * The address of the partner.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streetAddress1")
        private String streetAddress1;

        /**
         * The address of the partner.
         * @param streetAddress1 the value to set
         * @return this builder
         **/
        public Builder streetAddress1(String streetAddress1) {
            this.streetAddress1 = streetAddress1;
            this.__explicitlySet__.add("streetAddress1");
            return this;
        }
        /**
         * The address of the partner.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streetAddress2")
        private String streetAddress2;

        /**
         * The address of the partner.
         * @param streetAddress2 the value to set
         * @return this builder
         **/
        public Builder streetAddress2(String streetAddress2) {
            this.streetAddress2 = streetAddress2;
            this.__explicitlySet__.add("streetAddress2");
            return this;
        }
        /**
         * City
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * City
         * @param city the value to set
         * @return this builder
         **/
        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }
        /**
         * State
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * State
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * Zip
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
        private String zipcode;

        /**
         * Zip
         * @param zipcode the value to set
         * @return this builder
         **/
        public Builder zipcode(String zipcode) {
            this.zipcode = zipcode;
            this.__explicitlySet__.add("zipcode");
            return this;
        }
        /**
         * Country
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country
         * @param country the value to set
         * @return this builder
         **/
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * The phone number of the contact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
        private String phoneNumber;

        /**
         * The phone number of the contact.
         * @param phoneNumber the value to set
         * @return this builder
         **/
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.__explicitlySet__.add("phoneNumber");
            return this;
        }
        /**
         * The URL for partner's service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partnerUrl")
        private String partnerUrl;

        /**
         * The URL for partner's service.
         * @param partnerUrl the value to set
         * @return this builder
         **/
        public Builder partnerUrl(String partnerUrl) {
            this.partnerUrl = partnerUrl;
            this.__explicitlySet__.add("partnerUrl");
            return this;
        }
        /**
         * The total number of employees.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfEmployees")
        private String numberOfEmployees;

        /**
         * The total number of employees.
         * @param numberOfEmployees the value to set
         * @return this builder
         **/
        public Builder numberOfEmployees(String numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
            this.__explicitlySet__.add("numberOfEmployees");
            return this;
        }
        /**
         * The last updated timestamp in format "yyyy-MM-dd HH:mm:ss.S".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
        private String lastUpdated;

        /**
         * The last updated timestamp in format "yyyy-MM-dd HH:mm:ss.S".
         * @param lastUpdated the value to set
         * @return this builder
         **/
        public Builder lastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
            this.__explicitlySet__.add("lastUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
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

        public AdminOpnPartnerSummary build() {
            AdminOpnPartnerSummary model =
                    new AdminOpnPartnerSummary(
                            this.companyId,
                            this.partnerName,
                            this.levelProgramName,
                            this.startDate,
                            this.endDate,
                            this.membershipStatus,
                            this.membershipType,
                            this.streetAddress1,
                            this.streetAddress2,
                            this.city,
                            this.state,
                            this.zipcode,
                            this.country,
                            this.phoneNumber,
                            this.partnerUrl,
                            this.numberOfEmployees,
                            this.lastUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminOpnPartnerSummary model) {
            if (model.wasPropertyExplicitlySet("companyId")) {
                this.companyId(model.getCompanyId());
            }
            if (model.wasPropertyExplicitlySet("partnerName")) {
                this.partnerName(model.getPartnerName());
            }
            if (model.wasPropertyExplicitlySet("levelProgramName")) {
                this.levelProgramName(model.getLevelProgramName());
            }
            if (model.wasPropertyExplicitlySet("startDate")) {
                this.startDate(model.getStartDate());
            }
            if (model.wasPropertyExplicitlySet("endDate")) {
                this.endDate(model.getEndDate());
            }
            if (model.wasPropertyExplicitlySet("membershipStatus")) {
                this.membershipStatus(model.getMembershipStatus());
            }
            if (model.wasPropertyExplicitlySet("membershipType")) {
                this.membershipType(model.getMembershipType());
            }
            if (model.wasPropertyExplicitlySet("streetAddress1")) {
                this.streetAddress1(model.getStreetAddress1());
            }
            if (model.wasPropertyExplicitlySet("streetAddress2")) {
                this.streetAddress2(model.getStreetAddress2());
            }
            if (model.wasPropertyExplicitlySet("city")) {
                this.city(model.getCity());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("zipcode")) {
                this.zipcode(model.getZipcode());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("phoneNumber")) {
                this.phoneNumber(model.getPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("partnerUrl")) {
                this.partnerUrl(model.getPartnerUrl());
            }
            if (model.wasPropertyExplicitlySet("numberOfEmployees")) {
                this.numberOfEmployees(model.getNumberOfEmployees());
            }
            if (model.wasPropertyExplicitlySet("lastUpdated")) {
                this.lastUpdated(model.getLastUpdated());
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
     * The id for company.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("companyId")
    private final String companyId;

    /**
     * The id for company.
     * @return the value
     **/
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Partner Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partnerName")
    private final String partnerName;

    /**
     * Partner Name.
     * @return the value
     **/
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Partner Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("levelProgramName")
    private final String levelProgramName;

    /**
     * Partner Name.
     * @return the value
     **/
    public String getLevelProgramName() {
        return levelProgramName;
    }

    /**
     * The start date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    private final String startDate;

    /**
     * The start date.
     * @return the value
     **/
    public String getStartDate() {
        return startDate;
    }

    /**
     * The end date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    private final String endDate;

    /**
     * The end date.
     * @return the value
     **/
    public String getEndDate() {
        return endDate;
    }

    /**
     * The OPN membership status.
     **/
    public enum MembershipStatus {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        RenewalInProgress("RENEWAL_IN_PROGRESS"),
        ;

        private final String value;
        private static java.util.Map<String, MembershipStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (MembershipStatus v : MembershipStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        MembershipStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MembershipStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MembershipStatus: " + key);
        }
    };
    /**
     * The OPN membership status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("membershipStatus")
    private final MembershipStatus membershipStatus;

    /**
     * The OPN membership status.
     * @return the value
     **/
    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }

    /**
     * OPN membership type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("membershipType")
    private final String membershipType;

    /**
     * OPN membership type
     * @return the value
     **/
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * The address of the partner.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streetAddress1")
    private final String streetAddress1;

    /**
     * The address of the partner.
     * @return the value
     **/
    public String getStreetAddress1() {
        return streetAddress1;
    }

    /**
     * The address of the partner.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streetAddress2")
    private final String streetAddress2;

    /**
     * The address of the partner.
     * @return the value
     **/
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * City
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * City
     * @return the value
     **/
    public String getCity() {
        return city;
    }

    /**
     * State
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * State
     * @return the value
     **/
    public String getState() {
        return state;
    }

    /**
     * Zip
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
    private final String zipcode;

    /**
     * Zip
     * @return the value
     **/
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Country
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country
     * @return the value
     **/
    public String getCountry() {
        return country;
    }

    /**
     * The phone number of the contact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
    private final String phoneNumber;

    /**
     * The phone number of the contact.
     * @return the value
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The URL for partner's service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partnerUrl")
    private final String partnerUrl;

    /**
     * The URL for partner's service.
     * @return the value
     **/
    public String getPartnerUrl() {
        return partnerUrl;
    }

    /**
     * The total number of employees.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfEmployees")
    private final String numberOfEmployees;

    /**
     * The total number of employees.
     * @return the value
     **/
    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * The last updated timestamp in format "yyyy-MM-dd HH:mm:ss.S".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    private final String lastUpdated;

    /**
     * The last updated timestamp in format "yyyy-MM-dd HH:mm:ss.S".
     * @return the value
     **/
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
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
        sb.append("AdminOpnPartnerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("companyId=").append(String.valueOf(this.companyId));
        sb.append(", partnerName=").append(String.valueOf(this.partnerName));
        sb.append(", levelProgramName=").append(String.valueOf(this.levelProgramName));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(", membershipStatus=").append(String.valueOf(this.membershipStatus));
        sb.append(", membershipType=").append(String.valueOf(this.membershipType));
        sb.append(", streetAddress1=").append(String.valueOf(this.streetAddress1));
        sb.append(", streetAddress2=").append(String.valueOf(this.streetAddress2));
        sb.append(", city=").append(String.valueOf(this.city));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", zipcode=").append(String.valueOf(this.zipcode));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", phoneNumber=").append(String.valueOf(this.phoneNumber));
        sb.append(", partnerUrl=").append(String.valueOf(this.partnerUrl));
        sb.append(", numberOfEmployees=").append(String.valueOf(this.numberOfEmployees));
        sb.append(", lastUpdated=").append(String.valueOf(this.lastUpdated));
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
        if (!(o instanceof AdminOpnPartnerSummary)) {
            return false;
        }

        AdminOpnPartnerSummary other = (AdminOpnPartnerSummary) o;
        return java.util.Objects.equals(this.companyId, other.companyId)
                && java.util.Objects.equals(this.partnerName, other.partnerName)
                && java.util.Objects.equals(this.levelProgramName, other.levelProgramName)
                && java.util.Objects.equals(this.startDate, other.startDate)
                && java.util.Objects.equals(this.endDate, other.endDate)
                && java.util.Objects.equals(this.membershipStatus, other.membershipStatus)
                && java.util.Objects.equals(this.membershipType, other.membershipType)
                && java.util.Objects.equals(this.streetAddress1, other.streetAddress1)
                && java.util.Objects.equals(this.streetAddress2, other.streetAddress2)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.zipcode, other.zipcode)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.phoneNumber, other.phoneNumber)
                && java.util.Objects.equals(this.partnerUrl, other.partnerUrl)
                && java.util.Objects.equals(this.numberOfEmployees, other.numberOfEmployees)
                && java.util.Objects.equals(this.lastUpdated, other.lastUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.companyId == null ? 43 : this.companyId.hashCode());
        result = (result * PRIME) + (this.partnerName == null ? 43 : this.partnerName.hashCode());
        result =
                (result * PRIME)
                        + (this.levelProgramName == null ? 43 : this.levelProgramName.hashCode());
        result = (result * PRIME) + (this.startDate == null ? 43 : this.startDate.hashCode());
        result = (result * PRIME) + (this.endDate == null ? 43 : this.endDate.hashCode());
        result =
                (result * PRIME)
                        + (this.membershipStatus == null ? 43 : this.membershipStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.membershipType == null ? 43 : this.membershipType.hashCode());
        result =
                (result * PRIME)
                        + (this.streetAddress1 == null ? 43 : this.streetAddress1.hashCode());
        result =
                (result * PRIME)
                        + (this.streetAddress2 == null ? 43 : this.streetAddress2.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.zipcode == null ? 43 : this.zipcode.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.phoneNumber == null ? 43 : this.phoneNumber.hashCode());
        result = (result * PRIME) + (this.partnerUrl == null ? 43 : this.partnerUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfEmployees == null ? 43 : this.numberOfEmployees.hashCode());
        result = (result * PRIME) + (this.lastUpdated == null ? 43 : this.lastUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
