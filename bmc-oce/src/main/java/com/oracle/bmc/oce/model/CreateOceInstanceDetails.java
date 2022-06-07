/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oce.model;

/**
 * The information about new OceInstance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOceInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOceInstanceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "compartmentId",
        "name",
        "tenancyId",
        "idcsAccessToken",
        "identityStripe",
        "tenancyName",
        "instanceUsageType",
        "addOnFeatures",
        "objectStorageNamespace",
        "adminEmail",
        "upgradeSchedule",
        "wafPrimaryDomain",
        "instanceAccessType",
        "instanceLicenseType",
        "freeformTags",
        "definedTags"
    })
    public CreateOceInstanceDetails(
            String description,
            String compartmentId,
            String name,
            String tenancyId,
            String idcsAccessToken,
            IdentityStripeDetails identityStripe,
            String tenancyName,
            InstanceUsageType instanceUsageType,
            java.util.List<String> addOnFeatures,
            String objectStorageNamespace,
            String adminEmail,
            OceInstance.UpgradeSchedule upgradeSchedule,
            String wafPrimaryDomain,
            InstanceAccessType instanceAccessType,
            LicenseType instanceLicenseType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.compartmentId = compartmentId;
        this.name = name;
        this.tenancyId = tenancyId;
        this.idcsAccessToken = idcsAccessToken;
        this.identityStripe = identityStripe;
        this.tenancyName = tenancyName;
        this.instanceUsageType = instanceUsageType;
        this.addOnFeatures = addOnFeatures;
        this.objectStorageNamespace = objectStorageNamespace;
        this.adminEmail = adminEmail;
        this.upgradeSchedule = upgradeSchedule;
        this.wafPrimaryDomain = wafPrimaryDomain;
        this.instanceAccessType = instanceAccessType;
        this.instanceLicenseType = instanceLicenseType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsAccessToken")
        private String idcsAccessToken;

        public Builder idcsAccessToken(String idcsAccessToken) {
            this.idcsAccessToken = idcsAccessToken;
            this.__explicitlySet__.add("idcsAccessToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identityStripe")
        private IdentityStripeDetails identityStripe;

        public Builder identityStripe(IdentityStripeDetails identityStripe) {
            this.identityStripe = identityStripe;
            this.__explicitlySet__.add("identityStripe");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
        private InstanceUsageType instanceUsageType;

        public Builder instanceUsageType(InstanceUsageType instanceUsageType) {
            this.instanceUsageType = instanceUsageType;
            this.__explicitlySet__.add("instanceUsageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addOnFeatures")
        private java.util.List<String> addOnFeatures;

        public Builder addOnFeatures(java.util.List<String> addOnFeatures) {
            this.addOnFeatures = addOnFeatures;
            this.__explicitlySet__.add("addOnFeatures");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
        private String objectStorageNamespace;

        public Builder objectStorageNamespace(String objectStorageNamespace) {
            this.objectStorageNamespace = objectStorageNamespace;
            this.__explicitlySet__.add("objectStorageNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upgradeSchedule")
        private OceInstance.UpgradeSchedule upgradeSchedule;

        public Builder upgradeSchedule(OceInstance.UpgradeSchedule upgradeSchedule) {
            this.upgradeSchedule = upgradeSchedule;
            this.__explicitlySet__.add("upgradeSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
        private String wafPrimaryDomain;

        public Builder wafPrimaryDomain(String wafPrimaryDomain) {
            this.wafPrimaryDomain = wafPrimaryDomain;
            this.__explicitlySet__.add("wafPrimaryDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceAccessType")
        private InstanceAccessType instanceAccessType;

        public Builder instanceAccessType(InstanceAccessType instanceAccessType) {
            this.instanceAccessType = instanceAccessType;
            this.__explicitlySet__.add("instanceAccessType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
        private LicenseType instanceLicenseType;

        public Builder instanceLicenseType(LicenseType instanceLicenseType) {
            this.instanceLicenseType = instanceLicenseType;
            this.__explicitlySet__.add("instanceLicenseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOceInstanceDetails build() {
            CreateOceInstanceDetails __instance__ =
                    new CreateOceInstanceDetails(
                            description,
                            compartmentId,
                            name,
                            tenancyId,
                            idcsAccessToken,
                            identityStripe,
                            tenancyName,
                            instanceUsageType,
                            addOnFeatures,
                            objectStorageNamespace,
                            adminEmail,
                            upgradeSchedule,
                            wafPrimaryDomain,
                            instanceAccessType,
                            instanceLicenseType,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOceInstanceDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .tenancyId(o.getTenancyId())
                            .idcsAccessToken(o.getIdcsAccessToken())
                            .identityStripe(o.getIdentityStripe())
                            .tenancyName(o.getTenancyName())
                            .instanceUsageType(o.getInstanceUsageType())
                            .addOnFeatures(o.getAddOnFeatures())
                            .objectStorageNamespace(o.getObjectStorageNamespace())
                            .adminEmail(o.getAdminEmail())
                            .upgradeSchedule(o.getUpgradeSchedule())
                            .wafPrimaryDomain(o.getWafPrimaryDomain())
                            .instanceAccessType(o.getInstanceAccessType())
                            .instanceLicenseType(o.getInstanceLicenseType())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * OceInstance description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * OceInstance Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * Tenancy Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * Identity Cloud Service access token identifying a stripe and service administrator user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAccessToken")
    private final String idcsAccessToken;

    public String getIdcsAccessToken() {
        return idcsAccessToken;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("identityStripe")
    private final IdentityStripeDetails identityStripe;

    public IdentityStripeDetails getIdentityStripe() {
        return identityStripe;
    }

    /**
     * Tenancy Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    private final String tenancyName;

    public String getTenancyName() {
        return tenancyName;
    }

    /**
     * Instance type based on its usage
     **/
    public enum InstanceUsageType {
        Primary("PRIMARY"),
        Nonprimary("NONPRIMARY"),
        ;

        private final String value;
        private static java.util.Map<String, InstanceUsageType> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceUsageType v : InstanceUsageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        InstanceUsageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceUsageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid InstanceUsageType: " + key);
        }
    };
    /**
     * Instance type based on its usage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
    private final InstanceUsageType instanceUsageType;

    public InstanceUsageType getInstanceUsageType() {
        return instanceUsageType;
    }

    /**
     * a list of add-on features for the ocm instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addOnFeatures")
    private final java.util.List<String> addOnFeatures;

    public java.util.List<String> getAddOnFeatures() {
        return addOnFeatures;
    }

    /**
     * Object Storage Namespace of Tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
    private final String objectStorageNamespace;

    public String getObjectStorageNamespace() {
        return objectStorageNamespace;
    }

    /**
     * Admin Email for Notification
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    private final String adminEmail;

    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released
     * or delay upgrade of the service to previous released version
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeSchedule")
    private final OceInstance.UpgradeSchedule upgradeSchedule;

    public OceInstance.UpgradeSchedule getUpgradeSchedule() {
        return upgradeSchedule;
    }

    /**
     * Web Application Firewall(WAF) primary domain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
    private final String wafPrimaryDomain;

    public String getWafPrimaryDomain() {
        return wafPrimaryDomain;
    }

    /**
     * Flag indicating whether the instance access is private or public
     **/
    public enum InstanceAccessType {
        Public("PUBLIC"),
        Private("PRIVATE"),
        ;

        private final String value;
        private static java.util.Map<String, InstanceAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceAccessType v : InstanceAccessType.values()) {
                map.put(v.getValue(), v);
            }
        }

        InstanceAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid InstanceAccessType: " + key);
        }
    };
    /**
     * Flag indicating whether the instance access is private or public
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceAccessType")
    private final InstanceAccessType instanceAccessType;

    public InstanceAccessType getInstanceAccessType() {
        return instanceAccessType;
    }

    /**
     * Flag indicating whether the instance license is new cloud or bring your own license
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
    private final LicenseType instanceLicenseType;

    public LicenseType getInstanceLicenseType() {
        return instanceLicenseType;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateOceInstanceDetails(");
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", idcsAccessToken=").append(String.valueOf(this.idcsAccessToken));
        sb.append(", identityStripe=").append(String.valueOf(this.identityStripe));
        sb.append(", tenancyName=").append(String.valueOf(this.tenancyName));
        sb.append(", instanceUsageType=").append(String.valueOf(this.instanceUsageType));
        sb.append(", addOnFeatures=").append(String.valueOf(this.addOnFeatures));
        sb.append(", objectStorageNamespace=").append(String.valueOf(this.objectStorageNamespace));
        sb.append(", adminEmail=").append(String.valueOf(this.adminEmail));
        sb.append(", upgradeSchedule=").append(String.valueOf(this.upgradeSchedule));
        sb.append(", wafPrimaryDomain=").append(String.valueOf(this.wafPrimaryDomain));
        sb.append(", instanceAccessType=").append(String.valueOf(this.instanceAccessType));
        sb.append(", instanceLicenseType=").append(String.valueOf(this.instanceLicenseType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOceInstanceDetails)) {
            return false;
        }

        CreateOceInstanceDetails other = (CreateOceInstanceDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.idcsAccessToken, other.idcsAccessToken)
                && java.util.Objects.equals(this.identityStripe, other.identityStripe)
                && java.util.Objects.equals(this.tenancyName, other.tenancyName)
                && java.util.Objects.equals(this.instanceUsageType, other.instanceUsageType)
                && java.util.Objects.equals(this.addOnFeatures, other.addOnFeatures)
                && java.util.Objects.equals(
                        this.objectStorageNamespace, other.objectStorageNamespace)
                && java.util.Objects.equals(this.adminEmail, other.adminEmail)
                && java.util.Objects.equals(this.upgradeSchedule, other.upgradeSchedule)
                && java.util.Objects.equals(this.wafPrimaryDomain, other.wafPrimaryDomain)
                && java.util.Objects.equals(this.instanceAccessType, other.instanceAccessType)
                && java.util.Objects.equals(this.instanceLicenseType, other.instanceLicenseType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAccessToken == null ? 43 : this.idcsAccessToken.hashCode());
        result =
                (result * PRIME)
                        + (this.identityStripe == null ? 43 : this.identityStripe.hashCode());
        result = (result * PRIME) + (this.tenancyName == null ? 43 : this.tenancyName.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceUsageType == null ? 43 : this.instanceUsageType.hashCode());
        result =
                (result * PRIME)
                        + (this.addOnFeatures == null ? 43 : this.addOnFeatures.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageNamespace == null
                                ? 43
                                : this.objectStorageNamespace.hashCode());
        result = (result * PRIME) + (this.adminEmail == null ? 43 : this.adminEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeSchedule == null ? 43 : this.upgradeSchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.wafPrimaryDomain == null ? 43 : this.wafPrimaryDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceAccessType == null
                                ? 43
                                : this.instanceAccessType.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceLicenseType == null
                                ? 43
                                : this.instanceLicenseType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
