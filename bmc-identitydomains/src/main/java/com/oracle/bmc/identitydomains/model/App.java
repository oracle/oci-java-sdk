/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Schema for App resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = App.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class App extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "ocid",
        "schemas",
        "meta",
        "idcsCreatedBy",
        "idcsLastModifiedBy",
        "idcsPreventedOperations",
        "tags",
        "deleteInProgress",
        "idcsLastUpgradedInRelease",
        "domainOcid",
        "compartmentOcid",
        "tenancyOcid",
        "meterAsOPCService",
        "name",
        "clientSecret",
        "hashedClientSecret",
        "displayName",
        "description",
        "idTokenEncAlgo",
        "delegatedServiceNames",
        "active",
        "appIcon",
        "appThumbnail",
        "migrated",
        "infrastructure",
        "isLoginTarget",
        "showInMyApps",
        "loginMechanism",
        "landingPageUrl",
        "productLogoUrl",
        "privacyPolicyUrl",
        "termsOfServiceUrl",
        "contactEmailAddress",
        "productName",
        "homePageUrl",
        "isFormFill",
        "isOAuthClient",
        "isRadiusApp",
        "clientType",
        "redirectUris",
        "allUrlSchemesAllowed",
        "logoutUri",
        "postLogoutRedirectUris",
        "allowedGrants",
        "allowedOperations",
        "clientIPChecking",
        "isOPCService",
        "isUnmanagedApp",
        "allowAccessControl",
        "isOAuthResource",
        "accessTokenExpiry",
        "refreshTokenExpiry",
        "allowOffline",
        "callbackServiceUrl",
        "audience",
        "isMobileTarget",
        "loginPageUrl",
        "linkingCallbackUrl",
        "logoutPageUrl",
        "errorPageUrl",
        "isSamlServiceProvider",
        "isWebTierPolicy",
        "isKerberosRealm",
        "icon",
        "isAliasApp",
        "isManagedApp",
        "serviceTypeURN",
        "serviceTypeVersion",
        "isObligationCapable",
        "readyToUpgrade",
        "trustScope",
        "isDatabaseService",
        "secondaryAudiences",
        "isEnterpriseApp",
        "bypassConsent",
        "disableKmsiTokenAuthentication",
        "isMulticloudServiceApp",
        "radiusPolicy",
        "appsNetworkPerimeters",
        "cloudControlProperties",
        "editableAttributes",
        "termsOfUse",
        "protectableSecondaryAudiences",
        "idpPolicy",
        "allowedTags",
        "appSignonPolicy",
        "trustPolicies",
        "signonPolicy",
        "identityProviders",
        "accounts",
        "grants",
        "serviceParams",
        "attrRenderingMetadata",
        "basedOnTemplate",
        "grantedAppRoles",
        "samlServiceProvider",
        "allowedScopes",
        "certificates",
        "aliasApps",
        "asOPCService",
        "adminRoles",
        "userRoles",
        "scopes",
        "urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate",
        "urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp",
        "urnIetfParamsScimSchemasOracleIdcsExtensionOciTags",
        "urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp"
    })
    public App(
            String id,
            String ocid,
            java.util.List<String> schemas,
            Meta meta,
            IdcsCreatedBy idcsCreatedBy,
            IdcsLastModifiedBy idcsLastModifiedBy,
            java.util.List<IdcsPreventedOperations> idcsPreventedOperations,
            java.util.List<Tags> tags,
            Boolean deleteInProgress,
            String idcsLastUpgradedInRelease,
            String domainOcid,
            String compartmentOcid,
            String tenancyOcid,
            Boolean meterAsOPCService,
            String name,
            String clientSecret,
            String hashedClientSecret,
            String displayName,
            String description,
            String idTokenEncAlgo,
            java.util.List<String> delegatedServiceNames,
            Boolean active,
            String appIcon,
            String appThumbnail,
            Boolean migrated,
            Boolean infrastructure,
            Boolean isLoginTarget,
            Boolean showInMyApps,
            LoginMechanism loginMechanism,
            String landingPageUrl,
            String productLogoUrl,
            String privacyPolicyUrl,
            String termsOfServiceUrl,
            String contactEmailAddress,
            String productName,
            String homePageUrl,
            Boolean isFormFill,
            Boolean isOAuthClient,
            Boolean isRadiusApp,
            ClientType clientType,
            java.util.List<String> redirectUris,
            Boolean allUrlSchemesAllowed,
            String logoutUri,
            java.util.List<String> postLogoutRedirectUris,
            java.util.List<String> allowedGrants,
            java.util.List<AllowedOperations> allowedOperations,
            ClientIPChecking clientIPChecking,
            Boolean isOPCService,
            Boolean isUnmanagedApp,
            Boolean allowAccessControl,
            Boolean isOAuthResource,
            Integer accessTokenExpiry,
            Integer refreshTokenExpiry,
            Boolean allowOffline,
            String callbackServiceUrl,
            String audience,
            Boolean isMobileTarget,
            String loginPageUrl,
            String linkingCallbackUrl,
            String logoutPageUrl,
            String errorPageUrl,
            Boolean isSamlServiceProvider,
            Boolean isWebTierPolicy,
            Boolean isKerberosRealm,
            String icon,
            Boolean isAliasApp,
            Boolean isManagedApp,
            String serviceTypeURN,
            String serviceTypeVersion,
            Boolean isObligationCapable,
            Boolean readyToUpgrade,
            TrustScope trustScope,
            Boolean isDatabaseService,
            java.util.List<String> secondaryAudiences,
            Boolean isEnterpriseApp,
            Boolean bypassConsent,
            Boolean disableKmsiTokenAuthentication,
            Boolean isMulticloudServiceApp,
            AppRadiusPolicy radiusPolicy,
            java.util.List<AppAppsNetworkPerimeters> appsNetworkPerimeters,
            java.util.List<AppCloudControlProperties> cloudControlProperties,
            java.util.List<AppEditableAttributes> editableAttributes,
            AppTermsOfUse termsOfUse,
            java.util.List<AppProtectableSecondaryAudiences> protectableSecondaryAudiences,
            AppIdpPolicy idpPolicy,
            java.util.List<AppAllowedTags> allowedTags,
            AppAppSignonPolicy appSignonPolicy,
            java.util.List<AppTrustPolicies> trustPolicies,
            AppSignonPolicy signonPolicy,
            java.util.List<AppIdentityProviders> identityProviders,
            java.util.List<AppAccounts> accounts,
            java.util.List<AppGrants> grants,
            java.util.List<AppServiceParams> serviceParams,
            java.util.List<AppAttrRenderingMetadata> attrRenderingMetadata,
            AppBasedOnTemplate basedOnTemplate,
            java.util.List<AppGrantedAppRoles> grantedAppRoles,
            AppSamlServiceProvider samlServiceProvider,
            java.util.List<AppAllowedScopes> allowedScopes,
            java.util.List<AppCertificates> certificates,
            java.util.List<AppAliasApps> aliasApps,
            AppAsOPCService asOPCService,
            java.util.List<AppAdminRoles> adminRoles,
            java.util.List<AppUserRoles> userRoles,
            java.util.List<AppScopes> scopes,
            AppExtensionRadiusAppApp urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp,
            AppExtensionSamlServiceProviderApp
                    urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp,
            AppExtensionWebTierPolicyApp
                    urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp,
            AppExtensionManagedappApp urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp,
            AppExtensionFormFillAppTemplateAppTemplate
                    urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate,
            AppExtensionOpcServiceApp urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp,
            AppExtensionKerberosRealmApp
                    urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp,
            AppExtensionRequestableApp urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp,
            AppExtensionFormFillAppApp urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp,
            AppExtensionDbcsApp urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp,
            AppExtensionEnterpriseAppApp
                    urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp,
            ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags,
            AppExtensionMulticloudServiceAppApp
                    urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp) {
        super();
        this.id = id;
        this.ocid = ocid;
        this.schemas = schemas;
        this.meta = meta;
        this.idcsCreatedBy = idcsCreatedBy;
        this.idcsLastModifiedBy = idcsLastModifiedBy;
        this.idcsPreventedOperations = idcsPreventedOperations;
        this.tags = tags;
        this.deleteInProgress = deleteInProgress;
        this.idcsLastUpgradedInRelease = idcsLastUpgradedInRelease;
        this.domainOcid = domainOcid;
        this.compartmentOcid = compartmentOcid;
        this.tenancyOcid = tenancyOcid;
        this.meterAsOPCService = meterAsOPCService;
        this.name = name;
        this.clientSecret = clientSecret;
        this.hashedClientSecret = hashedClientSecret;
        this.displayName = displayName;
        this.description = description;
        this.idTokenEncAlgo = idTokenEncAlgo;
        this.delegatedServiceNames = delegatedServiceNames;
        this.active = active;
        this.appIcon = appIcon;
        this.appThumbnail = appThumbnail;
        this.migrated = migrated;
        this.infrastructure = infrastructure;
        this.isLoginTarget = isLoginTarget;
        this.showInMyApps = showInMyApps;
        this.loginMechanism = loginMechanism;
        this.landingPageUrl = landingPageUrl;
        this.productLogoUrl = productLogoUrl;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.termsOfServiceUrl = termsOfServiceUrl;
        this.contactEmailAddress = contactEmailAddress;
        this.productName = productName;
        this.homePageUrl = homePageUrl;
        this.isFormFill = isFormFill;
        this.isOAuthClient = isOAuthClient;
        this.isRadiusApp = isRadiusApp;
        this.clientType = clientType;
        this.redirectUris = redirectUris;
        this.allUrlSchemesAllowed = allUrlSchemesAllowed;
        this.logoutUri = logoutUri;
        this.postLogoutRedirectUris = postLogoutRedirectUris;
        this.allowedGrants = allowedGrants;
        this.allowedOperations = allowedOperations;
        this.clientIPChecking = clientIPChecking;
        this.isOPCService = isOPCService;
        this.isUnmanagedApp = isUnmanagedApp;
        this.allowAccessControl = allowAccessControl;
        this.isOAuthResource = isOAuthResource;
        this.accessTokenExpiry = accessTokenExpiry;
        this.refreshTokenExpiry = refreshTokenExpiry;
        this.allowOffline = allowOffline;
        this.callbackServiceUrl = callbackServiceUrl;
        this.audience = audience;
        this.isMobileTarget = isMobileTarget;
        this.loginPageUrl = loginPageUrl;
        this.linkingCallbackUrl = linkingCallbackUrl;
        this.logoutPageUrl = logoutPageUrl;
        this.errorPageUrl = errorPageUrl;
        this.isSamlServiceProvider = isSamlServiceProvider;
        this.isWebTierPolicy = isWebTierPolicy;
        this.isKerberosRealm = isKerberosRealm;
        this.icon = icon;
        this.isAliasApp = isAliasApp;
        this.isManagedApp = isManagedApp;
        this.serviceTypeURN = serviceTypeURN;
        this.serviceTypeVersion = serviceTypeVersion;
        this.isObligationCapable = isObligationCapable;
        this.readyToUpgrade = readyToUpgrade;
        this.trustScope = trustScope;
        this.isDatabaseService = isDatabaseService;
        this.secondaryAudiences = secondaryAudiences;
        this.isEnterpriseApp = isEnterpriseApp;
        this.bypassConsent = bypassConsent;
        this.disableKmsiTokenAuthentication = disableKmsiTokenAuthentication;
        this.isMulticloudServiceApp = isMulticloudServiceApp;
        this.radiusPolicy = radiusPolicy;
        this.appsNetworkPerimeters = appsNetworkPerimeters;
        this.cloudControlProperties = cloudControlProperties;
        this.editableAttributes = editableAttributes;
        this.termsOfUse = termsOfUse;
        this.protectableSecondaryAudiences = protectableSecondaryAudiences;
        this.idpPolicy = idpPolicy;
        this.allowedTags = allowedTags;
        this.appSignonPolicy = appSignonPolicy;
        this.trustPolicies = trustPolicies;
        this.signonPolicy = signonPolicy;
        this.identityProviders = identityProviders;
        this.accounts = accounts;
        this.grants = grants;
        this.serviceParams = serviceParams;
        this.attrRenderingMetadata = attrRenderingMetadata;
        this.basedOnTemplate = basedOnTemplate;
        this.grantedAppRoles = grantedAppRoles;
        this.samlServiceProvider = samlServiceProvider;
        this.allowedScopes = allowedScopes;
        this.certificates = certificates;
        this.aliasApps = aliasApps;
        this.asOPCService = asOPCService;
        this.adminRoles = adminRoles;
        this.userRoles = userRoles;
        this.scopes = scopes;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate =
                urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags =
                urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp =
                urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the SCIM Resource as defined by the Service Provider. Each
         * representation of the Resource MUST include a non-empty id value. This identifier MUST be
         * unique across the Service Provider's entire set of Resources. It MUST be a stable,
         * non-reassignable identifier that does not change when the same Resource is returned in
         * subsequent requests. The value of the id attribute is always issued by the Service
         * Provider and MUST never be specified by the Service Consumer. bulkId: is a reserved
         * keyword and MUST NOT be used in the unique identifier.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: string - uniqueness:
         * global
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the SCIM Resource as defined by the Service Provider. Each
         * representation of the Resource MUST include a non-empty id value. This identifier MUST be
         * unique across the Service Provider's entire set of Resources. It MUST be a stable,
         * non-reassignable identifier that does not change when the same Resource is returned in
         * subsequent requests. The value of the id attribute is always issued by the Service
         * Provider and MUST never be specified by the Service Consumer. bulkId: is a reserved
         * keyword and MUST NOT be used in the unique identifier.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: string - uniqueness:
         * global
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
         * Unique OCI identifier for the SCIM Resource.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * global
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocid")
        private String ocid;

        /**
         * Unique OCI identifier for the SCIM Resource.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * global
         *
         * @param ocid the value to set
         * @return this builder
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            this.__explicitlySet__.add("ocid");
            return this;
        }
        /**
         * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the
         * supported schema version for a SCIM representation as well any schema extensions
         * supported by that representation. Each String value must be a unique URI. This
         * specification defines URIs for User, Group, and a standard \\"enterprise\\" extension.
         * All representations of SCIM schema MUST include a non-zero value array with value(s) of
         * the URIs supported by that representation. Duplicate values MUST NOT be included. Value
         * order is not specified and MUST not impact behavior.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<String> schemas;

        /**
         * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the
         * supported schema version for a SCIM representation as well any schema extensions
         * supported by that representation. Each String value must be a unique URI. This
         * specification defines URIs for User, Group, and a standard \\"enterprise\\" extension.
         * All representations of SCIM schema MUST include a non-zero value array with value(s) of
         * the URIs supported by that representation. Duplicate values MUST NOT be included. Value
         * order is not specified and MUST not impact behavior.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param schemas the value to set
         * @return this builder
         */
        public Builder schemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            this.__explicitlySet__.add("schemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("meta")
        private Meta meta;

        public Builder meta(Meta meta) {
            this.meta = meta;
            this.__explicitlySet__.add("meta");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsCreatedBy")
        private IdcsCreatedBy idcsCreatedBy;

        public Builder idcsCreatedBy(IdcsCreatedBy idcsCreatedBy) {
            this.idcsCreatedBy = idcsCreatedBy;
            this.__explicitlySet__.add("idcsCreatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsLastModifiedBy")
        private IdcsLastModifiedBy idcsLastModifiedBy;

        public Builder idcsLastModifiedBy(IdcsLastModifiedBy idcsLastModifiedBy) {
            this.idcsLastModifiedBy = idcsLastModifiedBy;
            this.__explicitlySet__.add("idcsLastModifiedBy");
            return this;
        }
        /**
         * Each value of this attribute specifies an operation that only an internal client may
         * perform on this particular resource.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsPreventedOperations")
        private java.util.List<IdcsPreventedOperations> idcsPreventedOperations;

        /**
         * Each value of this attribute specifies an operation that only an internal client may
         * perform on this particular resource.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: string - uniqueness: none
         *
         * @param idcsPreventedOperations the value to set
         * @return this builder
         */
        public Builder idcsPreventedOperations(
                java.util.List<IdcsPreventedOperations> idcsPreventedOperations) {
            this.idcsPreventedOperations = idcsPreventedOperations;
            this.__explicitlySet__.add("idcsPreventedOperations");
            return this;
        }
        /**
         * A list of tags on this resource.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tags> tags;

        /**
         * A list of tags on this resource.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param tags the value to set
         * @return this builder
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /**
         * A boolean flag indicating this resource in the process of being deleted. Usually set to
         * true when synchronous deletion of the resource would take too long.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deleteInProgress")
        private Boolean deleteInProgress;

        /**
         * A boolean flag indicating this resource in the process of being deleted. Usually set to
         * true when synchronous deletion of the resource would take too long.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param deleteInProgress the value to set
         * @return this builder
         */
        public Builder deleteInProgress(Boolean deleteInProgress) {
            this.deleteInProgress = deleteInProgress;
            this.__explicitlySet__.add("deleteInProgress");
            return this;
        }
        /**
         * The release number when the resource was upgraded.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsLastUpgradedInRelease")
        private String idcsLastUpgradedInRelease;

        /**
         * The release number when the resource was upgraded.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         *
         * @param idcsLastUpgradedInRelease the value to set
         * @return this builder
         */
        public Builder idcsLastUpgradedInRelease(String idcsLastUpgradedInRelease) {
            this.idcsLastUpgradedInRelease = idcsLastUpgradedInRelease;
            this.__explicitlySet__.add("idcsLastUpgradedInRelease");
            return this;
        }
        /**
         * OCI Domain Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domainOcid")
        private String domainOcid;

        /**
         * OCI Domain Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param domainOcid the value to set
         * @return this builder
         */
        public Builder domainOcid(String domainOcid) {
            this.domainOcid = domainOcid;
            this.__explicitlySet__.add("domainOcid");
            return this;
        }
        /**
         * OCI Compartment Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentOcid")
        private String compartmentOcid;

        /**
         * OCI Compartment Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param compartmentOcid the value to set
         * @return this builder
         */
        public Builder compartmentOcid(String compartmentOcid) {
            this.compartmentOcid = compartmentOcid;
            this.__explicitlySet__.add("compartmentOcid");
            return this;
        }
        /**
         * OCI Tenant Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyOcid")
        private String tenancyOcid;

        /**
         * OCI Tenant Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param tenancyOcid the value to set
         * @return this builder
         */
        public Builder tenancyOcid(String tenancyOcid) {
            this.tenancyOcid = tenancyOcid;
            this.__explicitlySet__.add("tenancyOcid");
            return this;
        }
        /**
         * Indicates whether the application is billed as an OPCService. If true, customer is not
         * billed for runtime operations of the app.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: always - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("meterAsOPCService")
        private Boolean meterAsOPCService;

        /**
         * Indicates whether the application is billed as an OPCService. If true, customer is not
         * billed for runtime operations of the app.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: always - type: boolean - uniqueness: none
         *
         * @param meterAsOPCService the value to set
         * @return this builder
         */
        public Builder meterAsOPCService(Boolean meterAsOPCService) {
            this.meterAsOPCService = meterAsOPCService;
            this.__explicitlySet__.add("meterAsOPCService");
            return this;
        }
        /**
         * Name of the application. Also serves as username if the application authenticates to
         * Oracle Public Cloud infrastructure. This name may not be user-friendly and cannot be
         * changed once an App is created.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the application. Also serves as username if the application authenticates to
         * Oracle Public Cloud infrastructure. This name may not be user-friendly and cannot be
         * changed once an App is created.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * server
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
         * This value is the credential of this App, which this App supplies as a password when this
         * App authenticates to the Oracle Public Cloud infrastructure. This value is also the
         * client secret of this App when it acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - idcsSensitive: none
         * - multiValued: false - mutability: readOnly - required: false - returned: default - type:
         * string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private String clientSecret;

        /**
         * This value is the credential of this App, which this App supplies as a password when this
         * App authenticates to the Oracle Public Cloud infrastructure. This value is also the
         * client secret of this App when it acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - idcsSensitive: none
         * - multiValued: false - mutability: readOnly - required: false - returned: default - type:
         * string - uniqueness: none
         *
         * @param clientSecret the value to set
         * @return this builder
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }
        /**
         * Hashed Client Secret. This hash-value is used to verify the 'clientSecret' credential of
         * this App
         *
         * <p>*Added In:** 2106240046
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: hash_sc - multiValued:
         * false - mutability: readOnly - required: false - returned: request - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hashedClientSecret")
        private String hashedClientSecret;

        /**
         * Hashed Client Secret. This hash-value is used to verify the 'clientSecret' credential of
         * this App
         *
         * <p>*Added In:** 2106240046
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: hash_sc - multiValued:
         * false - mutability: readOnly - required: false - returned: request - type: string -
         * uniqueness: none
         *
         * @param hashedClientSecret the value to set
         * @return this builder
         */
        public Builder hashedClientSecret(String hashedClientSecret) {
            this.hashedClientSecret = hashedClientSecret;
            this.__explicitlySet__.add("hashedClientSecret");
            return this;
        }
        /**
         * Display name of the application. Display name is intended to be user-friendly, and an
         * administrator can change the value at any time.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the application. Display name is intended to be user-friendly, and an
         * administrator can change the value at any time.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * server
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Description of the application.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the application.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
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
         * Encryption Alogrithm to use for encrypting ID token.
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idTokenEncAlgo")
        private String idTokenEncAlgo;

        /**
         * Encryption Alogrithm to use for encrypting ID token.
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param idTokenEncAlgo the value to set
         * @return this builder
         */
        public Builder idTokenEncAlgo(String idTokenEncAlgo) {
            this.idTokenEncAlgo = idTokenEncAlgo;
            this.__explicitlySet__.add("idTokenEncAlgo");
            return this;
        }
        /**
         * Service Names allow to use OCI signature for client authentication instead of client
         * credentials
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("delegatedServiceNames")
        private java.util.List<String> delegatedServiceNames;

        /**
         * Service Names allow to use OCI signature for client authentication instead of client
         * credentials
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param delegatedServiceNames the value to set
         * @return this builder
         */
        public Builder delegatedServiceNames(java.util.List<String> delegatedServiceNames) {
            this.delegatedServiceNames = delegatedServiceNames;
            this.__explicitlySet__.add("delegatedServiceNames");
            return this;
        }
        /**
         * If true, this App is able to participate in runtime services, such as automatic-login,
         * OAuth, and SAML. If false, all runtime services are disabled for this App, and only
         * administrative operations can be performed.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        private Boolean active;

        /**
         * If true, this App is able to participate in runtime services, such as automatic-login,
         * OAuth, and SAML. If false, all runtime services are disabled for this App, and only
         * administrative operations can be performed.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param active the value to set
         * @return this builder
         */
        public Builder active(Boolean active) {
            this.active = active;
            this.__explicitlySet__.add("active");
            return this;
        }
        /**
         * Application icon.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appIcon")
        private String appIcon;

        /**
         * Application icon.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         *
         * @param appIcon the value to set
         * @return this builder
         */
        public Builder appIcon(String appIcon) {
            this.appIcon = appIcon;
            this.__explicitlySet__.add("appIcon");
            return this;
        }
        /**
         * Application thumbnail.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appThumbnail")
        private String appThumbnail;

        /**
         * Application thumbnail.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: string - uniqueness: none
         *
         * @param appThumbnail the value to set
         * @return this builder
         */
        public Builder appThumbnail(String appThumbnail) {
            this.appThumbnail = appThumbnail;
            this.__explicitlySet__.add("appThumbnail");
            return this;
        }
        /**
         * If true, this App was migrated from an earlier version of Oracle Public Cloud
         * infrastructure (and may therefore require special handling from runtime services such as
         * OAuth or SAML). If false, this App requires no special handling from runtime services.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("migrated")
        private Boolean migrated;

        /**
         * If true, this App was migrated from an earlier version of Oracle Public Cloud
         * infrastructure (and may therefore require special handling from runtime services such as
         * OAuth or SAML). If false, this App requires no special handling from runtime services.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param migrated the value to set
         * @return this builder
         */
        public Builder migrated(Boolean migrated) {
            this.migrated = migrated;
            this.__explicitlySet__.add("migrated");
            return this;
        }
        /**
         * If true, this App is an internal infrastructure App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructure")
        private Boolean infrastructure;

        /**
         * If true, this App is an internal infrastructure App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param infrastructure the value to set
         * @return this builder
         */
        public Builder infrastructure(Boolean infrastructure) {
            this.infrastructure = infrastructure;
            this.__explicitlySet__.add("infrastructure");
            return this;
        }
        /**
         * If true, this App allows runtime services to log end users into this App automatically.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLoginTarget")
        private Boolean isLoginTarget;

        /**
         * If true, this App allows runtime services to log end users into this App automatically.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isLoginTarget the value to set
         * @return this builder
         */
        public Builder isLoginTarget(Boolean isLoginTarget) {
            this.isLoginTarget = isLoginTarget;
            this.__explicitlySet__.add("isLoginTarget");
            return this;
        }
        /**
         * If true, this app will be displayed in the MyApps page of each end-user who has access to
         * the App.
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("showInMyApps")
        private Boolean showInMyApps;

        /**
         * If true, this app will be displayed in the MyApps page of each end-user who has access to
         * the App.
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param showInMyApps the value to set
         * @return this builder
         */
        public Builder showInMyApps(Boolean showInMyApps) {
            this.showInMyApps = showInMyApps;
            this.__explicitlySet__.add("showInMyApps");
            return this;
        }
        /**
         * The protocol that runtime services will use to log end users in to this App
         * automatically. If 'OIDC', then runtime services use the OpenID Connect protocol. If
         * 'SAML', then runtime services use Security Assertion Markup Language protocol.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loginMechanism")
        private LoginMechanism loginMechanism;

        /**
         * The protocol that runtime services will use to log end users in to this App
         * automatically. If 'OIDC', then runtime services use the OpenID Connect protocol. If
         * 'SAML', then runtime services use Security Assertion Markup Language protocol.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param loginMechanism the value to set
         * @return this builder
         */
        public Builder loginMechanism(LoginMechanism loginMechanism) {
            this.loginMechanism = loginMechanism;
            this.__explicitlySet__.add("loginMechanism");
            return this;
        }
        /**
         * The URL of the landing page for this App, which is the first page that an end user should
         * see if runtime services log that end user in to this App automatically.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("landingPageUrl")
        private String landingPageUrl;

        /**
         * The URL of the landing page for this App, which is the first page that an end user should
         * see if runtime services log that end user in to this App automatically.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param landingPageUrl the value to set
         * @return this builder
         */
        public Builder landingPageUrl(String landingPageUrl) {
            this.landingPageUrl = landingPageUrl;
            this.__explicitlySet__.add("landingPageUrl");
            return this;
        }
        /**
         * Application Logo URL
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("productLogoUrl")
        private String productLogoUrl;

        /**
         * Application Logo URL
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param productLogoUrl the value to set
         * @return this builder
         */
        public Builder productLogoUrl(String productLogoUrl) {
            this.productLogoUrl = productLogoUrl;
            this.__explicitlySet__.add("productLogoUrl");
            return this;
        }
        /**
         * Privacy Policy URL
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privacyPolicyUrl")
        private String privacyPolicyUrl;

        /**
         * Privacy Policy URL
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param privacyPolicyUrl the value to set
         * @return this builder
         */
        public Builder privacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            this.__explicitlySet__.add("privacyPolicyUrl");
            return this;
        }
        /**
         * Terms of Service URL
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("termsOfServiceUrl")
        private String termsOfServiceUrl;

        /**
         * Terms of Service URL
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param termsOfServiceUrl the value to set
         * @return this builder
         */
        public Builder termsOfServiceUrl(String termsOfServiceUrl) {
            this.termsOfServiceUrl = termsOfServiceUrl;
            this.__explicitlySet__.add("termsOfServiceUrl");
            return this;
        }
        /**
         * Contact Email Address
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmailAddress")
        private String contactEmailAddress;

        /**
         * Contact Email Address
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param contactEmailAddress the value to set
         * @return this builder
         */
        public Builder contactEmailAddress(String contactEmailAddress) {
            this.contactEmailAddress = contactEmailAddress;
            this.__explicitlySet__.add("contactEmailAddress");
            return this;
        }
        /**
         * Product Name
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * Product Name
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param productName the value to set
         * @return this builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /**
         * Home Page URL
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("homePageUrl")
        private String homePageUrl;

        /**
         * Home Page URL
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param homePageUrl the value to set
         * @return this builder
         */
        public Builder homePageUrl(String homePageUrl) {
            this.homePageUrl = homePageUrl;
            this.__explicitlySet__.add("homePageUrl");
            return this;
        }
        /**
         * If true, this application acts as FormFill Application
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFormFill")
        private Boolean isFormFill;

        /**
         * If true, this application acts as FormFill Application
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isFormFill the value to set
         * @return this builder
         */
        public Builder isFormFill(Boolean isFormFill) {
            this.isFormFill = isFormFill;
            this.__explicitlySet__.add("isFormFill");
            return this;
        }
        /**
         * If true, this application acts as an OAuth Client
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOAuthClient")
        private Boolean isOAuthClient;

        /**
         * If true, this application acts as an OAuth Client
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isOAuthClient the value to set
         * @return this builder
         */
        public Builder isOAuthClient(Boolean isOAuthClient) {
            this.isOAuthClient = isOAuthClient;
            this.__explicitlySet__.add("isOAuthClient");
            return this;
        }
        /**
         * If true, this application acts as an Radius App
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRadiusApp")
        private Boolean isRadiusApp;

        /**
         * If true, this application acts as an Radius App
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isRadiusApp the value to set
         * @return this builder
         */
        public Builder isRadiusApp(Boolean isRadiusApp) {
            this.isRadiusApp = isRadiusApp;
            this.__explicitlySet__.add("isRadiusApp");
            return this;
        }
        /**
         * Specifies the type of access that this App has when it acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientType")
        private ClientType clientType;

        /**
         * Specifies the type of access that this App has when it acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param clientType the value to set
         * @return this builder
         */
        public Builder clientType(ClientType clientType) {
            this.clientType = clientType;
            this.__explicitlySet__.add("clientType");
            return this;
        }
        /**
         * OPTIONAL. Each value is a URI within this App. This attribute is required when this App
         * acts as an OAuthClient and is involved in three-legged flows (authorization-code flows).
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("redirectUris")
        private java.util.List<String> redirectUris;

        /**
         * OPTIONAL. Each value is a URI within this App. This attribute is required when this App
         * acts as an OAuthClient and is involved in three-legged flows (authorization-code flows).
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param redirectUris the value to set
         * @return this builder
         */
        public Builder redirectUris(java.util.List<String> redirectUris) {
            this.redirectUris = redirectUris;
            this.__explicitlySet__.add("redirectUris");
            return this;
        }
        /**
         * If true, indicates that the system should allow all URL-schemes within each value of the
         * 'redirectUris' attribute. Also indicates that the system should not attempt to confirm
         * that each value of the 'redirectUris' attribute is a valid URI. In particular, the system
         * should not confirm that the domain component of the URI is a top-level domain and the
         * system should not confirm that the hostname portion is a valid system that is reachable
         * over the network.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allUrlSchemesAllowed")
        private Boolean allUrlSchemesAllowed;

        /**
         * If true, indicates that the system should allow all URL-schemes within each value of the
         * 'redirectUris' attribute. Also indicates that the system should not attempt to confirm
         * that each value of the 'redirectUris' attribute is a valid URI. In particular, the system
         * should not confirm that the domain component of the URI is a top-level domain and the
         * system should not confirm that the hostname portion is a valid system that is reachable
         * over the network.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param allUrlSchemesAllowed the value to set
         * @return this builder
         */
        public Builder allUrlSchemesAllowed(Boolean allUrlSchemesAllowed) {
            this.allUrlSchemesAllowed = allUrlSchemesAllowed;
            this.__explicitlySet__.add("allUrlSchemesAllowed");
            return this;
        }
        /**
         * OAuth will use this URI to logout if this App wants to participate in SSO, and if this
         * App's session gets cleared as part of global logout. Note: This attribute is used only if
         * this App acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutUri")
        private String logoutUri;

        /**
         * OAuth will use this URI to logout if this App wants to participate in SSO, and if this
         * App's session gets cleared as part of global logout. Note: This attribute is used only if
         * this App acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param logoutUri the value to set
         * @return this builder
         */
        public Builder logoutUri(String logoutUri) {
            this.logoutUri = logoutUri;
            this.__explicitlySet__.add("logoutUri");
            return this;
        }
        /**
         * Each value of this attribute is the URI of a landing page within this App. It is used
         * only when this App, acting as an OAuthClient, initiates the logout flow and wants to be
         * redirected back to one of its landing pages.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("postLogoutRedirectUris")
        private java.util.List<String> postLogoutRedirectUris;

        /**
         * Each value of this attribute is the URI of a landing page within this App. It is used
         * only when this App, acting as an OAuthClient, initiates the logout flow and wants to be
         * redirected back to one of its landing pages.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param postLogoutRedirectUris the value to set
         * @return this builder
         */
        public Builder postLogoutRedirectUris(java.util.List<String> postLogoutRedirectUris) {
            this.postLogoutRedirectUris = postLogoutRedirectUris;
            this.__explicitlySet__.add("postLogoutRedirectUris");
            return this;
        }
        /**
         * List of grant-types that this App is allowed to use when it acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedGrants")
        private java.util.List<String> allowedGrants;

        /**
         * List of grant-types that this App is allowed to use when it acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param allowedGrants the value to set
         * @return this builder
         */
        public Builder allowedGrants(java.util.List<String> allowedGrants) {
            this.allowedGrants = allowedGrants;
            this.__explicitlySet__.add("allowedGrants");
            return this;
        }
        /**
         * OPTIONAL. Required only when this App acts as an OAuthClient. Supported values are
         * 'introspect' and 'onBehalfOfUser'. The value 'introspect' allows the client to look
         * inside the access-token. The value 'onBehalfOfUser' overrides how the client's privileges
         * are combined with the privileges of the Subject User. Ordinarily, authorization
         * calculates the set of effective privileges as the intersection of the client's privileges
         * and the user's privileges. The value 'onBehalfOf' indicates that authorization should
         * ignore the privileges of the client and use only the user's privileges to calculate the
         * effective privileges.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedOperations")
        private java.util.List<AllowedOperations> allowedOperations;

        /**
         * OPTIONAL. Required only when this App acts as an OAuthClient. Supported values are
         * 'introspect' and 'onBehalfOfUser'. The value 'introspect' allows the client to look
         * inside the access-token. The value 'onBehalfOfUser' overrides how the client's privileges
         * are combined with the privileges of the Subject User. Ordinarily, authorization
         * calculates the set of effective privileges as the intersection of the client's privileges
         * and the user's privileges. The value 'onBehalfOf' indicates that authorization should
         * ignore the privileges of the client and use only the user's privileges to calculate the
         * effective privileges.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param allowedOperations the value to set
         * @return this builder
         */
        public Builder allowedOperations(java.util.List<AllowedOperations> allowedOperations) {
            this.allowedOperations = allowedOperations;
            this.__explicitlySet__.add("allowedOperations");
            return this;
        }
        /**
         * Network Perimeters checking mode
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientIPChecking")
        private ClientIPChecking clientIPChecking;

        /**
         * Network Perimeters checking mode
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param clientIPChecking the value to set
         * @return this builder
         */
        public Builder clientIPChecking(ClientIPChecking clientIPChecking) {
            this.clientIPChecking = clientIPChecking;
            this.__explicitlySet__.add("clientIPChecking");
            return this;
        }
        /**
         * If true, this application is an Oracle Public Cloud service-instance.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOPCService")
        private Boolean isOPCService;

        /**
         * If true, this application is an Oracle Public Cloud service-instance.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isOPCService the value to set
         * @return this builder
         */
        public Builder isOPCService(Boolean isOPCService) {
            this.isOPCService = isOPCService;
            this.__explicitlySet__.add("isOPCService");
            return this;
        }
        /**
         * If true, indicates that this application accepts an Oracle Cloud Identity Service User as
         * a login-identity (does not require an account) and relies for authorization on the User's
         * memberships in AppRoles.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isUnmanagedApp")
        private Boolean isUnmanagedApp;

        /**
         * If true, indicates that this application accepts an Oracle Cloud Identity Service User as
         * a login-identity (does not require an account) and relies for authorization on the User's
         * memberships in AppRoles.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isUnmanagedApp the value to set
         * @return this builder
         */
        public Builder isUnmanagedApp(Boolean isUnmanagedApp) {
            this.isUnmanagedApp = isUnmanagedApp;
            this.__explicitlySet__.add("isUnmanagedApp");
            return this;
        }
        /**
         * If true, any managed App that is based on this template is checked for access control
         * that is, access to this app is subject to successful authorization at SSO service, viz.
         * app grants to start with.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowAccessControl")
        private Boolean allowAccessControl;

        /**
         * If true, any managed App that is based on this template is checked for access control
         * that is, access to this app is subject to successful authorization at SSO service, viz.
         * app grants to start with.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param allowAccessControl the value to set
         * @return this builder
         */
        public Builder allowAccessControl(Boolean allowAccessControl) {
            this.allowAccessControl = allowAccessControl;
            this.__explicitlySet__.add("allowAccessControl");
            return this;
        }
        /**
         * If true, indicates that this application acts as an OAuth Resource.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOAuthResource")
        private Boolean isOAuthResource;

        /**
         * If true, indicates that this application acts as an OAuth Resource.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isOAuthResource the value to set
         * @return this builder
         */
        public Builder isOAuthResource(Boolean isOAuthResource) {
            this.isOAuthResource = isOAuthResource;
            this.__explicitlySet__.add("isOAuthResource");
            return this;
        }
        /**
         * Expiry-time in seconds for an Access Token. Any token that allows access to this App will
         * expire after the specified duration.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessTokenExpiry")
        private Integer accessTokenExpiry;

        /**
         * Expiry-time in seconds for an Access Token. Any token that allows access to this App will
         * expire after the specified duration.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param accessTokenExpiry the value to set
         * @return this builder
         */
        public Builder accessTokenExpiry(Integer accessTokenExpiry) {
            this.accessTokenExpiry = accessTokenExpiry;
            this.__explicitlySet__.add("accessTokenExpiry");
            return this;
        }
        /**
         * Expiry-time in seconds for a Refresh Token. Any token that allows access to this App,
         * once refreshed, will expire after the specified duration.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenExpiry")
        private Integer refreshTokenExpiry;

        /**
         * Expiry-time in seconds for a Refresh Token. Any token that allows access to this App,
         * once refreshed, will expire after the specified duration.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param refreshTokenExpiry the value to set
         * @return this builder
         */
        public Builder refreshTokenExpiry(Integer refreshTokenExpiry) {
            this.refreshTokenExpiry = refreshTokenExpiry;
            this.__explicitlySet__.add("refreshTokenExpiry");
            return this;
        }
        /**
         * If true, indicates that the Refresh Token is allowed when this App acts as an OAuth
         * Resource.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowOffline")
        private Boolean allowOffline;

        /**
         * If true, indicates that the Refresh Token is allowed when this App acts as an OAuth
         * Resource.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param allowOffline the value to set
         * @return this builder
         */
        public Builder allowOffline(Boolean allowOffline) {
            this.allowOffline = allowOffline;
            this.__explicitlySet__.add("allowOffline");
            return this;
        }
        /**
         * Callback Service URL
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("callbackServiceUrl")
        private String callbackServiceUrl;

        /**
         * Callback Service URL
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param callbackServiceUrl the value to set
         * @return this builder
         */
        public Builder callbackServiceUrl(String callbackServiceUrl) {
            this.callbackServiceUrl = callbackServiceUrl;
            this.__explicitlySet__.add("callbackServiceUrl");
            return this;
        }
        /**
         * The base URI for all of the scopes defined in this App. The value of 'audience' is
         * combined with the 'value' of each scope to form an 'fqs' or fully qualified scope.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("audience")
        private String audience;

        /**
         * The base URI for all of the scopes defined in this App. The value of 'audience' is
         * combined with the 'value' of each scope to form an 'fqs' or fully qualified scope.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param audience the value to set
         * @return this builder
         */
        public Builder audience(String audience) {
            this.audience = audience;
            this.__explicitlySet__.add("audience");
            return this;
        }
        /**
         * If true, indicates that the App should be visible in each end-user's mobile application.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMobileTarget")
        private Boolean isMobileTarget;

        /**
         * If true, indicates that the App should be visible in each end-user's mobile application.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isMobileTarget the value to set
         * @return this builder
         */
        public Builder isMobileTarget(Boolean isMobileTarget) {
            this.isMobileTarget = isMobileTarget;
            this.__explicitlySet__.add("isMobileTarget");
            return this;
        }
        /**
         * This attribute specifies the URL of the page that the App uses when an end-user signs in
         * to that App.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loginPageUrl")
        private String loginPageUrl;

        /**
         * This attribute specifies the URL of the page that the App uses when an end-user signs in
         * to that App.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param loginPageUrl the value to set
         * @return this builder
         */
        public Builder loginPageUrl(String loginPageUrl) {
            this.loginPageUrl = loginPageUrl;
            this.__explicitlySet__.add("loginPageUrl");
            return this;
        }
        /**
         * This attribute specifies the callback URL for the social linking operation.
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("linkingCallbackUrl")
        private String linkingCallbackUrl;

        /**
         * This attribute specifies the callback URL for the social linking operation.
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param linkingCallbackUrl the value to set
         * @return this builder
         */
        public Builder linkingCallbackUrl(String linkingCallbackUrl) {
            this.linkingCallbackUrl = linkingCallbackUrl;
            this.__explicitlySet__.add("linkingCallbackUrl");
            return this;
        }
        /**
         * This attribute specifies the URL of the page that the App uses when an end-user signs
         * out.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutPageUrl")
        private String logoutPageUrl;

        /**
         * This attribute specifies the URL of the page that the App uses when an end-user signs
         * out.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param logoutPageUrl the value to set
         * @return this builder
         */
        public Builder logoutPageUrl(String logoutPageUrl) {
            this.logoutPageUrl = logoutPageUrl;
            this.__explicitlySet__.add("logoutPageUrl");
            return this;
        }
        /**
         * This attribute specifies the URL of the page to which an application will redirect an
         * end-user in case of error.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("errorPageUrl")
        private String errorPageUrl;

        /**
         * This attribute specifies the URL of the page to which an application will redirect an
         * end-user in case of error.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param errorPageUrl the value to set
         * @return this builder
         */
        public Builder errorPageUrl(String errorPageUrl) {
            this.errorPageUrl = errorPageUrl;
            this.__explicitlySet__.add("errorPageUrl");
            return this;
        }
        /**
         * If true, then this App acts as a SAML Service Provider.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSamlServiceProvider")
        private Boolean isSamlServiceProvider;

        /**
         * If true, then this App acts as a SAML Service Provider.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isSamlServiceProvider the value to set
         * @return this builder
         */
        public Builder isSamlServiceProvider(Boolean isSamlServiceProvider) {
            this.isSamlServiceProvider = isSamlServiceProvider;
            this.__explicitlySet__.add("isSamlServiceProvider");
            return this;
        }
        /**
         * If true, the webtier policy is active
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isWebTierPolicy")
        private Boolean isWebTierPolicy;

        /**
         * If true, the webtier policy is active
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isWebTierPolicy the value to set
         * @return this builder
         */
        public Builder isWebTierPolicy(Boolean isWebTierPolicy) {
            this.isWebTierPolicy = isWebTierPolicy;
            this.__explicitlySet__.add("isWebTierPolicy");
            return this;
        }
        /**
         * If true, indicates that this App supports Kerberos Authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isKerberosRealm")
        private Boolean isKerberosRealm;

        /**
         * If true, indicates that this App supports Kerberos Authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isKerberosRealm the value to set
         * @return this builder
         */
        public Builder isKerberosRealm(Boolean isKerberosRealm) {
            this.isKerberosRealm = isKerberosRealm;
            this.__explicitlySet__.add("isKerberosRealm");
            return this;
        }
        /**
         * URL of application icon.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("icon")
        private String icon;

        /**
         * URL of application icon.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: reference - uniqueness: none
         *
         * @param icon the value to set
         * @return this builder
         */
        public Builder icon(String icon) {
            this.icon = icon;
            this.__explicitlySet__.add("icon");
            return this;
        }
        /**
         * If true, this App is an AliasApp and it cannot be granted to an end-user directly.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: always - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAliasApp")
        private Boolean isAliasApp;

        /**
         * If true, this App is an AliasApp and it cannot be granted to an end-user directly.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: always - type: boolean - uniqueness: none
         *
         * @param isAliasApp the value to set
         * @return this builder
         */
        public Builder isAliasApp(Boolean isAliasApp) {
            this.isAliasApp = isAliasApp;
            this.__explicitlySet__.add("isAliasApp");
            return this;
        }
        /**
         * If true, indicates that access to this App requires an account. That is, in order to log
         * in to the App, a User must use an application-specific identity that is maintained in the
         * remote identity-repository of that App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isManagedApp")
        private Boolean isManagedApp;

        /**
         * If true, indicates that access to this App requires an account. That is, in order to log
         * in to the App, a User must use an application-specific identity that is maintained in the
         * remote identity-repository of that App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isManagedApp the value to set
         * @return this builder
         */
        public Builder isManagedApp(Boolean isManagedApp) {
            this.isManagedApp = isManagedApp;
            this.__explicitlySet__.add("isManagedApp");
            return this;
        }
        /**
         * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service
         * of which this app is an instance.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceTypeURN")
        private String serviceTypeURN;

        /**
         * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service
         * of which this app is an instance.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param serviceTypeURN the value to set
         * @return this builder
         */
        public Builder serviceTypeURN(String serviceTypeURN) {
            this.serviceTypeURN = serviceTypeURN;
            this.__explicitlySet__.add("serviceTypeURN");
            return this;
        }
        /**
         * This value specifies the version of the Oracle Public Cloud service of which this App is
         * an instance
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceTypeVersion")
        private String serviceTypeVersion;

        /**
         * This value specifies the version of the Oracle Public Cloud service of which this App is
         * an instance
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param serviceTypeVersion the value to set
         * @return this builder
         */
        public Builder serviceTypeVersion(String serviceTypeVersion) {
            this.serviceTypeVersion = serviceTypeVersion;
            this.__explicitlySet__.add("serviceTypeVersion");
            return this;
        }
        /**
         * This flag indicates if the App is capable of validating obligations with the token for
         * allowing access to the App.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isObligationCapable")
        private Boolean isObligationCapable;

        /**
         * This flag indicates if the App is capable of validating obligations with the token for
         * allowing access to the App.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param isObligationCapable the value to set
         * @return this builder
         */
        public Builder isObligationCapable(Boolean isObligationCapable) {
            this.isObligationCapable = isObligationCapable;
            this.__explicitlySet__.add("isObligationCapable");
            return this;
        }
        /**
         * If true, this App requires an upgrade and mandates attention from application
         * administrator. The flag is used by UI to indicate this app is ready to upgrade.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("readyToUpgrade")
        private Boolean readyToUpgrade;

        /**
         * If true, this App requires an upgrade and mandates attention from application
         * administrator. The flag is used by UI to indicate this app is ready to upgrade.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param readyToUpgrade the value to set
         * @return this builder
         */
        public Builder readyToUpgrade(Boolean readyToUpgrade) {
            this.readyToUpgrade = readyToUpgrade;
            this.__explicitlySet__.add("readyToUpgrade");
            return this;
        }
        /**
         * Indicates the scope of trust for this App when acting as an OAuthClient. A value of
         * 'Explicit' indicates that the App is allowed to access only the scopes of OAuthResources
         * that are explicitly specified as 'allowedScopes'. A value of 'Account' indicates that the
         * App is allowed implicitly to access any scope of any OAuthResource within the same Oracle
         * Cloud Account. A value of 'Tags' indicates that the App is allowed to access any scope of
         * any OAuthResource with a matching tag within the same Oracle Cloud Account. A value of
         * 'Default' indicates that the Tenant default trust scope configured in the Tenant Settings
         * is used.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustScope")
        private TrustScope trustScope;

        /**
         * Indicates the scope of trust for this App when acting as an OAuthClient. A value of
         * 'Explicit' indicates that the App is allowed to access only the scopes of OAuthResources
         * that are explicitly specified as 'allowedScopes'. A value of 'Account' indicates that the
         * App is allowed implicitly to access any scope of any OAuthResource within the same Oracle
         * Cloud Account. A value of 'Tags' indicates that the App is allowed to access any scope of
         * any OAuthResource with a matching tag within the same Oracle Cloud Account. A value of
         * 'Default' indicates that the Tenant default trust scope configured in the Tenant Settings
         * is used.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param trustScope the value to set
         * @return this builder
         */
        public Builder trustScope(TrustScope trustScope) {
            this.trustScope = trustScope;
            this.__explicitlySet__.add("trustScope");
            return this;
        }
        /**
         * If true, this application acts as database service Application
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDatabaseService")
        private Boolean isDatabaseService;

        /**
         * If true, this application acts as database service Application
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - type: boolean
         *
         * @param isDatabaseService the value to set
         * @return this builder
         */
        public Builder isDatabaseService(Boolean isDatabaseService) {
            this.isDatabaseService = isDatabaseService;
            this.__explicitlySet__.add("isDatabaseService");
            return this;
        }
        /**
         * A list of secondary audiences--additional URIs to be added automatically to any OAuth
         * token that allows access to this App. Note: This attribute is used mainly for backward
         * compatibility in certain Oracle Public Cloud Apps.
         *
         * <p>*Deprecated Since: 18.2.6**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryAudiences")
        private java.util.List<String> secondaryAudiences;

        /**
         * A list of secondary audiences--additional URIs to be added automatically to any OAuth
         * token that allows access to this App. Note: This attribute is used mainly for backward
         * compatibility in certain Oracle Public Cloud Apps.
         *
         * <p>*Deprecated Since: 18.2.6**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param secondaryAudiences the value to set
         * @return this builder
         */
        public Builder secondaryAudiences(java.util.List<String> secondaryAudiences) {
            this.secondaryAudiences = secondaryAudiences;
            this.__explicitlySet__.add("secondaryAudiences");
            return this;
        }
        /**
         * If true, this app acts as Enterprise app with Authentication and URL Authz policy.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnterpriseApp")
        private Boolean isEnterpriseApp;

        /**
         * If true, this app acts as Enterprise app with Authentication and URL Authz policy.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isEnterpriseApp the value to set
         * @return this builder
         */
        public Builder isEnterpriseApp(Boolean isEnterpriseApp) {
            this.isEnterpriseApp = isEnterpriseApp;
            this.__explicitlySet__.add("isEnterpriseApp");
            return this;
        }
        /**
         * If true, indicates that consent should be skipped for all scopes
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bypassConsent")
        private Boolean bypassConsent;

        /**
         * If true, indicates that consent should be skipped for all scopes
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param bypassConsent the value to set
         * @return this builder
         */
        public Builder bypassConsent(Boolean bypassConsent) {
            this.bypassConsent = bypassConsent;
            this.__explicitlySet__.add("bypassConsent");
            return this;
        }
        /**
         * Indicates whether the application is allowed to be access using kmsi token.
         *
         * <p>*Added In:** 2111190457
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: always - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disableKmsiTokenAuthentication")
        private Boolean disableKmsiTokenAuthentication;

        /**
         * Indicates whether the application is allowed to be access using kmsi token.
         *
         * <p>*Added In:** 2111190457
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: always - type: boolean - uniqueness: none
         *
         * @param disableKmsiTokenAuthentication the value to set
         * @return this builder
         */
        public Builder disableKmsiTokenAuthentication(Boolean disableKmsiTokenAuthentication) {
            this.disableKmsiTokenAuthentication = disableKmsiTokenAuthentication;
            this.__explicitlySet__.add("disableKmsiTokenAuthentication");
            return this;
        }
        /**
         * If true, indicates the app is used for multicloud service integration.
         *
         * <p>*Added In:** 2301202328
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMulticloudServiceApp")
        private Boolean isMulticloudServiceApp;

        /**
         * If true, indicates the app is used for multicloud service integration.
         *
         * <p>*Added In:** 2301202328
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isMulticloudServiceApp the value to set
         * @return this builder
         */
        public Builder isMulticloudServiceApp(Boolean isMulticloudServiceApp) {
            this.isMulticloudServiceApp = isMulticloudServiceApp;
            this.__explicitlySet__.add("isMulticloudServiceApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("radiusPolicy")
        private AppRadiusPolicy radiusPolicy;

        public Builder radiusPolicy(AppRadiusPolicy radiusPolicy) {
            this.radiusPolicy = radiusPolicy;
            this.__explicitlySet__.add("radiusPolicy");
            return this;
        }
        /**
         * Network Perimeter
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appsNetworkPerimeters")
        private java.util.List<AppAppsNetworkPerimeters> appsNetworkPerimeters;

        /**
         * Network Perimeter
         *
         * <p>*Added In:** 2010242156
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex
         *
         * @param appsNetworkPerimeters the value to set
         * @return this builder
         */
        public Builder appsNetworkPerimeters(
                java.util.List<AppAppsNetworkPerimeters> appsNetworkPerimeters) {
            this.appsNetworkPerimeters = appsNetworkPerimeters;
            this.__explicitlySet__.add("appsNetworkPerimeters");
            return this;
        }
        /**
         * A collection of arbitrary properties that scope the privileges of a cloud-control App.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudControlProperties")
        private java.util.List<AppCloudControlProperties> cloudControlProperties;

        /**
         * A collection of arbitrary properties that scope the privileges of a cloud-control App.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param cloudControlProperties the value to set
         * @return this builder
         */
        public Builder cloudControlProperties(
                java.util.List<AppCloudControlProperties> cloudControlProperties) {
            this.cloudControlProperties = cloudControlProperties;
            this.__explicitlySet__.add("cloudControlProperties");
            return this;
        }
        /**
         * App attributes editable by subject
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
         * false - multiValued: true - mutability: readOnly - required: false - returned: request -
         * type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("editableAttributes")
        private java.util.List<AppEditableAttributes> editableAttributes;

        /**
         * App attributes editable by subject
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
         * false - multiValued: true - mutability: readOnly - required: false - returned: request -
         * type: complex - uniqueness: none
         *
         * @param editableAttributes the value to set
         * @return this builder
         */
        public Builder editableAttributes(
                java.util.List<AppEditableAttributes> editableAttributes) {
            this.editableAttributes = editableAttributes;
            this.__explicitlySet__.add("editableAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termsOfUse")
        private AppTermsOfUse termsOfUse;

        public Builder termsOfUse(AppTermsOfUse termsOfUse) {
            this.termsOfUse = termsOfUse;
            this.__explicitlySet__.add("termsOfUse");
            return this;
        }
        /**
         * A list of secondary audiences--additional URIs to be added automatically to any OAuth
         * token that allows access to this App. Note: This attribute is used mainly for backward
         * compatibility in certain Oracle Public Cloud Apps.
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
         * false - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectableSecondaryAudiences")
        private java.util.List<AppProtectableSecondaryAudiences> protectableSecondaryAudiences;

        /**
         * A list of secondary audiences--additional URIs to be added automatically to any OAuth
         * token that allows access to this App. Note: This attribute is used mainly for backward
         * compatibility in certain Oracle Public Cloud Apps.
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
         * false - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         *
         * @param protectableSecondaryAudiences the value to set
         * @return this builder
         */
        public Builder protectableSecondaryAudiences(
                java.util.List<AppProtectableSecondaryAudiences> protectableSecondaryAudiences) {
            this.protectableSecondaryAudiences = protectableSecondaryAudiences;
            this.__explicitlySet__.add("protectableSecondaryAudiences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idpPolicy")
        private AppIdpPolicy idpPolicy;

        public Builder idpPolicy(AppIdpPolicy idpPolicy) {
            this.idpPolicy = idpPolicy;
            this.__explicitlySet__.add("idpPolicy");
            return this;
        }
        /**
         * A list of tags, acting as an OAuthClient, this App is allowed to access.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: default - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedTags")
        private java.util.List<AppAllowedTags> allowedTags;

        /**
         * A list of tags, acting as an OAuthClient, this App is allowed to access.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: default - type:
         * complex - uniqueness: none
         *
         * @param allowedTags the value to set
         * @return this builder
         */
        public Builder allowedTags(java.util.List<AppAllowedTags> allowedTags) {
            this.allowedTags = allowedTags;
            this.__explicitlySet__.add("allowedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("appSignonPolicy")
        private AppAppSignonPolicy appSignonPolicy;

        public Builder appSignonPolicy(AppAppSignonPolicy appSignonPolicy) {
            this.appSignonPolicy = appSignonPolicy;
            this.__explicitlySet__.add("appSignonPolicy");
            return this;
        }
        /**
         * Trust Policies.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: default - type:
         * complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustPolicies")
        private java.util.List<AppTrustPolicies> trustPolicies;

        /**
         * Trust Policies.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: default - type:
         * complex
         *
         * @param trustPolicies the value to set
         * @return this builder
         */
        public Builder trustPolicies(java.util.List<AppTrustPolicies> trustPolicies) {
            this.trustPolicies = trustPolicies;
            this.__explicitlySet__.add("trustPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signonPolicy")
        private AppSignonPolicy signonPolicy;

        public Builder signonPolicy(AppSignonPolicy signonPolicy) {
            this.signonPolicy = signonPolicy;
            this.__explicitlySet__.add("signonPolicy");
            return this;
        }
        /**
         * A list of IdentityProvider assigned to app. A user trying to access this app will be
         * automatically redirected to configured IdP during the authentication phase, before being
         * able to access App.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityProviders")
        private java.util.List<AppIdentityProviders> identityProviders;

        /**
         * A list of IdentityProvider assigned to app. A user trying to access this app will be
         * automatically redirected to configured IdP during the authentication phase, before being
         * able to access App.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex
         *
         * @param identityProviders the value to set
         * @return this builder
         */
        public Builder identityProviders(java.util.List<AppIdentityProviders> identityProviders) {
            this.identityProviders = identityProviders;
            this.__explicitlySet__.add("identityProviders");
            return this;
        }
        /**
         * Accounts of App
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accounts")
        private java.util.List<AppAccounts> accounts;

        /**
         * Accounts of App
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param accounts the value to set
         * @return this builder
         */
        public Builder accounts(java.util.List<AppAccounts> accounts) {
            this.accounts = accounts;
            this.__explicitlySet__.add("accounts");
            return this;
        }
        /**
         * Grants assigned to the app
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("grants")
        private java.util.List<AppGrants> grants;

        /**
         * Grants assigned to the app
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param grants the value to set
         * @return this builder
         */
        public Builder grants(java.util.List<AppGrants> grants) {
            this.grants = grants;
            this.__explicitlySet__.add("grants");
            return this;
        }
        /**
         * Custom attribute that is required to compute other attribute values during app creation.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: false - returned: always - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceParams")
        private java.util.List<AppServiceParams> serviceParams;

        /**
         * Custom attribute that is required to compute other attribute values during app creation.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: false - returned: always - type:
         * complex - uniqueness: none
         *
         * @param serviceParams the value to set
         * @return this builder
         */
        public Builder serviceParams(java.util.List<AppServiceParams> serviceParams) {
            this.serviceParams = serviceParams;
            this.__explicitlySet__.add("serviceParams");
            return this;
        }
        /**
         * Label for the attribute to be shown in the UI.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false -
         * multiValued: true - mutability: immutable - required: false - returned: default - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attrRenderingMetadata")
        private java.util.List<AppAttrRenderingMetadata> attrRenderingMetadata;

        /**
         * Label for the attribute to be shown in the UI.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false -
         * multiValued: true - mutability: immutable - required: false - returned: default - type:
         * complex - uniqueness: none
         *
         * @param attrRenderingMetadata the value to set
         * @return this builder
         */
        public Builder attrRenderingMetadata(
                java.util.List<AppAttrRenderingMetadata> attrRenderingMetadata) {
            this.attrRenderingMetadata = attrRenderingMetadata;
            this.__explicitlySet__.add("attrRenderingMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("basedOnTemplate")
        private AppBasedOnTemplate basedOnTemplate;

        public Builder basedOnTemplate(AppBasedOnTemplate basedOnTemplate) {
            this.basedOnTemplate = basedOnTemplate;
            this.__explicitlySet__.add("basedOnTemplate");
            return this;
        }
        /**
         * A list of AppRoles that are granted to this App (and that are defined by other Apps).
         * Within the Oracle Public Cloud infrastructure, this allows AppID-based association. Such
         * an association allows this App to act as a consumer and thus to access resources of
         * another App that acts as a producer.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readOnly - required: false - returned: default -
         * type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("grantedAppRoles")
        private java.util.List<AppGrantedAppRoles> grantedAppRoles;

        /**
         * A list of AppRoles that are granted to this App (and that are defined by other Apps).
         * Within the Oracle Public Cloud infrastructure, this allows AppID-based association. Such
         * an association allows this App to act as a consumer and thus to access resources of
         * another App that acts as a producer.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readOnly - required: false - returned: default -
         * type: complex - uniqueness: none
         *
         * @param grantedAppRoles the value to set
         * @return this builder
         */
        public Builder grantedAppRoles(java.util.List<AppGrantedAppRoles> grantedAppRoles) {
            this.grantedAppRoles = grantedAppRoles;
            this.__explicitlySet__.add("grantedAppRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("samlServiceProvider")
        private AppSamlServiceProvider samlServiceProvider;

        public Builder samlServiceProvider(AppSamlServiceProvider samlServiceProvider) {
            this.samlServiceProvider = samlServiceProvider;
            this.__explicitlySet__.add("samlServiceProvider");
            return this;
        }
        /**
         * A list of scopes (exposed by this App or by other Apps) that this App is allowed to
         * access when it acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [fqs] - idcsSearchable:
         * true - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedScopes")
        private java.util.List<AppAllowedScopes> allowedScopes;

        /**
         * A list of scopes (exposed by this App or by other Apps) that this App is allowed to
         * access when it acts as an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [fqs] - idcsSearchable:
         * true - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         *
         * @param allowedScopes the value to set
         * @return this builder
         */
        public Builder allowedScopes(java.util.List<AppAllowedScopes> allowedScopes) {
            this.allowedScopes = allowedScopes;
            this.__explicitlySet__.add("allowedScopes");
            return this;
        }
        /**
         * Each value of this attribute represent a certificate that this App uses when it acts as
         * an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [certAlias] -
         * idcsSearchable: false - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificates")
        private java.util.List<AppCertificates> certificates;

        /**
         * Each value of this attribute represent a certificate that this App uses when it acts as
         * an OAuthClient.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [certAlias] -
         * idcsSearchable: false - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         *
         * @param certificates the value to set
         * @return this builder
         */
        public Builder certificates(java.util.List<AppCertificates> certificates) {
            this.certificates = certificates;
            this.__explicitlySet__.add("certificates");
            return this;
        }
        /**
         * Each value of this internal attribute refers to an Oracle Public Cloud infrastructure App
         * on which this App depends.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("aliasApps")
        private java.util.List<AppAliasApps> aliasApps;

        /**
         * Each value of this internal attribute refers to an Oracle Public Cloud infrastructure App
         * on which this App depends.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         *
         * @param aliasApps the value to set
         * @return this builder
         */
        public Builder aliasApps(java.util.List<AppAliasApps> aliasApps) {
            this.aliasApps = aliasApps;
            this.__explicitlySet__.add("aliasApps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("asOPCService")
        private AppAsOPCService asOPCService;

        public Builder asOPCService(AppAsOPCService asOPCService) {
            this.asOPCService = asOPCService;
            this.__explicitlySet__.add("asOPCService");
            return this;
        }
        /**
         * A list of AppRoles defined by this UnmanagedApp. Membership in each of these AppRoles
         * confers administrative privilege within this App.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminRoles")
        private java.util.List<AppAdminRoles> adminRoles;

        /**
         * A list of AppRoles defined by this UnmanagedApp. Membership in each of these AppRoles
         * confers administrative privilege within this App.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex
         *
         * @param adminRoles the value to set
         * @return this builder
         */
        public Builder adminRoles(java.util.List<AppAdminRoles> adminRoles) {
            this.adminRoles = adminRoles;
            this.__explicitlySet__.add("adminRoles");
            return this;
        }
        /**
         * A list of AppRoles defined by this UnmanagedApp. Membership in each of these AppRoles
         * confers end-user privilege within this App.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userRoles")
        private java.util.List<AppUserRoles> userRoles;

        /**
         * A list of AppRoles defined by this UnmanagedApp. Membership in each of these AppRoles
         * confers end-user privilege within this App.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex
         *
         * @param userRoles the value to set
         * @return this builder
         */
        public Builder userRoles(java.util.List<AppUserRoles> userRoles) {
            this.userRoles = userRoles;
            this.__explicitlySet__.add("userRoles");
            return this;
        }
        /**
         * Scopes defined by this App. Used when this App acts as an OAuth Resource.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private java.util.List<AppScopes> scopes;

        /**
         * Scopes defined by this App. Used when this App acts as an OAuth Resource.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         *
         * @param scopes the value to set
         * @return this builder
         */
        public Builder scopes(java.util.List<AppScopes> scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:radiusApp:App")
        private AppExtensionRadiusAppApp urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp(
                AppExtensionRadiusAppApp urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:samlServiceProvider:App")
        private AppExtensionSamlServiceProviderApp
                urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp(
                AppExtensionSamlServiceProviderApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:webTierPolicy:App")
        private AppExtensionWebTierPolicyApp
                urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp(
                AppExtensionWebTierPolicyApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:managedapp:App")
        private AppExtensionManagedappApp urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp(
                AppExtensionManagedappApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:formFillAppTemplate:AppTemplate")
        private AppExtensionFormFillAppTemplateAppTemplate
                urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate(
                AppExtensionFormFillAppTemplateAppTemplate
                        urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate =
                    urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:opcService:App")
        private AppExtensionOpcServiceApp urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp(
                AppExtensionOpcServiceApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:kerberosRealm:App")
        private AppExtensionKerberosRealmApp
                urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp(
                AppExtensionKerberosRealmApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:requestable:App")
        private AppExtensionRequestableApp
                urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp(
                AppExtensionRequestableApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:formFillApp:App")
        private AppExtensionFormFillAppApp
                urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp(
                AppExtensionFormFillAppApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:dbcs:App")
        private AppExtensionDbcsApp urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp(
                AppExtensionDbcsApp urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:enterpriseApp:App")
        private AppExtensionEnterpriseAppApp
                urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp(
                AppExtensionEnterpriseAppApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:OCITags")
        private ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionOciTags(
                ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags =
                    urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionOciTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:multicloudServiceApp:App")
        private AppExtensionMulticloudServiceAppApp
                urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp(
                AppExtensionMulticloudServiceAppApp
                        urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp =
                    urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public App build() {
            App model =
                    new App(
                            this.id,
                            this.ocid,
                            this.schemas,
                            this.meta,
                            this.idcsCreatedBy,
                            this.idcsLastModifiedBy,
                            this.idcsPreventedOperations,
                            this.tags,
                            this.deleteInProgress,
                            this.idcsLastUpgradedInRelease,
                            this.domainOcid,
                            this.compartmentOcid,
                            this.tenancyOcid,
                            this.meterAsOPCService,
                            this.name,
                            this.clientSecret,
                            this.hashedClientSecret,
                            this.displayName,
                            this.description,
                            this.idTokenEncAlgo,
                            this.delegatedServiceNames,
                            this.active,
                            this.appIcon,
                            this.appThumbnail,
                            this.migrated,
                            this.infrastructure,
                            this.isLoginTarget,
                            this.showInMyApps,
                            this.loginMechanism,
                            this.landingPageUrl,
                            this.productLogoUrl,
                            this.privacyPolicyUrl,
                            this.termsOfServiceUrl,
                            this.contactEmailAddress,
                            this.productName,
                            this.homePageUrl,
                            this.isFormFill,
                            this.isOAuthClient,
                            this.isRadiusApp,
                            this.clientType,
                            this.redirectUris,
                            this.allUrlSchemesAllowed,
                            this.logoutUri,
                            this.postLogoutRedirectUris,
                            this.allowedGrants,
                            this.allowedOperations,
                            this.clientIPChecking,
                            this.isOPCService,
                            this.isUnmanagedApp,
                            this.allowAccessControl,
                            this.isOAuthResource,
                            this.accessTokenExpiry,
                            this.refreshTokenExpiry,
                            this.allowOffline,
                            this.callbackServiceUrl,
                            this.audience,
                            this.isMobileTarget,
                            this.loginPageUrl,
                            this.linkingCallbackUrl,
                            this.logoutPageUrl,
                            this.errorPageUrl,
                            this.isSamlServiceProvider,
                            this.isWebTierPolicy,
                            this.isKerberosRealm,
                            this.icon,
                            this.isAliasApp,
                            this.isManagedApp,
                            this.serviceTypeURN,
                            this.serviceTypeVersion,
                            this.isObligationCapable,
                            this.readyToUpgrade,
                            this.trustScope,
                            this.isDatabaseService,
                            this.secondaryAudiences,
                            this.isEnterpriseApp,
                            this.bypassConsent,
                            this.disableKmsiTokenAuthentication,
                            this.isMulticloudServiceApp,
                            this.radiusPolicy,
                            this.appsNetworkPerimeters,
                            this.cloudControlProperties,
                            this.editableAttributes,
                            this.termsOfUse,
                            this.protectableSecondaryAudiences,
                            this.idpPolicy,
                            this.allowedTags,
                            this.appSignonPolicy,
                            this.trustPolicies,
                            this.signonPolicy,
                            this.identityProviders,
                            this.accounts,
                            this.grants,
                            this.serviceParams,
                            this.attrRenderingMetadata,
                            this.basedOnTemplate,
                            this.grantedAppRoles,
                            this.samlServiceProvider,
                            this.allowedScopes,
                            this.certificates,
                            this.aliasApps,
                            this.asOPCService,
                            this.adminRoles,
                            this.userRoles,
                            this.scopes,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp,
                            this
                                    .urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags,
                            this
                                    .urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(App model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ocid")) {
                this.ocid(model.getOcid());
            }
            if (model.wasPropertyExplicitlySet("schemas")) {
                this.schemas(model.getSchemas());
            }
            if (model.wasPropertyExplicitlySet("meta")) {
                this.meta(model.getMeta());
            }
            if (model.wasPropertyExplicitlySet("idcsCreatedBy")) {
                this.idcsCreatedBy(model.getIdcsCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("idcsLastModifiedBy")) {
                this.idcsLastModifiedBy(model.getIdcsLastModifiedBy());
            }
            if (model.wasPropertyExplicitlySet("idcsPreventedOperations")) {
                this.idcsPreventedOperations(model.getIdcsPreventedOperations());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
            }
            if (model.wasPropertyExplicitlySet("deleteInProgress")) {
                this.deleteInProgress(model.getDeleteInProgress());
            }
            if (model.wasPropertyExplicitlySet("idcsLastUpgradedInRelease")) {
                this.idcsLastUpgradedInRelease(model.getIdcsLastUpgradedInRelease());
            }
            if (model.wasPropertyExplicitlySet("domainOcid")) {
                this.domainOcid(model.getDomainOcid());
            }
            if (model.wasPropertyExplicitlySet("compartmentOcid")) {
                this.compartmentOcid(model.getCompartmentOcid());
            }
            if (model.wasPropertyExplicitlySet("tenancyOcid")) {
                this.tenancyOcid(model.getTenancyOcid());
            }
            if (model.wasPropertyExplicitlySet("meterAsOPCService")) {
                this.meterAsOPCService(model.getMeterAsOPCService());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("clientSecret")) {
                this.clientSecret(model.getClientSecret());
            }
            if (model.wasPropertyExplicitlySet("hashedClientSecret")) {
                this.hashedClientSecret(model.getHashedClientSecret());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("idTokenEncAlgo")) {
                this.idTokenEncAlgo(model.getIdTokenEncAlgo());
            }
            if (model.wasPropertyExplicitlySet("delegatedServiceNames")) {
                this.delegatedServiceNames(model.getDelegatedServiceNames());
            }
            if (model.wasPropertyExplicitlySet("active")) {
                this.active(model.getActive());
            }
            if (model.wasPropertyExplicitlySet("appIcon")) {
                this.appIcon(model.getAppIcon());
            }
            if (model.wasPropertyExplicitlySet("appThumbnail")) {
                this.appThumbnail(model.getAppThumbnail());
            }
            if (model.wasPropertyExplicitlySet("migrated")) {
                this.migrated(model.getMigrated());
            }
            if (model.wasPropertyExplicitlySet("infrastructure")) {
                this.infrastructure(model.getInfrastructure());
            }
            if (model.wasPropertyExplicitlySet("isLoginTarget")) {
                this.isLoginTarget(model.getIsLoginTarget());
            }
            if (model.wasPropertyExplicitlySet("showInMyApps")) {
                this.showInMyApps(model.getShowInMyApps());
            }
            if (model.wasPropertyExplicitlySet("loginMechanism")) {
                this.loginMechanism(model.getLoginMechanism());
            }
            if (model.wasPropertyExplicitlySet("landingPageUrl")) {
                this.landingPageUrl(model.getLandingPageUrl());
            }
            if (model.wasPropertyExplicitlySet("productLogoUrl")) {
                this.productLogoUrl(model.getProductLogoUrl());
            }
            if (model.wasPropertyExplicitlySet("privacyPolicyUrl")) {
                this.privacyPolicyUrl(model.getPrivacyPolicyUrl());
            }
            if (model.wasPropertyExplicitlySet("termsOfServiceUrl")) {
                this.termsOfServiceUrl(model.getTermsOfServiceUrl());
            }
            if (model.wasPropertyExplicitlySet("contactEmailAddress")) {
                this.contactEmailAddress(model.getContactEmailAddress());
            }
            if (model.wasPropertyExplicitlySet("productName")) {
                this.productName(model.getProductName());
            }
            if (model.wasPropertyExplicitlySet("homePageUrl")) {
                this.homePageUrl(model.getHomePageUrl());
            }
            if (model.wasPropertyExplicitlySet("isFormFill")) {
                this.isFormFill(model.getIsFormFill());
            }
            if (model.wasPropertyExplicitlySet("isOAuthClient")) {
                this.isOAuthClient(model.getIsOAuthClient());
            }
            if (model.wasPropertyExplicitlySet("isRadiusApp")) {
                this.isRadiusApp(model.getIsRadiusApp());
            }
            if (model.wasPropertyExplicitlySet("clientType")) {
                this.clientType(model.getClientType());
            }
            if (model.wasPropertyExplicitlySet("redirectUris")) {
                this.redirectUris(model.getRedirectUris());
            }
            if (model.wasPropertyExplicitlySet("allUrlSchemesAllowed")) {
                this.allUrlSchemesAllowed(model.getAllUrlSchemesAllowed());
            }
            if (model.wasPropertyExplicitlySet("logoutUri")) {
                this.logoutUri(model.getLogoutUri());
            }
            if (model.wasPropertyExplicitlySet("postLogoutRedirectUris")) {
                this.postLogoutRedirectUris(model.getPostLogoutRedirectUris());
            }
            if (model.wasPropertyExplicitlySet("allowedGrants")) {
                this.allowedGrants(model.getAllowedGrants());
            }
            if (model.wasPropertyExplicitlySet("allowedOperations")) {
                this.allowedOperations(model.getAllowedOperations());
            }
            if (model.wasPropertyExplicitlySet("clientIPChecking")) {
                this.clientIPChecking(model.getClientIPChecking());
            }
            if (model.wasPropertyExplicitlySet("isOPCService")) {
                this.isOPCService(model.getIsOPCService());
            }
            if (model.wasPropertyExplicitlySet("isUnmanagedApp")) {
                this.isUnmanagedApp(model.getIsUnmanagedApp());
            }
            if (model.wasPropertyExplicitlySet("allowAccessControl")) {
                this.allowAccessControl(model.getAllowAccessControl());
            }
            if (model.wasPropertyExplicitlySet("isOAuthResource")) {
                this.isOAuthResource(model.getIsOAuthResource());
            }
            if (model.wasPropertyExplicitlySet("accessTokenExpiry")) {
                this.accessTokenExpiry(model.getAccessTokenExpiry());
            }
            if (model.wasPropertyExplicitlySet("refreshTokenExpiry")) {
                this.refreshTokenExpiry(model.getRefreshTokenExpiry());
            }
            if (model.wasPropertyExplicitlySet("allowOffline")) {
                this.allowOffline(model.getAllowOffline());
            }
            if (model.wasPropertyExplicitlySet("callbackServiceUrl")) {
                this.callbackServiceUrl(model.getCallbackServiceUrl());
            }
            if (model.wasPropertyExplicitlySet("audience")) {
                this.audience(model.getAudience());
            }
            if (model.wasPropertyExplicitlySet("isMobileTarget")) {
                this.isMobileTarget(model.getIsMobileTarget());
            }
            if (model.wasPropertyExplicitlySet("loginPageUrl")) {
                this.loginPageUrl(model.getLoginPageUrl());
            }
            if (model.wasPropertyExplicitlySet("linkingCallbackUrl")) {
                this.linkingCallbackUrl(model.getLinkingCallbackUrl());
            }
            if (model.wasPropertyExplicitlySet("logoutPageUrl")) {
                this.logoutPageUrl(model.getLogoutPageUrl());
            }
            if (model.wasPropertyExplicitlySet("errorPageUrl")) {
                this.errorPageUrl(model.getErrorPageUrl());
            }
            if (model.wasPropertyExplicitlySet("isSamlServiceProvider")) {
                this.isSamlServiceProvider(model.getIsSamlServiceProvider());
            }
            if (model.wasPropertyExplicitlySet("isWebTierPolicy")) {
                this.isWebTierPolicy(model.getIsWebTierPolicy());
            }
            if (model.wasPropertyExplicitlySet("isKerberosRealm")) {
                this.isKerberosRealm(model.getIsKerberosRealm());
            }
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("isAliasApp")) {
                this.isAliasApp(model.getIsAliasApp());
            }
            if (model.wasPropertyExplicitlySet("isManagedApp")) {
                this.isManagedApp(model.getIsManagedApp());
            }
            if (model.wasPropertyExplicitlySet("serviceTypeURN")) {
                this.serviceTypeURN(model.getServiceTypeURN());
            }
            if (model.wasPropertyExplicitlySet("serviceTypeVersion")) {
                this.serviceTypeVersion(model.getServiceTypeVersion());
            }
            if (model.wasPropertyExplicitlySet("isObligationCapable")) {
                this.isObligationCapable(model.getIsObligationCapable());
            }
            if (model.wasPropertyExplicitlySet("readyToUpgrade")) {
                this.readyToUpgrade(model.getReadyToUpgrade());
            }
            if (model.wasPropertyExplicitlySet("trustScope")) {
                this.trustScope(model.getTrustScope());
            }
            if (model.wasPropertyExplicitlySet("isDatabaseService")) {
                this.isDatabaseService(model.getIsDatabaseService());
            }
            if (model.wasPropertyExplicitlySet("secondaryAudiences")) {
                this.secondaryAudiences(model.getSecondaryAudiences());
            }
            if (model.wasPropertyExplicitlySet("isEnterpriseApp")) {
                this.isEnterpriseApp(model.getIsEnterpriseApp());
            }
            if (model.wasPropertyExplicitlySet("bypassConsent")) {
                this.bypassConsent(model.getBypassConsent());
            }
            if (model.wasPropertyExplicitlySet("disableKmsiTokenAuthentication")) {
                this.disableKmsiTokenAuthentication(model.getDisableKmsiTokenAuthentication());
            }
            if (model.wasPropertyExplicitlySet("isMulticloudServiceApp")) {
                this.isMulticloudServiceApp(model.getIsMulticloudServiceApp());
            }
            if (model.wasPropertyExplicitlySet("radiusPolicy")) {
                this.radiusPolicy(model.getRadiusPolicy());
            }
            if (model.wasPropertyExplicitlySet("appsNetworkPerimeters")) {
                this.appsNetworkPerimeters(model.getAppsNetworkPerimeters());
            }
            if (model.wasPropertyExplicitlySet("cloudControlProperties")) {
                this.cloudControlProperties(model.getCloudControlProperties());
            }
            if (model.wasPropertyExplicitlySet("editableAttributes")) {
                this.editableAttributes(model.getEditableAttributes());
            }
            if (model.wasPropertyExplicitlySet("termsOfUse")) {
                this.termsOfUse(model.getTermsOfUse());
            }
            if (model.wasPropertyExplicitlySet("protectableSecondaryAudiences")) {
                this.protectableSecondaryAudiences(model.getProtectableSecondaryAudiences());
            }
            if (model.wasPropertyExplicitlySet("idpPolicy")) {
                this.idpPolicy(model.getIdpPolicy());
            }
            if (model.wasPropertyExplicitlySet("allowedTags")) {
                this.allowedTags(model.getAllowedTags());
            }
            if (model.wasPropertyExplicitlySet("appSignonPolicy")) {
                this.appSignonPolicy(model.getAppSignonPolicy());
            }
            if (model.wasPropertyExplicitlySet("trustPolicies")) {
                this.trustPolicies(model.getTrustPolicies());
            }
            if (model.wasPropertyExplicitlySet("signonPolicy")) {
                this.signonPolicy(model.getSignonPolicy());
            }
            if (model.wasPropertyExplicitlySet("identityProviders")) {
                this.identityProviders(model.getIdentityProviders());
            }
            if (model.wasPropertyExplicitlySet("accounts")) {
                this.accounts(model.getAccounts());
            }
            if (model.wasPropertyExplicitlySet("grants")) {
                this.grants(model.getGrants());
            }
            if (model.wasPropertyExplicitlySet("serviceParams")) {
                this.serviceParams(model.getServiceParams());
            }
            if (model.wasPropertyExplicitlySet("attrRenderingMetadata")) {
                this.attrRenderingMetadata(model.getAttrRenderingMetadata());
            }
            if (model.wasPropertyExplicitlySet("basedOnTemplate")) {
                this.basedOnTemplate(model.getBasedOnTemplate());
            }
            if (model.wasPropertyExplicitlySet("grantedAppRoles")) {
                this.grantedAppRoles(model.getGrantedAppRoles());
            }
            if (model.wasPropertyExplicitlySet("samlServiceProvider")) {
                this.samlServiceProvider(model.getSamlServiceProvider());
            }
            if (model.wasPropertyExplicitlySet("allowedScopes")) {
                this.allowedScopes(model.getAllowedScopes());
            }
            if (model.wasPropertyExplicitlySet("certificates")) {
                this.certificates(model.getCertificates());
            }
            if (model.wasPropertyExplicitlySet("aliasApps")) {
                this.aliasApps(model.getAliasApps());
            }
            if (model.wasPropertyExplicitlySet("asOPCService")) {
                this.asOPCService(model.getAsOPCService());
            }
            if (model.wasPropertyExplicitlySet("adminRoles")) {
                this.adminRoles(model.getAdminRoles());
            }
            if (model.wasPropertyExplicitlySet("userRoles")) {
                this.userRoles(model.getUserRoles());
            }
            if (model.wasPropertyExplicitlySet("scopes")) {
                this.scopes(model.getScopes());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp(
                        model
                                .getUrnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate(
                        model
                                .getUrnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionOciTags")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionOciTags());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp(
                        model
                                .getUrnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp());
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
     * Unique identifier for the SCIM Resource as defined by the Service Provider. Each
     * representation of the Resource MUST include a non-empty id value. This identifier MUST be
     * unique across the Service Provider's entire set of Resources. It MUST be a stable,
     * non-reassignable identifier that does not change when the same Resource is returned in
     * subsequent requests. The value of the id attribute is always issued by the Service Provider
     * and MUST never be specified by the Service Consumer. bulkId: is a reserved keyword and MUST
     * NOT be used in the unique identifier.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: string - uniqueness: global
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the SCIM Resource as defined by the Service Provider. Each
     * representation of the Resource MUST include a non-empty id value. This identifier MUST be
     * unique across the Service Provider's entire set of Resources. It MUST be a stable,
     * non-reassignable identifier that does not change when the same Resource is returned in
     * subsequent requests. The value of the id attribute is always issued by the Service Provider
     * and MUST never be specified by the Service Consumer. bulkId: is a reserved keyword and MUST
     * NOT be used in the unique identifier.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: string - uniqueness: global
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Unique OCI identifier for the SCIM Resource.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * global
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocid")
    private final String ocid;

    /**
     * Unique OCI identifier for the SCIM Resource.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * global
     *
     * @return the value
     */
    public String getOcid() {
        return ocid;
    }

    /**
     * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the
     * supported schema version for a SCIM representation as well any schema extensions supported by
     * that representation. Each String value must be a unique URI. This specification defines URIs
     * for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM
     * schema MUST include a non-zero value array with value(s) of the URIs supported by that
     * representation. Duplicate values MUST NOT be included. Value order is not specified and MUST
     * not impact behavior.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<String> schemas;

    /**
     * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the
     * supported schema version for a SCIM representation as well any schema extensions supported by
     * that representation. Each String value must be a unique URI. This specification defines URIs
     * for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM
     * schema MUST include a non-zero value array with value(s) of the URIs supported by that
     * representation. Duplicate values MUST NOT be included. Value order is not specified and MUST
     * not impact behavior.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getSchemas() {
        return schemas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    private final Meta meta;

    public Meta getMeta() {
        return meta;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idcsCreatedBy")
    private final IdcsCreatedBy idcsCreatedBy;

    public IdcsCreatedBy getIdcsCreatedBy() {
        return idcsCreatedBy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idcsLastModifiedBy")
    private final IdcsLastModifiedBy idcsLastModifiedBy;

    public IdcsLastModifiedBy getIdcsLastModifiedBy() {
        return idcsLastModifiedBy;
    }

    /**
     * Each value of this attribute specifies an operation that only an internal client may perform
     * on this particular resource.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsPreventedOperations")
    private final java.util.List<IdcsPreventedOperations> idcsPreventedOperations;

    /**
     * Each value of this attribute specifies an operation that only an internal client may perform
     * on this particular resource.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<IdcsPreventedOperations> getIdcsPreventedOperations() {
        return idcsPreventedOperations;
    }

    /**
     * A list of tags on this resource.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: request - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tags> tags;

    /**
     * A list of tags on this resource.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: request - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<Tags> getTags() {
        return tags;
    }

    /**
     * A boolean flag indicating this resource in the process of being deleted. Usually set to true
     * when synchronous deletion of the resource would take too long.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deleteInProgress")
    private final Boolean deleteInProgress;

    /**
     * A boolean flag indicating this resource in the process of being deleted. Usually set to true
     * when synchronous deletion of the resource would take too long.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getDeleteInProgress() {
        return deleteInProgress;
    }

    /**
     * The release number when the resource was upgraded.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsLastUpgradedInRelease")
    private final String idcsLastUpgradedInRelease;

    /**
     * The release number when the resource was upgraded.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsLastUpgradedInRelease() {
        return idcsLastUpgradedInRelease;
    }

    /**
     * OCI Domain Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domainOcid")
    private final String domainOcid;

    /**
     * OCI Domain Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDomainOcid() {
        return domainOcid;
    }

    /**
     * OCI Compartment Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentOcid")
    private final String compartmentOcid;

    /**
     * OCI Compartment Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCompartmentOcid() {
        return compartmentOcid;
    }

    /**
     * OCI Tenant Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyOcid")
    private final String tenancyOcid;

    /**
     * OCI Tenant Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getTenancyOcid() {
        return tenancyOcid;
    }

    /**
     * Indicates whether the application is billed as an OPCService. If true, customer is not billed
     * for runtime operations of the app.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: always - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meterAsOPCService")
    private final Boolean meterAsOPCService;

    /**
     * Indicates whether the application is billed as an OPCService. If true, customer is not billed
     * for runtime operations of the app.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: always - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getMeterAsOPCService() {
        return meterAsOPCService;
    }

    /**
     * Name of the application. Also serves as username if the application authenticates to Oracle
     * Public Cloud infrastructure. This name may not be user-friendly and cannot be changed once an
     * App is created.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the application. Also serves as username if the application authenticates to Oracle
     * Public Cloud infrastructure. This name may not be user-friendly and cannot be changed once an
     * App is created.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * server
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * This value is the credential of this App, which this App supplies as a password when this App
     * authenticates to the Oracle Public Cloud infrastructure. This value is also the client secret
     * of this App when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - idcsSensitive: none -
     * multiValued: false - mutability: readOnly - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final String clientSecret;

    /**
     * This value is the credential of this App, which this App supplies as a password when this App
     * authenticates to the Oracle Public Cloud infrastructure. This value is also the client secret
     * of this App when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - idcsSensitive: none -
     * multiValued: false - mutability: readOnly - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Hashed Client Secret. This hash-value is used to verify the 'clientSecret' credential of this
     * App
     *
     * <p>*Added In:** 2106240046
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: hash_sc - multiValued:
     * false - mutability: readOnly - required: false - returned: request - type: string -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hashedClientSecret")
    private final String hashedClientSecret;

    /**
     * Hashed Client Secret. This hash-value is used to verify the 'clientSecret' credential of this
     * App
     *
     * <p>*Added In:** 2106240046
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - idcsSensitive: hash_sc - multiValued:
     * false - mutability: readOnly - required: false - returned: request - type: string -
     * uniqueness: none
     *
     * @return the value
     */
    public String getHashedClientSecret() {
        return hashedClientSecret;
    }

    /**
     * Display name of the application. Display name is intended to be user-friendly, and an
     * administrator can change the value at any time.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the application. Display name is intended to be user-friendly, and an
     * administrator can change the value at any time.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: server
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of the application.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the application.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Encryption Alogrithm to use for encrypting ID token.
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idTokenEncAlgo")
    private final String idTokenEncAlgo;

    /**
     * Encryption Alogrithm to use for encrypting ID token.
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdTokenEncAlgo() {
        return idTokenEncAlgo;
    }

    /**
     * Service Names allow to use OCI signature for client authentication instead of client
     * credentials
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("delegatedServiceNames")
    private final java.util.List<String> delegatedServiceNames;

    /**
     * Service Names allow to use OCI signature for client authentication instead of client
     * credentials
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getDelegatedServiceNames() {
        return delegatedServiceNames;
    }

    /**
     * If true, this App is able to participate in runtime services, such as automatic-login, OAuth,
     * and SAML. If false, all runtime services are disabled for this App, and only administrative
     * operations can be performed.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    private final Boolean active;

    /**
     * If true, this App is able to participate in runtime services, such as automatic-login, OAuth,
     * and SAML. If false, all runtime services are disabled for this App, and only administrative
     * operations can be performed.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Application icon.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appIcon")
    private final String appIcon;

    /**
     * Application icon.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAppIcon() {
        return appIcon;
    }

    /**
     * Application thumbnail.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appThumbnail")
    private final String appThumbnail;

    /**
     * Application thumbnail.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAppThumbnail() {
        return appThumbnail;
    }

    /**
     * If true, this App was migrated from an earlier version of Oracle Public Cloud infrastructure
     * (and may therefore require special handling from runtime services such as OAuth or SAML). If
     * false, this App requires no special handling from runtime services.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("migrated")
    private final Boolean migrated;

    /**
     * If true, this App was migrated from an earlier version of Oracle Public Cloud infrastructure
     * (and may therefore require special handling from runtime services such as OAuth or SAML). If
     * false, this App requires no special handling from runtime services.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getMigrated() {
        return migrated;
    }

    /**
     * If true, this App is an internal infrastructure App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructure")
    private final Boolean infrastructure;

    /**
     * If true, this App is an internal infrastructure App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getInfrastructure() {
        return infrastructure;
    }

    /**
     * If true, this App allows runtime services to log end users into this App automatically.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLoginTarget")
    private final Boolean isLoginTarget;

    /**
     * If true, this App allows runtime services to log end users into this App automatically.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsLoginTarget() {
        return isLoginTarget;
    }

    /**
     * If true, this app will be displayed in the MyApps page of each end-user who has access to the
     * App.
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("showInMyApps")
    private final Boolean showInMyApps;

    /**
     * If true, this app will be displayed in the MyApps page of each end-user who has access to the
     * App.
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getShowInMyApps() {
        return showInMyApps;
    }

    /**
     * The protocol that runtime services will use to log end users in to this App automatically. If
     * 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime
     * services use Security Assertion Markup Language protocol.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum LoginMechanism implements com.oracle.bmc.http.internal.BmcEnum {
        Oidc("OIDC"),
        Saml("SAML"),
        Formfill("FORMFILL"),
        Radius("RADIUS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LoginMechanism.class);

        private final String value;
        private static java.util.Map<String, LoginMechanism> map;

        static {
            map = new java.util.HashMap<>();
            for (LoginMechanism v : LoginMechanism.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LoginMechanism(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LoginMechanism create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LoginMechanism', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The protocol that runtime services will use to log end users in to this App automatically. If
     * 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime
     * services use Security Assertion Markup Language protocol.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loginMechanism")
    private final LoginMechanism loginMechanism;

    /**
     * The protocol that runtime services will use to log end users in to this App automatically. If
     * 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime
     * services use Security Assertion Markup Language protocol.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public LoginMechanism getLoginMechanism() {
        return loginMechanism;
    }

    /**
     * The URL of the landing page for this App, which is the first page that an end user should see
     * if runtime services log that end user in to this App automatically.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("landingPageUrl")
    private final String landingPageUrl;

    /**
     * The URL of the landing page for this App, which is the first page that an end user should see
     * if runtime services log that end user in to this App automatically.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLandingPageUrl() {
        return landingPageUrl;
    }

    /**
     * Application Logo URL
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productLogoUrl")
    private final String productLogoUrl;

    /**
     * Application Logo URL
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getProductLogoUrl() {
        return productLogoUrl;
    }

    /**
     * Privacy Policy URL
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /**
     * Privacy Policy URL
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    /**
     * Terms of Service URL
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("termsOfServiceUrl")
    private final String termsOfServiceUrl;

    /**
     * Terms of Service URL
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    /**
     * Contact Email Address
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmailAddress")
    private final String contactEmailAddress;

    /**
     * Contact Email Address
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    /**
     * Product Name
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * Product Name
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Home Page URL
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("homePageUrl")
    private final String homePageUrl;

    /**
     * Home Page URL
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getHomePageUrl() {
        return homePageUrl;
    }

    /**
     * If true, this application acts as FormFill Application
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFormFill")
    private final Boolean isFormFill;

    /**
     * If true, this application acts as FormFill Application
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsFormFill() {
        return isFormFill;
    }

    /**
     * If true, this application acts as an OAuth Client
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOAuthClient")
    private final Boolean isOAuthClient;

    /**
     * If true, this application acts as an OAuth Client
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsOAuthClient() {
        return isOAuthClient;
    }

    /**
     * If true, this application acts as an Radius App
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRadiusApp")
    private final Boolean isRadiusApp;

    /**
     * If true, this application acts as an Radius App
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsRadiusApp() {
        return isRadiusApp;
    }

    /**
     * Specifies the type of access that this App has when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum ClientType implements com.oracle.bmc.http.internal.BmcEnum {
        Confidential("confidential"),
        Public("public"),
        Trusted("trusted"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClientType.class);

        private final String value;
        private static java.util.Map<String, ClientType> map;

        static {
            map = new java.util.HashMap<>();
            for (ClientType v : ClientType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClientType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClientType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClientType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the type of access that this App has when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientType")
    private final ClientType clientType;

    /**
     * Specifies the type of access that this App has when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public ClientType getClientType() {
        return clientType;
    }

    /**
     * OPTIONAL. Each value is a URI within this App. This attribute is required when this App acts
     * as an OAuthClient and is involved in three-legged flows (authorization-code flows).
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUris")
    private final java.util.List<String> redirectUris;

    /**
     * OPTIONAL. Each value is a URI within this App. This attribute is required when this App acts
     * as an OAuthClient and is involved in three-legged flows (authorization-code flows).
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getRedirectUris() {
        return redirectUris;
    }

    /**
     * If true, indicates that the system should allow all URL-schemes within each value of the
     * 'redirectUris' attribute. Also indicates that the system should not attempt to confirm that
     * each value of the 'redirectUris' attribute is a valid URI. In particular, the system should
     * not confirm that the domain component of the URI is a top-level domain and the system should
     * not confirm that the hostname portion is a valid system that is reachable over the network.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allUrlSchemesAllowed")
    private final Boolean allUrlSchemesAllowed;

    /**
     * If true, indicates that the system should allow all URL-schemes within each value of the
     * 'redirectUris' attribute. Also indicates that the system should not attempt to confirm that
     * each value of the 'redirectUris' attribute is a valid URI. In particular, the system should
     * not confirm that the domain component of the URI is a top-level domain and the system should
     * not confirm that the hostname portion is a valid system that is reachable over the network.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAllUrlSchemesAllowed() {
        return allUrlSchemesAllowed;
    }

    /**
     * OAuth will use this URI to logout if this App wants to participate in SSO, and if this App's
     * session gets cleared as part of global logout. Note: This attribute is used only if this App
     * acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutUri")
    private final String logoutUri;

    /**
     * OAuth will use this URI to logout if this App wants to participate in SSO, and if this App's
     * session gets cleared as part of global logout. Note: This attribute is used only if this App
     * acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLogoutUri() {
        return logoutUri;
    }

    /**
     * Each value of this attribute is the URI of a landing page within this App. It is used only
     * when this App, acting as an OAuthClient, initiates the logout flow and wants to be redirected
     * back to one of its landing pages.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("postLogoutRedirectUris")
    private final java.util.List<String> postLogoutRedirectUris;

    /**
     * Each value of this attribute is the URI of a landing page within this App. It is used only
     * when this App, acting as an OAuthClient, initiates the logout flow and wants to be redirected
     * back to one of its landing pages.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getPostLogoutRedirectUris() {
        return postLogoutRedirectUris;
    }

    /**
     * List of grant-types that this App is allowed to use when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedGrants")
    private final java.util.List<String> allowedGrants;

    /**
     * List of grant-types that this App is allowed to use when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getAllowedGrants() {
        return allowedGrants;
    }

    /** */
    public enum AllowedOperations implements com.oracle.bmc.http.internal.BmcEnum {
        Introspect("introspect"),
        OnBehalfOfUser("onBehalfOfUser"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AllowedOperations.class);

        private final String value;
        private static java.util.Map<String, AllowedOperations> map;

        static {
            map = new java.util.HashMap<>();
            for (AllowedOperations v : AllowedOperations.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllowedOperations(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllowedOperations create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllowedOperations', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * OPTIONAL. Required only when this App acts as an OAuthClient. Supported values are
     * 'introspect' and 'onBehalfOfUser'. The value 'introspect' allows the client to look inside
     * the access-token. The value 'onBehalfOfUser' overrides how the client's privileges are
     * combined with the privileges of the Subject User. Ordinarily, authorization calculates the
     * set of effective privileges as the intersection of the client's privileges and the user's
     * privileges. The value 'onBehalfOf' indicates that authorization should ignore the privileges
     * of the client and use only the user's privileges to calculate the effective privileges.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedOperations")
    private final java.util.List<AllowedOperations> allowedOperations;

    /**
     * OPTIONAL. Required only when this App acts as an OAuthClient. Supported values are
     * 'introspect' and 'onBehalfOfUser'. The value 'introspect' allows the client to look inside
     * the access-token. The value 'onBehalfOfUser' overrides how the client's privileges are
     * combined with the privileges of the Subject User. Ordinarily, authorization calculates the
     * set of effective privileges as the intersection of the client's privileges and the user's
     * privileges. The value 'onBehalfOf' indicates that authorization should ignore the privileges
     * of the client and use only the user's privileges to calculate the effective privileges.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AllowedOperations> getAllowedOperations() {
        return allowedOperations;
    }

    /**
     * Network Perimeters checking mode
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum ClientIPChecking implements com.oracle.bmc.http.internal.BmcEnum {
        Anywhere("anywhere"),
        Whitelisted("whitelisted"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClientIPChecking.class);

        private final String value;
        private static java.util.Map<String, ClientIPChecking> map;

        static {
            map = new java.util.HashMap<>();
            for (ClientIPChecking v : ClientIPChecking.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClientIPChecking(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClientIPChecking create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClientIPChecking', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Network Perimeters checking mode
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientIPChecking")
    private final ClientIPChecking clientIPChecking;

    /**
     * Network Perimeters checking mode
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public ClientIPChecking getClientIPChecking() {
        return clientIPChecking;
    }

    /**
     * If true, this application is an Oracle Public Cloud service-instance.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOPCService")
    private final Boolean isOPCService;

    /**
     * If true, this application is an Oracle Public Cloud service-instance.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsOPCService() {
        return isOPCService;
    }

    /**
     * If true, indicates that this application accepts an Oracle Cloud Identity Service User as a
     * login-identity (does not require an account) and relies for authorization on the User's
     * memberships in AppRoles.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isUnmanagedApp")
    private final Boolean isUnmanagedApp;

    /**
     * If true, indicates that this application accepts an Oracle Cloud Identity Service User as a
     * login-identity (does not require an account) and relies for authorization on the User's
     * memberships in AppRoles.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsUnmanagedApp() {
        return isUnmanagedApp;
    }

    /**
     * If true, any managed App that is based on this template is checked for access control that
     * is, access to this app is subject to successful authorization at SSO service, viz. app grants
     * to start with.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowAccessControl")
    private final Boolean allowAccessControl;

    /**
     * If true, any managed App that is based on this template is checked for access control that
     * is, access to this app is subject to successful authorization at SSO service, viz. app grants
     * to start with.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAllowAccessControl() {
        return allowAccessControl;
    }

    /**
     * If true, indicates that this application acts as an OAuth Resource.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOAuthResource")
    private final Boolean isOAuthResource;

    /**
     * If true, indicates that this application acts as an OAuth Resource.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsOAuthResource() {
        return isOAuthResource;
    }

    /**
     * Expiry-time in seconds for an Access Token. Any token that allows access to this App will
     * expire after the specified duration.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessTokenExpiry")
    private final Integer accessTokenExpiry;

    /**
     * Expiry-time in seconds for an Access Token. Any token that allows access to this App will
     * expire after the specified duration.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getAccessTokenExpiry() {
        return accessTokenExpiry;
    }

    /**
     * Expiry-time in seconds for a Refresh Token. Any token that allows access to this App, once
     * refreshed, will expire after the specified duration.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenExpiry")
    private final Integer refreshTokenExpiry;

    /**
     * Expiry-time in seconds for a Refresh Token. Any token that allows access to this App, once
     * refreshed, will expire after the specified duration.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getRefreshTokenExpiry() {
        return refreshTokenExpiry;
    }

    /**
     * If true, indicates that the Refresh Token is allowed when this App acts as an OAuth Resource.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowOffline")
    private final Boolean allowOffline;

    /**
     * If true, indicates that the Refresh Token is allowed when this App acts as an OAuth Resource.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAllowOffline() {
        return allowOffline;
    }

    /**
     * Callback Service URL
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("callbackServiceUrl")
    private final String callbackServiceUrl;

    /**
     * Callback Service URL
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCallbackServiceUrl() {
        return callbackServiceUrl;
    }

    /**
     * The base URI for all of the scopes defined in this App. The value of 'audience' is combined
     * with the 'value' of each scope to form an 'fqs' or fully qualified scope.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("audience")
    private final String audience;

    /**
     * The base URI for all of the scopes defined in this App. The value of 'audience' is combined
     * with the 'value' of each scope to form an 'fqs' or fully qualified scope.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAudience() {
        return audience;
    }

    /**
     * If true, indicates that the App should be visible in each end-user's mobile application.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMobileTarget")
    private final Boolean isMobileTarget;

    /**
     * If true, indicates that the App should be visible in each end-user's mobile application.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsMobileTarget() {
        return isMobileTarget;
    }

    /**
     * This attribute specifies the URL of the page that the App uses when an end-user signs in to
     * that App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loginPageUrl")
    private final String loginPageUrl;

    /**
     * This attribute specifies the URL of the page that the App uses when an end-user signs in to
     * that App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLoginPageUrl() {
        return loginPageUrl;
    }

    /**
     * This attribute specifies the callback URL for the social linking operation.
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("linkingCallbackUrl")
    private final String linkingCallbackUrl;

    /**
     * This attribute specifies the callback URL for the social linking operation.
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLinkingCallbackUrl() {
        return linkingCallbackUrl;
    }

    /**
     * This attribute specifies the URL of the page that the App uses when an end-user signs out.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutPageUrl")
    private final String logoutPageUrl;

    /**
     * This attribute specifies the URL of the page that the App uses when an end-user signs out.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLogoutPageUrl() {
        return logoutPageUrl;
    }

    /**
     * This attribute specifies the URL of the page to which an application will redirect an
     * end-user in case of error.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("errorPageUrl")
    private final String errorPageUrl;

    /**
     * This attribute specifies the URL of the page to which an application will redirect an
     * end-user in case of error.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getErrorPageUrl() {
        return errorPageUrl;
    }

    /**
     * If true, then this App acts as a SAML Service Provider.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSamlServiceProvider")
    private final Boolean isSamlServiceProvider;

    /**
     * If true, then this App acts as a SAML Service Provider.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsSamlServiceProvider() {
        return isSamlServiceProvider;
    }

    /**
     * If true, the webtier policy is active
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isWebTierPolicy")
    private final Boolean isWebTierPolicy;

    /**
     * If true, the webtier policy is active
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsWebTierPolicy() {
        return isWebTierPolicy;
    }

    /**
     * If true, indicates that this App supports Kerberos Authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isKerberosRealm")
    private final Boolean isKerberosRealm;

    /**
     * If true, indicates that this App supports Kerberos Authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsKerberosRealm() {
        return isKerberosRealm;
    }

    /**
     * URL of application icon.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final String icon;

    /**
     * URL of application icon.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: reference - uniqueness: none
     *
     * @return the value
     */
    public String getIcon() {
        return icon;
    }

    /**
     * If true, this App is an AliasApp and it cannot be granted to an end-user directly.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: always - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAliasApp")
    private final Boolean isAliasApp;

    /**
     * If true, this App is an AliasApp and it cannot be granted to an end-user directly.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: always - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsAliasApp() {
        return isAliasApp;
    }

    /**
     * If true, indicates that access to this App requires an account. That is, in order to log in
     * to the App, a User must use an application-specific identity that is maintained in the remote
     * identity-repository of that App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isManagedApp")
    private final Boolean isManagedApp;

    /**
     * If true, indicates that access to this App requires an account. That is, in order to log in
     * to the App, a User must use an application-specific identity that is maintained in the remote
     * identity-repository of that App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsManagedApp() {
        return isManagedApp;
    }

    /**
     * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service of
     * which this app is an instance.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceTypeURN")
    private final String serviceTypeURN;

    /**
     * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service of
     * which this app is an instance.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getServiceTypeURN() {
        return serviceTypeURN;
    }

    /**
     * This value specifies the version of the Oracle Public Cloud service of which this App is an
     * instance
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceTypeVersion")
    private final String serviceTypeVersion;

    /**
     * This value specifies the version of the Oracle Public Cloud service of which this App is an
     * instance
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getServiceTypeVersion() {
        return serviceTypeVersion;
    }

    /**
     * This flag indicates if the App is capable of validating obligations with the token for
     * allowing access to the App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isObligationCapable")
    private final Boolean isObligationCapable;

    /**
     * This flag indicates if the App is capable of validating obligations with the token for
     * allowing access to the App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getIsObligationCapable() {
        return isObligationCapable;
    }

    /**
     * If true, this App requires an upgrade and mandates attention from application administrator.
     * The flag is used by UI to indicate this app is ready to upgrade.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readyToUpgrade")
    private final Boolean readyToUpgrade;

    /**
     * If true, this App requires an upgrade and mandates attention from application administrator.
     * The flag is used by UI to indicate this app is ready to upgrade.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getReadyToUpgrade() {
        return readyToUpgrade;
    }

    /**
     * Indicates the scope of trust for this App when acting as an OAuthClient. A value of
     * 'Explicit' indicates that the App is allowed to access only the scopes of OAuthResources that
     * are explicitly specified as 'allowedScopes'. A value of 'Account' indicates that the App is
     * allowed implicitly to access any scope of any OAuthResource within the same Oracle Cloud
     * Account. A value of 'Tags' indicates that the App is allowed to access any scope of any
     * OAuthResource with a matching tag within the same Oracle Cloud Account. A value of 'Default'
     * indicates that the Tenant default trust scope configured in the Tenant Settings is used.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum TrustScope implements com.oracle.bmc.http.internal.BmcEnum {
        Explicit("Explicit"),
        Account("Account"),
        Tags("Tags"),
        Default("Default"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TrustScope.class);

        private final String value;
        private static java.util.Map<String, TrustScope> map;

        static {
            map = new java.util.HashMap<>();
            for (TrustScope v : TrustScope.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TrustScope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TrustScope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TrustScope', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates the scope of trust for this App when acting as an OAuthClient. A value of
     * 'Explicit' indicates that the App is allowed to access only the scopes of OAuthResources that
     * are explicitly specified as 'allowedScopes'. A value of 'Account' indicates that the App is
     * allowed implicitly to access any scope of any OAuthResource within the same Oracle Cloud
     * Account. A value of 'Tags' indicates that the App is allowed to access any scope of any
     * OAuthResource with a matching tag within the same Oracle Cloud Account. A value of 'Default'
     * indicates that the Tenant default trust scope configured in the Tenant Settings is used.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustScope")
    private final TrustScope trustScope;

    /**
     * Indicates the scope of trust for this App when acting as an OAuthClient. A value of
     * 'Explicit' indicates that the App is allowed to access only the scopes of OAuthResources that
     * are explicitly specified as 'allowedScopes'. A value of 'Account' indicates that the App is
     * allowed implicitly to access any scope of any OAuthResource within the same Oracle Cloud
     * Account. A value of 'Tags' indicates that the App is allowed to access any scope of any
     * OAuthResource with a matching tag within the same Oracle Cloud Account. A value of 'Default'
     * indicates that the Tenant default trust scope configured in the Tenant Settings is used.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public TrustScope getTrustScope() {
        return trustScope;
    }

    /**
     * If true, this application acts as database service Application
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDatabaseService")
    private final Boolean isDatabaseService;

    /**
     * If true, this application acts as database service Application
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - type: boolean
     *
     * @return the value
     */
    public Boolean getIsDatabaseService() {
        return isDatabaseService;
    }

    /**
     * A list of secondary audiences--additional URIs to be added automatically to any OAuth token
     * that allows access to this App. Note: This attribute is used mainly for backward
     * compatibility in certain Oracle Public Cloud Apps.
     *
     * <p>*Deprecated Since: 18.2.6**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryAudiences")
    private final java.util.List<String> secondaryAudiences;

    /**
     * A list of secondary audiences--additional URIs to be added automatically to any OAuth token
     * that allows access to this App. Note: This attribute is used mainly for backward
     * compatibility in certain Oracle Public Cloud Apps.
     *
     * <p>*Deprecated Since: 18.2.6**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getSecondaryAudiences() {
        return secondaryAudiences;
    }

    /**
     * If true, this app acts as Enterprise app with Authentication and URL Authz policy.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnterpriseApp")
    private final Boolean isEnterpriseApp;

    /**
     * If true, this app acts as Enterprise app with Authentication and URL Authz policy.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsEnterpriseApp() {
        return isEnterpriseApp;
    }

    /**
     * If true, indicates that consent should be skipped for all scopes
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bypassConsent")
    private final Boolean bypassConsent;

    /**
     * If true, indicates that consent should be skipped for all scopes
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getBypassConsent() {
        return bypassConsent;
    }

    /**
     * Indicates whether the application is allowed to be access using kmsi token.
     *
     * <p>*Added In:** 2111190457
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: always - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableKmsiTokenAuthentication")
    private final Boolean disableKmsiTokenAuthentication;

    /**
     * Indicates whether the application is allowed to be access using kmsi token.
     *
     * <p>*Added In:** 2111190457
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: always - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getDisableKmsiTokenAuthentication() {
        return disableKmsiTokenAuthentication;
    }

    /**
     * If true, indicates the app is used for multicloud service integration.
     *
     * <p>*Added In:** 2301202328
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMulticloudServiceApp")
    private final Boolean isMulticloudServiceApp;

    /**
     * If true, indicates the app is used for multicloud service integration.
     *
     * <p>*Added In:** 2301202328
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsMulticloudServiceApp() {
        return isMulticloudServiceApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("radiusPolicy")
    private final AppRadiusPolicy radiusPolicy;

    public AppRadiusPolicy getRadiusPolicy() {
        return radiusPolicy;
    }

    /**
     * Network Perimeter
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readWrite - required: false - returned: default - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appsNetworkPerimeters")
    private final java.util.List<AppAppsNetworkPerimeters> appsNetworkPerimeters;

    /**
     * Network Perimeter
     *
     * <p>*Added In:** 2010242156
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readWrite - required: false - returned: default - type: complex
     *
     * @return the value
     */
    public java.util.List<AppAppsNetworkPerimeters> getAppsNetworkPerimeters() {
        return appsNetworkPerimeters;
    }

    /**
     * A collection of arbitrary properties that scope the privileges of a cloud-control App.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudControlProperties")
    private final java.util.List<AppCloudControlProperties> cloudControlProperties;

    /**
     * A collection of arbitrary properties that scope the privileges of a cloud-control App.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppCloudControlProperties> getCloudControlProperties() {
        return cloudControlProperties;
    }

    /**
     * App attributes editable by subject
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
     * false - multiValued: true - mutability: readOnly - required: false - returned: request -
     * type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("editableAttributes")
    private final java.util.List<AppEditableAttributes> editableAttributes;

    /**
     * App attributes editable by subject
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
     * false - multiValued: true - mutability: readOnly - required: false - returned: request -
     * type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppEditableAttributes> getEditableAttributes() {
        return editableAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("termsOfUse")
    private final AppTermsOfUse termsOfUse;

    public AppTermsOfUse getTermsOfUse() {
        return termsOfUse;
    }

    /**
     * A list of secondary audiences--additional URIs to be added automatically to any OAuth token
     * that allows access to this App. Note: This attribute is used mainly for backward
     * compatibility in certain Oracle Public Cloud Apps.
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
     * false - multiValued: true - mutability: readWrite - required: false - returned: default -
     * type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectableSecondaryAudiences")
    private final java.util.List<AppProtectableSecondaryAudiences> protectableSecondaryAudiences;

    /**
     * A list of secondary audiences--additional URIs to be added automatically to any OAuth token
     * that allows access to this App. Note: This attribute is used mainly for backward
     * compatibility in certain Oracle Public Cloud Apps.
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
     * false - multiValued: true - mutability: readWrite - required: false - returned: default -
     * type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppProtectableSecondaryAudiences> getProtectableSecondaryAudiences() {
        return protectableSecondaryAudiences;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idpPolicy")
    private final AppIdpPolicy idpPolicy;

    public AppIdpPolicy getIdpPolicy() {
        return idpPolicy;
    }

    /**
     * A list of tags, acting as an OAuthClient, this App is allowed to access.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedTags")
    private final java.util.List<AppAllowedTags> allowedTags;

    /**
     * A list of tags, acting as an OAuthClient, this App is allowed to access.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppAllowedTags> getAllowedTags() {
        return allowedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("appSignonPolicy")
    private final AppAppSignonPolicy appSignonPolicy;

    public AppAppSignonPolicy getAppSignonPolicy() {
        return appSignonPolicy;
    }

    /**
     * Trust Policies.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: default - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustPolicies")
    private final java.util.List<AppTrustPolicies> trustPolicies;

    /**
     * Trust Policies.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: default - type: complex
     *
     * @return the value
     */
    public java.util.List<AppTrustPolicies> getTrustPolicies() {
        return trustPolicies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("signonPolicy")
    private final AppSignonPolicy signonPolicy;

    public AppSignonPolicy getSignonPolicy() {
        return signonPolicy;
    }

    /**
     * A list of IdentityProvider assigned to app. A user trying to access this app will be
     * automatically redirected to configured IdP during the authentication phase, before being able
     * to access App.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false - multiValued:
     * true - mutability: readWrite - required: false - returned: request - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityProviders")
    private final java.util.List<AppIdentityProviders> identityProviders;

    /**
     * A list of IdentityProvider assigned to app. A user trying to access this app will be
     * automatically redirected to configured IdP during the authentication phase, before being able
     * to access App.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false - multiValued:
     * true - mutability: readWrite - required: false - returned: request - type: complex
     *
     * @return the value
     */
    public java.util.List<AppIdentityProviders> getIdentityProviders() {
        return identityProviders;
    }

    /**
     * Accounts of App
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accounts")
    private final java.util.List<AppAccounts> accounts;

    /**
     * Accounts of App
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppAccounts> getAccounts() {
        return accounts;
    }

    /**
     * Grants assigned to the app
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grants")
    private final java.util.List<AppGrants> grants;

    /**
     * Grants assigned to the app
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppGrants> getGrants() {
        return grants;
    }

    /**
     * Custom attribute that is required to compute other attribute values during app creation.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false - multiValued:
     * true - mutability: readWrite - required: false - returned: always - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceParams")
    private final java.util.List<AppServiceParams> serviceParams;

    /**
     * Custom attribute that is required to compute other attribute values during app creation.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false - multiValued:
     * true - mutability: readWrite - required: false - returned: always - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppServiceParams> getServiceParams() {
        return serviceParams;
    }

    /**
     * Label for the attribute to be shown in the UI.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false - multiValued:
     * true - mutability: immutable - required: false - returned: default - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attrRenderingMetadata")
    private final java.util.List<AppAttrRenderingMetadata> attrRenderingMetadata;

    /**
     * Label for the attribute to be shown in the UI.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false - multiValued:
     * true - mutability: immutable - required: false - returned: default - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppAttrRenderingMetadata> getAttrRenderingMetadata() {
        return attrRenderingMetadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("basedOnTemplate")
    private final AppBasedOnTemplate basedOnTemplate;

    public AppBasedOnTemplate getBasedOnTemplate() {
        return basedOnTemplate;
    }

    /**
     * A list of AppRoles that are granted to this App (and that are defined by other Apps). Within
     * the Oracle Public Cloud infrastructure, this allows AppID-based association. Such an
     * association allows this App to act as a consumer and thus to access resources of another App
     * that acts as a producer.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable: true
     * - multiValued: true - mutability: readOnly - required: false - returned: default - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantedAppRoles")
    private final java.util.List<AppGrantedAppRoles> grantedAppRoles;

    /**
     * A list of AppRoles that are granted to this App (and that are defined by other Apps). Within
     * the Oracle Public Cloud infrastructure, this allows AppID-based association. Such an
     * association allows this App to act as a consumer and thus to access resources of another App
     * that acts as a producer.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable: true
     * - multiValued: true - mutability: readOnly - required: false - returned: default - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppGrantedAppRoles> getGrantedAppRoles() {
        return grantedAppRoles;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("samlServiceProvider")
    private final AppSamlServiceProvider samlServiceProvider;

    public AppSamlServiceProvider getSamlServiceProvider() {
        return samlServiceProvider;
    }

    /**
     * A list of scopes (exposed by this App or by other Apps) that this App is allowed to access
     * when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [fqs] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedScopes")
    private final java.util.List<AppAllowedScopes> allowedScopes;

    /**
     * A list of scopes (exposed by this App or by other Apps) that this App is allowed to access
     * when it acts as an OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [fqs] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppAllowedScopes> getAllowedScopes() {
        return allowedScopes;
    }

    /**
     * Each value of this attribute represent a certificate that this App uses when it acts as an
     * OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [certAlias] - idcsSearchable:
     * false - multiValued: true - mutability: readWrite - required: false - returned: default -
     * type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificates")
    private final java.util.List<AppCertificates> certificates;

    /**
     * Each value of this attribute represent a certificate that this App uses when it acts as an
     * OAuthClient.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [certAlias] - idcsSearchable:
     * false - multiValued: true - mutability: readWrite - required: false - returned: default -
     * type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppCertificates> getCertificates() {
        return certificates;
    }

    /**
     * Each value of this internal attribute refers to an Oracle Public Cloud infrastructure App on
     * which this App depends.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable: true
     * - multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("aliasApps")
    private final java.util.List<AppAliasApps> aliasApps;

    /**
     * Each value of this internal attribute refers to an Oracle Public Cloud infrastructure App on
     * which this App depends.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable: true
     * - multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppAliasApps> getAliasApps() {
        return aliasApps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("asOPCService")
    private final AppAsOPCService asOPCService;

    public AppAsOPCService getAsOPCService() {
        return asOPCService;
    }

    /**
     * A list of AppRoles defined by this UnmanagedApp. Membership in each of these AppRoles confers
     * administrative privilege within this App.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminRoles")
    private final java.util.List<AppAdminRoles> adminRoles;

    /**
     * A list of AppRoles defined by this UnmanagedApp. Membership in each of these AppRoles confers
     * administrative privilege within this App.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex
     *
     * @return the value
     */
    public java.util.List<AppAdminRoles> getAdminRoles() {
        return adminRoles;
    }

    /**
     * A list of AppRoles defined by this UnmanagedApp. Membership in each of these AppRoles confers
     * end-user privilege within this App.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userRoles")
    private final java.util.List<AppUserRoles> userRoles;

    /**
     * A list of AppRoles defined by this UnmanagedApp. Membership in each of these AppRoles confers
     * end-user privilege within this App.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex
     *
     * @return the value
     */
    public java.util.List<AppUserRoles> getUserRoles() {
        return userRoles;
    }

    /**
     * Scopes defined by this App. Used when this App acts as an OAuth Resource.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable: true
     * - multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final java.util.List<AppScopes> scopes;

    /**
     * Scopes defined by this App. Used when this App acts as an OAuth Resource.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsCompositeKey: [value] - idcsSearchable: true
     * - multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppScopes> getScopes() {
        return scopes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:radiusApp:App")
    private final AppExtensionRadiusAppApp urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp;

    public AppExtensionRadiusAppApp getUrnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:samlServiceProvider:App")
    private final AppExtensionSamlServiceProviderApp
            urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp;

    public AppExtensionSamlServiceProviderApp
            getUrnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:webTierPolicy:App")
    private final AppExtensionWebTierPolicyApp
            urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp;

    public AppExtensionWebTierPolicyApp
            getUrnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:managedapp:App")
    private final AppExtensionManagedappApp
            urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp;

    public AppExtensionManagedappApp getUrnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:formFillAppTemplate:AppTemplate")
    private final AppExtensionFormFillAppTemplateAppTemplate
            urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate;

    public AppExtensionFormFillAppTemplateAppTemplate
            getUrnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:opcService:App")
    private final AppExtensionOpcServiceApp
            urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp;

    public AppExtensionOpcServiceApp getUrnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:kerberosRealm:App")
    private final AppExtensionKerberosRealmApp
            urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp;

    public AppExtensionKerberosRealmApp
            getUrnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:requestable:App")
    private final AppExtensionRequestableApp
            urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp;

    public AppExtensionRequestableApp
            getUrnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:formFillApp:App")
    private final AppExtensionFormFillAppApp
            urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp;

    public AppExtensionFormFillAppApp
            getUrnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:dbcs:App")
    private final AppExtensionDbcsApp urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp;

    public AppExtensionDbcsApp getUrnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:enterpriseApp:App")
    private final AppExtensionEnterpriseAppApp
            urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp;

    public AppExtensionEnterpriseAppApp
            getUrnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:OCITags")
    private final ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;

    public ExtensionOCITags getUrnIetfParamsScimSchemasOracleIdcsExtensionOciTags() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:multicloudServiceApp:App")
    private final AppExtensionMulticloudServiceAppApp
            urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp;

    public AppExtensionMulticloudServiceAppApp
            getUrnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp;
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
        sb.append("App(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", ocid=").append(String.valueOf(this.ocid));
        sb.append(", schemas=").append(String.valueOf(this.schemas));
        sb.append(", meta=").append(String.valueOf(this.meta));
        sb.append(", idcsCreatedBy=").append(String.valueOf(this.idcsCreatedBy));
        sb.append(", idcsLastModifiedBy=").append(String.valueOf(this.idcsLastModifiedBy));
        sb.append(", idcsPreventedOperations=")
                .append(String.valueOf(this.idcsPreventedOperations));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", deleteInProgress=").append(String.valueOf(this.deleteInProgress));
        sb.append(", idcsLastUpgradedInRelease=")
                .append(String.valueOf(this.idcsLastUpgradedInRelease));
        sb.append(", domainOcid=").append(String.valueOf(this.domainOcid));
        sb.append(", compartmentOcid=").append(String.valueOf(this.compartmentOcid));
        sb.append(", tenancyOcid=").append(String.valueOf(this.tenancyOcid));
        sb.append(", meterAsOPCService=").append(String.valueOf(this.meterAsOPCService));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", clientSecret=").append(String.valueOf(this.clientSecret));
        sb.append(", hashedClientSecret=").append(String.valueOf(this.hashedClientSecret));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", idTokenEncAlgo=").append(String.valueOf(this.idTokenEncAlgo));
        sb.append(", delegatedServiceNames=").append(String.valueOf(this.delegatedServiceNames));
        sb.append(", active=").append(String.valueOf(this.active));
        sb.append(", appIcon=").append(String.valueOf(this.appIcon));
        sb.append(", appThumbnail=").append(String.valueOf(this.appThumbnail));
        sb.append(", migrated=").append(String.valueOf(this.migrated));
        sb.append(", infrastructure=").append(String.valueOf(this.infrastructure));
        sb.append(", isLoginTarget=").append(String.valueOf(this.isLoginTarget));
        sb.append(", showInMyApps=").append(String.valueOf(this.showInMyApps));
        sb.append(", loginMechanism=").append(String.valueOf(this.loginMechanism));
        sb.append(", landingPageUrl=").append(String.valueOf(this.landingPageUrl));
        sb.append(", productLogoUrl=").append(String.valueOf(this.productLogoUrl));
        sb.append(", privacyPolicyUrl=").append(String.valueOf(this.privacyPolicyUrl));
        sb.append(", termsOfServiceUrl=").append(String.valueOf(this.termsOfServiceUrl));
        sb.append(", contactEmailAddress=").append(String.valueOf(this.contactEmailAddress));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", homePageUrl=").append(String.valueOf(this.homePageUrl));
        sb.append(", isFormFill=").append(String.valueOf(this.isFormFill));
        sb.append(", isOAuthClient=").append(String.valueOf(this.isOAuthClient));
        sb.append(", isRadiusApp=").append(String.valueOf(this.isRadiusApp));
        sb.append(", clientType=").append(String.valueOf(this.clientType));
        sb.append(", redirectUris=").append(String.valueOf(this.redirectUris));
        sb.append(", allUrlSchemesAllowed=").append(String.valueOf(this.allUrlSchemesAllowed));
        sb.append(", logoutUri=").append(String.valueOf(this.logoutUri));
        sb.append(", postLogoutRedirectUris=").append(String.valueOf(this.postLogoutRedirectUris));
        sb.append(", allowedGrants=").append(String.valueOf(this.allowedGrants));
        sb.append(", allowedOperations=").append(String.valueOf(this.allowedOperations));
        sb.append(", clientIPChecking=").append(String.valueOf(this.clientIPChecking));
        sb.append(", isOPCService=").append(String.valueOf(this.isOPCService));
        sb.append(", isUnmanagedApp=").append(String.valueOf(this.isUnmanagedApp));
        sb.append(", allowAccessControl=").append(String.valueOf(this.allowAccessControl));
        sb.append(", isOAuthResource=").append(String.valueOf(this.isOAuthResource));
        sb.append(", accessTokenExpiry=").append(String.valueOf(this.accessTokenExpiry));
        sb.append(", refreshTokenExpiry=").append(String.valueOf(this.refreshTokenExpiry));
        sb.append(", allowOffline=").append(String.valueOf(this.allowOffline));
        sb.append(", callbackServiceUrl=").append(String.valueOf(this.callbackServiceUrl));
        sb.append(", audience=").append(String.valueOf(this.audience));
        sb.append(", isMobileTarget=").append(String.valueOf(this.isMobileTarget));
        sb.append(", loginPageUrl=").append(String.valueOf(this.loginPageUrl));
        sb.append(", linkingCallbackUrl=").append(String.valueOf(this.linkingCallbackUrl));
        sb.append(", logoutPageUrl=").append(String.valueOf(this.logoutPageUrl));
        sb.append(", errorPageUrl=").append(String.valueOf(this.errorPageUrl));
        sb.append(", isSamlServiceProvider=").append(String.valueOf(this.isSamlServiceProvider));
        sb.append(", isWebTierPolicy=").append(String.valueOf(this.isWebTierPolicy));
        sb.append(", isKerberosRealm=").append(String.valueOf(this.isKerberosRealm));
        sb.append(", icon=").append(String.valueOf(this.icon));
        sb.append(", isAliasApp=").append(String.valueOf(this.isAliasApp));
        sb.append(", isManagedApp=").append(String.valueOf(this.isManagedApp));
        sb.append(", serviceTypeURN=").append(String.valueOf(this.serviceTypeURN));
        sb.append(", serviceTypeVersion=").append(String.valueOf(this.serviceTypeVersion));
        sb.append(", isObligationCapable=").append(String.valueOf(this.isObligationCapable));
        sb.append(", readyToUpgrade=").append(String.valueOf(this.readyToUpgrade));
        sb.append(", trustScope=").append(String.valueOf(this.trustScope));
        sb.append(", isDatabaseService=").append(String.valueOf(this.isDatabaseService));
        sb.append(", secondaryAudiences=").append(String.valueOf(this.secondaryAudiences));
        sb.append(", isEnterpriseApp=").append(String.valueOf(this.isEnterpriseApp));
        sb.append(", bypassConsent=").append(String.valueOf(this.bypassConsent));
        sb.append(", disableKmsiTokenAuthentication=")
                .append(String.valueOf(this.disableKmsiTokenAuthentication));
        sb.append(", isMulticloudServiceApp=").append(String.valueOf(this.isMulticloudServiceApp));
        sb.append(", radiusPolicy=").append(String.valueOf(this.radiusPolicy));
        sb.append(", appsNetworkPerimeters=").append(String.valueOf(this.appsNetworkPerimeters));
        sb.append(", cloudControlProperties=").append(String.valueOf(this.cloudControlProperties));
        sb.append(", editableAttributes=").append(String.valueOf(this.editableAttributes));
        sb.append(", termsOfUse=").append(String.valueOf(this.termsOfUse));
        sb.append(", protectableSecondaryAudiences=")
                .append(String.valueOf(this.protectableSecondaryAudiences));
        sb.append(", idpPolicy=").append(String.valueOf(this.idpPolicy));
        sb.append(", allowedTags=").append(String.valueOf(this.allowedTags));
        sb.append(", appSignonPolicy=").append(String.valueOf(this.appSignonPolicy));
        sb.append(", trustPolicies=").append(String.valueOf(this.trustPolicies));
        sb.append(", signonPolicy=").append(String.valueOf(this.signonPolicy));
        sb.append(", identityProviders=").append(String.valueOf(this.identityProviders));
        sb.append(", accounts=").append(String.valueOf(this.accounts));
        sb.append(", grants=").append(String.valueOf(this.grants));
        sb.append(", serviceParams=").append(String.valueOf(this.serviceParams));
        sb.append(", attrRenderingMetadata=").append(String.valueOf(this.attrRenderingMetadata));
        sb.append(", basedOnTemplate=").append(String.valueOf(this.basedOnTemplate));
        sb.append(", grantedAppRoles=").append(String.valueOf(this.grantedAppRoles));
        sb.append(", samlServiceProvider=").append(String.valueOf(this.samlServiceProvider));
        sb.append(", allowedScopes=").append(String.valueOf(this.allowedScopes));
        sb.append(", certificates=").append(String.valueOf(this.certificates));
        sb.append(", aliasApps=").append(String.valueOf(this.aliasApps));
        sb.append(", asOPCService=").append(String.valueOf(this.asOPCService));
        sb.append(", adminRoles=").append(String.valueOf(this.adminRoles));
        sb.append(", userRoles=").append(String.valueOf(this.userRoles));
        sb.append(", scopes=").append(String.valueOf(this.scopes));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp=")
                .append(
                        String.valueOf(
                                this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate=")
                .append(
                        String.valueOf(
                                this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionOciTags=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp=")
                .append(
                        String.valueOf(
                                this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof App)) {
            return false;
        }

        App other = (App) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.schemas, other.schemas)
                && java.util.Objects.equals(this.meta, other.meta)
                && java.util.Objects.equals(this.idcsCreatedBy, other.idcsCreatedBy)
                && java.util.Objects.equals(this.idcsLastModifiedBy, other.idcsLastModifiedBy)
                && java.util.Objects.equals(
                        this.idcsPreventedOperations, other.idcsPreventedOperations)
                && java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.deleteInProgress, other.deleteInProgress)
                && java.util.Objects.equals(
                        this.idcsLastUpgradedInRelease, other.idcsLastUpgradedInRelease)
                && java.util.Objects.equals(this.domainOcid, other.domainOcid)
                && java.util.Objects.equals(this.compartmentOcid, other.compartmentOcid)
                && java.util.Objects.equals(this.tenancyOcid, other.tenancyOcid)
                && java.util.Objects.equals(this.meterAsOPCService, other.meterAsOPCService)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && java.util.Objects.equals(this.hashedClientSecret, other.hashedClientSecret)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.idTokenEncAlgo, other.idTokenEncAlgo)
                && java.util.Objects.equals(this.delegatedServiceNames, other.delegatedServiceNames)
                && java.util.Objects.equals(this.active, other.active)
                && java.util.Objects.equals(this.appIcon, other.appIcon)
                && java.util.Objects.equals(this.appThumbnail, other.appThumbnail)
                && java.util.Objects.equals(this.migrated, other.migrated)
                && java.util.Objects.equals(this.infrastructure, other.infrastructure)
                && java.util.Objects.equals(this.isLoginTarget, other.isLoginTarget)
                && java.util.Objects.equals(this.showInMyApps, other.showInMyApps)
                && java.util.Objects.equals(this.loginMechanism, other.loginMechanism)
                && java.util.Objects.equals(this.landingPageUrl, other.landingPageUrl)
                && java.util.Objects.equals(this.productLogoUrl, other.productLogoUrl)
                && java.util.Objects.equals(this.privacyPolicyUrl, other.privacyPolicyUrl)
                && java.util.Objects.equals(this.termsOfServiceUrl, other.termsOfServiceUrl)
                && java.util.Objects.equals(this.contactEmailAddress, other.contactEmailAddress)
                && java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.homePageUrl, other.homePageUrl)
                && java.util.Objects.equals(this.isFormFill, other.isFormFill)
                && java.util.Objects.equals(this.isOAuthClient, other.isOAuthClient)
                && java.util.Objects.equals(this.isRadiusApp, other.isRadiusApp)
                && java.util.Objects.equals(this.clientType, other.clientType)
                && java.util.Objects.equals(this.redirectUris, other.redirectUris)
                && java.util.Objects.equals(this.allUrlSchemesAllowed, other.allUrlSchemesAllowed)
                && java.util.Objects.equals(this.logoutUri, other.logoutUri)
                && java.util.Objects.equals(
                        this.postLogoutRedirectUris, other.postLogoutRedirectUris)
                && java.util.Objects.equals(this.allowedGrants, other.allowedGrants)
                && java.util.Objects.equals(this.allowedOperations, other.allowedOperations)
                && java.util.Objects.equals(this.clientIPChecking, other.clientIPChecking)
                && java.util.Objects.equals(this.isOPCService, other.isOPCService)
                && java.util.Objects.equals(this.isUnmanagedApp, other.isUnmanagedApp)
                && java.util.Objects.equals(this.allowAccessControl, other.allowAccessControl)
                && java.util.Objects.equals(this.isOAuthResource, other.isOAuthResource)
                && java.util.Objects.equals(this.accessTokenExpiry, other.accessTokenExpiry)
                && java.util.Objects.equals(this.refreshTokenExpiry, other.refreshTokenExpiry)
                && java.util.Objects.equals(this.allowOffline, other.allowOffline)
                && java.util.Objects.equals(this.callbackServiceUrl, other.callbackServiceUrl)
                && java.util.Objects.equals(this.audience, other.audience)
                && java.util.Objects.equals(this.isMobileTarget, other.isMobileTarget)
                && java.util.Objects.equals(this.loginPageUrl, other.loginPageUrl)
                && java.util.Objects.equals(this.linkingCallbackUrl, other.linkingCallbackUrl)
                && java.util.Objects.equals(this.logoutPageUrl, other.logoutPageUrl)
                && java.util.Objects.equals(this.errorPageUrl, other.errorPageUrl)
                && java.util.Objects.equals(this.isSamlServiceProvider, other.isSamlServiceProvider)
                && java.util.Objects.equals(this.isWebTierPolicy, other.isWebTierPolicy)
                && java.util.Objects.equals(this.isKerberosRealm, other.isKerberosRealm)
                && java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.isAliasApp, other.isAliasApp)
                && java.util.Objects.equals(this.isManagedApp, other.isManagedApp)
                && java.util.Objects.equals(this.serviceTypeURN, other.serviceTypeURN)
                && java.util.Objects.equals(this.serviceTypeVersion, other.serviceTypeVersion)
                && java.util.Objects.equals(this.isObligationCapable, other.isObligationCapable)
                && java.util.Objects.equals(this.readyToUpgrade, other.readyToUpgrade)
                && java.util.Objects.equals(this.trustScope, other.trustScope)
                && java.util.Objects.equals(this.isDatabaseService, other.isDatabaseService)
                && java.util.Objects.equals(this.secondaryAudiences, other.secondaryAudiences)
                && java.util.Objects.equals(this.isEnterpriseApp, other.isEnterpriseApp)
                && java.util.Objects.equals(this.bypassConsent, other.bypassConsent)
                && java.util.Objects.equals(
                        this.disableKmsiTokenAuthentication, other.disableKmsiTokenAuthentication)
                && java.util.Objects.equals(
                        this.isMulticloudServiceApp, other.isMulticloudServiceApp)
                && java.util.Objects.equals(this.radiusPolicy, other.radiusPolicy)
                && java.util.Objects.equals(this.appsNetworkPerimeters, other.appsNetworkPerimeters)
                && java.util.Objects.equals(
                        this.cloudControlProperties, other.cloudControlProperties)
                && java.util.Objects.equals(this.editableAttributes, other.editableAttributes)
                && java.util.Objects.equals(this.termsOfUse, other.termsOfUse)
                && java.util.Objects.equals(
                        this.protectableSecondaryAudiences, other.protectableSecondaryAudiences)
                && java.util.Objects.equals(this.idpPolicy, other.idpPolicy)
                && java.util.Objects.equals(this.allowedTags, other.allowedTags)
                && java.util.Objects.equals(this.appSignonPolicy, other.appSignonPolicy)
                && java.util.Objects.equals(this.trustPolicies, other.trustPolicies)
                && java.util.Objects.equals(this.signonPolicy, other.signonPolicy)
                && java.util.Objects.equals(this.identityProviders, other.identityProviders)
                && java.util.Objects.equals(this.accounts, other.accounts)
                && java.util.Objects.equals(this.grants, other.grants)
                && java.util.Objects.equals(this.serviceParams, other.serviceParams)
                && java.util.Objects.equals(this.attrRenderingMetadata, other.attrRenderingMetadata)
                && java.util.Objects.equals(this.basedOnTemplate, other.basedOnTemplate)
                && java.util.Objects.equals(this.grantedAppRoles, other.grantedAppRoles)
                && java.util.Objects.equals(this.samlServiceProvider, other.samlServiceProvider)
                && java.util.Objects.equals(this.allowedScopes, other.allowedScopes)
                && java.util.Objects.equals(this.certificates, other.certificates)
                && java.util.Objects.equals(this.aliasApps, other.aliasApps)
                && java.util.Objects.equals(this.asOPCService, other.asOPCService)
                && java.util.Objects.equals(this.adminRoles, other.adminRoles)
                && java.util.Objects.equals(this.userRoles, other.userRoles)
                && java.util.Objects.equals(this.scopes, other.scopes)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp)
                && java.util.Objects.equals(
                        this
                                .urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.schemas == null ? 43 : this.schemas.hashCode());
        result = (result * PRIME) + (this.meta == null ? 43 : this.meta.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCreatedBy == null ? 43 : this.idcsCreatedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsLastModifiedBy == null
                                ? 43
                                : this.idcsLastModifiedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsPreventedOperations == null
                                ? 43
                                : this.idcsPreventedOperations.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteInProgress == null ? 43 : this.deleteInProgress.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsLastUpgradedInRelease == null
                                ? 43
                                : this.idcsLastUpgradedInRelease.hashCode());
        result = (result * PRIME) + (this.domainOcid == null ? 43 : this.domainOcid.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentOcid == null ? 43 : this.compartmentOcid.hashCode());
        result = (result * PRIME) + (this.tenancyOcid == null ? 43 : this.tenancyOcid.hashCode());
        result =
                (result * PRIME)
                        + (this.meterAsOPCService == null ? 43 : this.meterAsOPCService.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.hashedClientSecret == null
                                ? 43
                                : this.hashedClientSecret.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.idTokenEncAlgo == null ? 43 : this.idTokenEncAlgo.hashCode());
        result =
                (result * PRIME)
                        + (this.delegatedServiceNames == null
                                ? 43
                                : this.delegatedServiceNames.hashCode());
        result = (result * PRIME) + (this.active == null ? 43 : this.active.hashCode());
        result = (result * PRIME) + (this.appIcon == null ? 43 : this.appIcon.hashCode());
        result = (result * PRIME) + (this.appThumbnail == null ? 43 : this.appThumbnail.hashCode());
        result = (result * PRIME) + (this.migrated == null ? 43 : this.migrated.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructure == null ? 43 : this.infrastructure.hashCode());
        result =
                (result * PRIME)
                        + (this.isLoginTarget == null ? 43 : this.isLoginTarget.hashCode());
        result = (result * PRIME) + (this.showInMyApps == null ? 43 : this.showInMyApps.hashCode());
        result =
                (result * PRIME)
                        + (this.loginMechanism == null ? 43 : this.loginMechanism.hashCode());
        result =
                (result * PRIME)
                        + (this.landingPageUrl == null ? 43 : this.landingPageUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.productLogoUrl == null ? 43 : this.productLogoUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.privacyPolicyUrl == null ? 43 : this.privacyPolicyUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.termsOfServiceUrl == null ? 43 : this.termsOfServiceUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.contactEmailAddress == null
                                ? 43
                                : this.contactEmailAddress.hashCode());
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result = (result * PRIME) + (this.homePageUrl == null ? 43 : this.homePageUrl.hashCode());
        result = (result * PRIME) + (this.isFormFill == null ? 43 : this.isFormFill.hashCode());
        result =
                (result * PRIME)
                        + (this.isOAuthClient == null ? 43 : this.isOAuthClient.hashCode());
        result = (result * PRIME) + (this.isRadiusApp == null ? 43 : this.isRadiusApp.hashCode());
        result = (result * PRIME) + (this.clientType == null ? 43 : this.clientType.hashCode());
        result = (result * PRIME) + (this.redirectUris == null ? 43 : this.redirectUris.hashCode());
        result =
                (result * PRIME)
                        + (this.allUrlSchemesAllowed == null
                                ? 43
                                : this.allUrlSchemesAllowed.hashCode());
        result = (result * PRIME) + (this.logoutUri == null ? 43 : this.logoutUri.hashCode());
        result =
                (result * PRIME)
                        + (this.postLogoutRedirectUris == null
                                ? 43
                                : this.postLogoutRedirectUris.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedGrants == null ? 43 : this.allowedGrants.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedOperations == null ? 43 : this.allowedOperations.hashCode());
        result =
                (result * PRIME)
                        + (this.clientIPChecking == null ? 43 : this.clientIPChecking.hashCode());
        result = (result * PRIME) + (this.isOPCService == null ? 43 : this.isOPCService.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnmanagedApp == null ? 43 : this.isUnmanagedApp.hashCode());
        result =
                (result * PRIME)
                        + (this.allowAccessControl == null
                                ? 43
                                : this.allowAccessControl.hashCode());
        result =
                (result * PRIME)
                        + (this.isOAuthResource == null ? 43 : this.isOAuthResource.hashCode());
        result =
                (result * PRIME)
                        + (this.accessTokenExpiry == null ? 43 : this.accessTokenExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshTokenExpiry == null
                                ? 43
                                : this.refreshTokenExpiry.hashCode());
        result = (result * PRIME) + (this.allowOffline == null ? 43 : this.allowOffline.hashCode());
        result =
                (result * PRIME)
                        + (this.callbackServiceUrl == null
                                ? 43
                                : this.callbackServiceUrl.hashCode());
        result = (result * PRIME) + (this.audience == null ? 43 : this.audience.hashCode());
        result =
                (result * PRIME)
                        + (this.isMobileTarget == null ? 43 : this.isMobileTarget.hashCode());
        result = (result * PRIME) + (this.loginPageUrl == null ? 43 : this.loginPageUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.linkingCallbackUrl == null
                                ? 43
                                : this.linkingCallbackUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.logoutPageUrl == null ? 43 : this.logoutPageUrl.hashCode());
        result = (result * PRIME) + (this.errorPageUrl == null ? 43 : this.errorPageUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.isSamlServiceProvider == null
                                ? 43
                                : this.isSamlServiceProvider.hashCode());
        result =
                (result * PRIME)
                        + (this.isWebTierPolicy == null ? 43 : this.isWebTierPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.isKerberosRealm == null ? 43 : this.isKerberosRealm.hashCode());
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.isAliasApp == null ? 43 : this.isAliasApp.hashCode());
        result = (result * PRIME) + (this.isManagedApp == null ? 43 : this.isManagedApp.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceTypeURN == null ? 43 : this.serviceTypeURN.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceTypeVersion == null
                                ? 43
                                : this.serviceTypeVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isObligationCapable == null
                                ? 43
                                : this.isObligationCapable.hashCode());
        result =
                (result * PRIME)
                        + (this.readyToUpgrade == null ? 43 : this.readyToUpgrade.hashCode());
        result = (result * PRIME) + (this.trustScope == null ? 43 : this.trustScope.hashCode());
        result =
                (result * PRIME)
                        + (this.isDatabaseService == null ? 43 : this.isDatabaseService.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryAudiences == null
                                ? 43
                                : this.secondaryAudiences.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnterpriseApp == null ? 43 : this.isEnterpriseApp.hashCode());
        result =
                (result * PRIME)
                        + (this.bypassConsent == null ? 43 : this.bypassConsent.hashCode());
        result =
                (result * PRIME)
                        + (this.disableKmsiTokenAuthentication == null
                                ? 43
                                : this.disableKmsiTokenAuthentication.hashCode());
        result =
                (result * PRIME)
                        + (this.isMulticloudServiceApp == null
                                ? 43
                                : this.isMulticloudServiceApp.hashCode());
        result = (result * PRIME) + (this.radiusPolicy == null ? 43 : this.radiusPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.appsNetworkPerimeters == null
                                ? 43
                                : this.appsNetworkPerimeters.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudControlProperties == null
                                ? 43
                                : this.cloudControlProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.editableAttributes == null
                                ? 43
                                : this.editableAttributes.hashCode());
        result = (result * PRIME) + (this.termsOfUse == null ? 43 : this.termsOfUse.hashCode());
        result =
                (result * PRIME)
                        + (this.protectableSecondaryAudiences == null
                                ? 43
                                : this.protectableSecondaryAudiences.hashCode());
        result = (result * PRIME) + (this.idpPolicy == null ? 43 : this.idpPolicy.hashCode());
        result = (result * PRIME) + (this.allowedTags == null ? 43 : this.allowedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.appSignonPolicy == null ? 43 : this.appSignonPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.trustPolicies == null ? 43 : this.trustPolicies.hashCode());
        result = (result * PRIME) + (this.signonPolicy == null ? 43 : this.signonPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.identityProviders == null ? 43 : this.identityProviders.hashCode());
        result = (result * PRIME) + (this.accounts == null ? 43 : this.accounts.hashCode());
        result = (result * PRIME) + (this.grants == null ? 43 : this.grants.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceParams == null ? 43 : this.serviceParams.hashCode());
        result =
                (result * PRIME)
                        + (this.attrRenderingMetadata == null
                                ? 43
                                : this.attrRenderingMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.basedOnTemplate == null ? 43 : this.basedOnTemplate.hashCode());
        result =
                (result * PRIME)
                        + (this.grantedAppRoles == null ? 43 : this.grantedAppRoles.hashCode());
        result =
                (result * PRIME)
                        + (this.samlServiceProvider == null
                                ? 43
                                : this.samlServiceProvider.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedScopes == null ? 43 : this.allowedScopes.hashCode());
        result = (result * PRIME) + (this.certificates == null ? 43 : this.certificates.hashCode());
        result = (result * PRIME) + (this.aliasApps == null ? 43 : this.aliasApps.hashCode());
        result = (result * PRIME) + (this.asOPCService == null ? 43 : this.asOPCService.hashCode());
        result = (result * PRIME) + (this.adminRoles == null ? 43 : this.adminRoles.hashCode());
        result = (result * PRIME) + (this.userRoles == null ? 43 : this.userRoles.hashCode());
        result = (result * PRIME) + (this.scopes == null ? 43 : this.scopes.hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionRadiusAppApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp
                                        == null
                                ? 43
                                : this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionSamlServiceProviderApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionWebTierPolicyApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionManagedappApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this
                                                .urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate
                                        == null
                                ? 43
                                : this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppTemplateAppTemplate
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionOpcServiceApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosRealmApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionFormFillAppApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionEnterpriseAppApp
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp
                                        == null
                                ? 43
                                : this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionMulticloudServiceAppApp
                                        .hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
