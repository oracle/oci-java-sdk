/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Managed App <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AppExtensionManagedappApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppExtensionManagedappApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "connected",
        "canBeAuthoritative",
        "isAuthoritative",
        "isOnPremiseApp",
        "isDirectory",
        "isSchemaDiscoverySupported",
        "isSchemaCustomizationSupported",
        "enableSync",
        "enableSyncSummaryReportNotification",
        "enableAuthSyncNewUserNotification",
        "adminConsentGranted",
        "isThreeLeggedOAuthEnabled",
        "isTwoLeggedOAuthEnabled",
        "threeLeggedOAuthProviderName",
        "syncConfigLastModified",
        "accountFormVisible",
        "identityBridges",
        "connectorBundle",
        "bundleConfigurationProperties",
        "objectClasses",
        "bundlePoolConfiguration",
        "flatFileConnectorBundle",
        "flatFileBundleConfigurationProperties",
        "threeLeggedOAuthCredential"
    })
    public AppExtensionManagedappApp(
            Boolean connected,
            Boolean canBeAuthoritative,
            Boolean isAuthoritative,
            Boolean isOnPremiseApp,
            Boolean isDirectory,
            Boolean isSchemaDiscoverySupported,
            Boolean isSchemaCustomizationSupported,
            Boolean enableSync,
            Boolean enableSyncSummaryReportNotification,
            Boolean enableAuthSyncNewUserNotification,
            Boolean adminConsentGranted,
            Boolean isThreeLeggedOAuthEnabled,
            Boolean isTwoLeggedOAuthEnabled,
            String threeLeggedOAuthProviderName,
            String syncConfigLastModified,
            Boolean accountFormVisible,
            java.util.List<AppIdentityBridges> identityBridges,
            AppConnectorBundle connectorBundle,
            java.util.List<AppBundleConfigurationProperties> bundleConfigurationProperties,
            java.util.List<AppObjectClasses> objectClasses,
            AppBundlePoolConfiguration bundlePoolConfiguration,
            AppFlatFileConnectorBundle flatFileConnectorBundle,
            java.util.List<AppFlatFileBundleConfigurationProperties>
                    flatFileBundleConfigurationProperties,
            AppThreeLeggedOAuthCredential threeLeggedOAuthCredential) {
        super();
        this.connected = connected;
        this.canBeAuthoritative = canBeAuthoritative;
        this.isAuthoritative = isAuthoritative;
        this.isOnPremiseApp = isOnPremiseApp;
        this.isDirectory = isDirectory;
        this.isSchemaDiscoverySupported = isSchemaDiscoverySupported;
        this.isSchemaCustomizationSupported = isSchemaCustomizationSupported;
        this.enableSync = enableSync;
        this.enableSyncSummaryReportNotification = enableSyncSummaryReportNotification;
        this.enableAuthSyncNewUserNotification = enableAuthSyncNewUserNotification;
        this.adminConsentGranted = adminConsentGranted;
        this.isThreeLeggedOAuthEnabled = isThreeLeggedOAuthEnabled;
        this.isTwoLeggedOAuthEnabled = isTwoLeggedOAuthEnabled;
        this.threeLeggedOAuthProviderName = threeLeggedOAuthProviderName;
        this.syncConfigLastModified = syncConfigLastModified;
        this.accountFormVisible = accountFormVisible;
        this.identityBridges = identityBridges;
        this.connectorBundle = connectorBundle;
        this.bundleConfigurationProperties = bundleConfigurationProperties;
        this.objectClasses = objectClasses;
        this.bundlePoolConfiguration = bundlePoolConfiguration;
        this.flatFileConnectorBundle = flatFileConnectorBundle;
        this.flatFileBundleConfigurationProperties = flatFileBundleConfigurationProperties;
        this.threeLeggedOAuthCredential = threeLeggedOAuthCredential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, the accounts of the application are managed through an ICF connector bundle
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connected")
        private Boolean connected;

        /**
         * If true, the accounts of the application are managed through an ICF connector bundle
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param connected the value to set
         * @return this builder
         */
        public Builder connected(Boolean connected) {
            this.connected = connected;
            this.__explicitlySet__.add("connected");
            return this;
        }
        /**
         * If true, the managed app can be authoritative.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canBeAuthoritative")
        private Boolean canBeAuthoritative;

        /**
         * If true, the managed app can be authoritative.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param canBeAuthoritative the value to set
         * @return this builder
         */
        public Builder canBeAuthoritative(Boolean canBeAuthoritative) {
            this.canBeAuthoritative = canBeAuthoritative;
            this.__explicitlySet__.add("canBeAuthoritative");
            return this;
        }
        /**
         * If true, sync from the managed app will be performed as authoritative sync.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAuthoritative")
        private Boolean isAuthoritative;

        /**
         * If true, sync from the managed app will be performed as authoritative sync.
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param isAuthoritative the value to set
         * @return this builder
         */
        public Builder isAuthoritative(Boolean isAuthoritative) {
            this.isAuthoritative = isAuthoritative;
            this.__explicitlySet__.add("isAuthoritative");
            return this;
        }
        /**
         * If true, the managed app is an On-Premise app.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOnPremiseApp")
        private Boolean isOnPremiseApp;

        /**
         * If true, the managed app is an On-Premise app.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param isOnPremiseApp the value to set
         * @return this builder
         */
        public Builder isOnPremiseApp(Boolean isOnPremiseApp) {
            this.isOnPremiseApp = isOnPremiseApp;
            this.__explicitlySet__.add("isOnPremiseApp");
            return this;
        }
        /**
         * If true, the managed app is a directory.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDirectory")
        private Boolean isDirectory;

        /**
         * If true, the managed app is a directory.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param isDirectory the value to set
         * @return this builder
         */
        public Builder isDirectory(Boolean isDirectory) {
            this.isDirectory = isDirectory;
            this.__explicitlySet__.add("isDirectory");
            return this;
        }
        /**
         * If true, the managed app supports schema discovery.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSchemaDiscoverySupported")
        private Boolean isSchemaDiscoverySupported;

        /**
         * If true, the managed app supports schema discovery.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param isSchemaDiscoverySupported the value to set
         * @return this builder
         */
        public Builder isSchemaDiscoverySupported(Boolean isSchemaDiscoverySupported) {
            this.isSchemaDiscoverySupported = isSchemaDiscoverySupported;
            this.__explicitlySet__.add("isSchemaDiscoverySupported");
            return this;
        }
        /**
         * If true, the managed app supports schema customization.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSchemaCustomizationSupported")
        private Boolean isSchemaCustomizationSupported;

        /**
         * If true, the managed app supports schema customization.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param isSchemaCustomizationSupported the value to set
         * @return this builder
         */
        public Builder isSchemaCustomizationSupported(Boolean isSchemaCustomizationSupported) {
            this.isSchemaCustomizationSupported = isSchemaCustomizationSupported;
            this.__explicitlySet__.add("isSchemaCustomizationSupported");
            return this;
        }
        /**
         * If true, sync run-time operations are enabled for this App.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enableSync")
        private Boolean enableSync;

        /**
         * If true, sync run-time operations are enabled for this App.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param enableSync the value to set
         * @return this builder
         */
        public Builder enableSync(Boolean enableSync) {
            this.enableSync = enableSync;
            this.__explicitlySet__.add("enableSync");
            return this;
        }
        /**
         * If true, send sync summary as notification upon job completion.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enableSyncSummaryReportNotification")
        private Boolean enableSyncSummaryReportNotification;

        /**
         * If true, send sync summary as notification upon job completion.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param enableSyncSummaryReportNotification the value to set
         * @return this builder
         */
        public Builder enableSyncSummaryReportNotification(
                Boolean enableSyncSummaryReportNotification) {
            this.enableSyncSummaryReportNotification = enableSyncSummaryReportNotification;
            this.__explicitlySet__.add("enableSyncSummaryReportNotification");
            return this;
        }
        /**
         * If true, send activation email to new users created from authoritative sync.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enableAuthSyncNewUserNotification")
        private Boolean enableAuthSyncNewUserNotification;

        /**
         * If true, send activation email to new users created from authoritative sync.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param enableAuthSyncNewUserNotification the value to set
         * @return this builder
         */
        public Builder enableAuthSyncNewUserNotification(
                Boolean enableAuthSyncNewUserNotification) {
            this.enableAuthSyncNewUserNotification = enableAuthSyncNewUserNotification;
            this.__explicitlySet__.add("enableAuthSyncNewUserNotification");
            return this;
        }
        /**
         * If true, admin has granted consent to perform managed app run-time operations.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminConsentGranted")
        private Boolean adminConsentGranted;

        /**
         * If true, admin has granted consent to perform managed app run-time operations.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param adminConsentGranted the value to set
         * @return this builder
         */
        public Builder adminConsentGranted(Boolean adminConsentGranted) {
            this.adminConsentGranted = adminConsentGranted;
            this.__explicitlySet__.add("adminConsentGranted");
            return this;
        }
        /**
         * If true, the managed app requires 3-legged OAuth for authorization.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isThreeLeggedOAuthEnabled")
        private Boolean isThreeLeggedOAuthEnabled;

        /**
         * If true, the managed app requires 3-legged OAuth for authorization.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param isThreeLeggedOAuthEnabled the value to set
         * @return this builder
         */
        public Builder isThreeLeggedOAuthEnabled(Boolean isThreeLeggedOAuthEnabled) {
            this.isThreeLeggedOAuthEnabled = isThreeLeggedOAuthEnabled;
            this.__explicitlySet__.add("isThreeLeggedOAuthEnabled");
            return this;
        }
        /**
         * If true, indicates that Oracle Identity Cloud Service can use two-legged OAuth to connect
         * to this ManagedApp.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isTwoLeggedOAuthEnabled")
        private Boolean isTwoLeggedOAuthEnabled;

        /**
         * If true, indicates that Oracle Identity Cloud Service can use two-legged OAuth to connect
         * to this ManagedApp.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param isTwoLeggedOAuthEnabled the value to set
         * @return this builder
         */
        public Builder isTwoLeggedOAuthEnabled(Boolean isTwoLeggedOAuthEnabled) {
            this.isTwoLeggedOAuthEnabled = isTwoLeggedOAuthEnabled;
            this.__explicitlySet__.add("isTwoLeggedOAuthEnabled");
            return this;
        }
        /**
         * Three legged OAuth provider name in Oracle Identity Cloud Service.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threeLeggedOAuthProviderName")
        private String threeLeggedOAuthProviderName;

        /**
         * Three legged OAuth provider name in Oracle Identity Cloud Service.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string
         *
         * @param threeLeggedOAuthProviderName the value to set
         * @return this builder
         */
        public Builder threeLeggedOAuthProviderName(String threeLeggedOAuthProviderName) {
            this.threeLeggedOAuthProviderName = threeLeggedOAuthProviderName;
            this.__explicitlySet__.add("threeLeggedOAuthProviderName");
            return this;
        }
        /**
         * The most recent DateTime that the configuration of this App was updated. AppServices
         * updates this timestamp whenever AppServices updates an App's configuration with respect
         * to synchronization.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: request - type: dateTime - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("syncConfigLastModified")
        private String syncConfigLastModified;

        /**
         * The most recent DateTime that the configuration of this App was updated. AppServices
         * updates this timestamp whenever AppServices updates an App's configuration with respect
         * to synchronization.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: request - type: dateTime - uniqueness:
         * none
         *
         * @param syncConfigLastModified the value to set
         * @return this builder
         */
        public Builder syncConfigLastModified(String syncConfigLastModified) {
            this.syncConfigLastModified = syncConfigLastModified;
            this.__explicitlySet__.add("syncConfigLastModified");
            return this;
        }
        /**
         * If true, then the account form will be displayed in the Oracle Identity Cloud Service UI
         * to interactively create or update an account for this App. If a value is not specified
         * for this attribute, a default value of \\"false\\" will be assumed as the value for this
         * attribute.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountFormVisible")
        private Boolean accountFormVisible;

        /**
         * If true, then the account form will be displayed in the Oracle Identity Cloud Service UI
         * to interactively create or update an account for this App. If a value is not specified
         * for this attribute, a default value of \\"false\\" will be assumed as the value for this
         * attribute.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param accountFormVisible the value to set
         * @return this builder
         */
        public Builder accountFormVisible(Boolean accountFormVisible) {
            this.accountFormVisible = accountFormVisible;
            this.__explicitlySet__.add("accountFormVisible");
            return this;
        }
        /**
         * IdentityBridges associated with this App
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityBridges")
        private java.util.List<AppIdentityBridges> identityBridges;

        /**
         * IdentityBridges associated with this App
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         *
         * @param identityBridges the value to set
         * @return this builder
         */
        public Builder identityBridges(java.util.List<AppIdentityBridges> identityBridges) {
            this.identityBridges = identityBridges;
            this.__explicitlySet__.add("identityBridges");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectorBundle")
        private AppConnectorBundle connectorBundle;

        public Builder connectorBundle(AppConnectorBundle connectorBundle) {
            this.connectorBundle = connectorBundle;
            this.__explicitlySet__.add("connectorBundle");
            return this;
        }
        /**
         * ConnectorBundle configuration properties
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: true - multiValued:
         * true - mutability: readWrite - required: false - returned: default - type: complex -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bundleConfigurationProperties")
        private java.util.List<AppBundleConfigurationProperties> bundleConfigurationProperties;

        /**
         * ConnectorBundle configuration properties
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: true - multiValued:
         * true - mutability: readWrite - required: false - returned: default - type: complex -
         * uniqueness: none
         *
         * @param bundleConfigurationProperties the value to set
         * @return this builder
         */
        public Builder bundleConfigurationProperties(
                java.util.List<AppBundleConfigurationProperties> bundleConfigurationProperties) {
            this.bundleConfigurationProperties = bundleConfigurationProperties;
            this.__explicitlySet__.add("bundleConfigurationProperties");
            return this;
        }
        /**
         * Object classes
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: default - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectClasses")
        private java.util.List<AppObjectClasses> objectClasses;

        /**
         * Object classes
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: default - type:
         * complex - uniqueness: none
         *
         * @param objectClasses the value to set
         * @return this builder
         */
        public Builder objectClasses(java.util.List<AppObjectClasses> objectClasses) {
            this.objectClasses = objectClasses;
            this.__explicitlySet__.add("objectClasses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bundlePoolConfiguration")
        private AppBundlePoolConfiguration bundlePoolConfiguration;

        public Builder bundlePoolConfiguration(AppBundlePoolConfiguration bundlePoolConfiguration) {
            this.bundlePoolConfiguration = bundlePoolConfiguration;
            this.__explicitlySet__.add("bundlePoolConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flatFileConnectorBundle")
        private AppFlatFileConnectorBundle flatFileConnectorBundle;

        public Builder flatFileConnectorBundle(AppFlatFileConnectorBundle flatFileConnectorBundle) {
            this.flatFileConnectorBundle = flatFileConnectorBundle;
            this.__explicitlySet__.add("flatFileConnectorBundle");
            return this;
        }
        /**
         * Flat file connector bundle configuration properties
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: true - multiValued:
         * true - mutability: readWrite - required: false - returned: default - type: complex -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("flatFileBundleConfigurationProperties")
        private java.util.List<AppFlatFileBundleConfigurationProperties>
                flatFileBundleConfigurationProperties;

        /**
         * Flat file connector bundle configuration properties
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: true - multiValued:
         * true - mutability: readWrite - required: false - returned: default - type: complex -
         * uniqueness: none
         *
         * @param flatFileBundleConfigurationProperties the value to set
         * @return this builder
         */
        public Builder flatFileBundleConfigurationProperties(
                java.util.List<AppFlatFileBundleConfigurationProperties>
                        flatFileBundleConfigurationProperties) {
            this.flatFileBundleConfigurationProperties = flatFileBundleConfigurationProperties;
            this.__explicitlySet__.add("flatFileBundleConfigurationProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threeLeggedOAuthCredential")
        private AppThreeLeggedOAuthCredential threeLeggedOAuthCredential;

        public Builder threeLeggedOAuthCredential(
                AppThreeLeggedOAuthCredential threeLeggedOAuthCredential) {
            this.threeLeggedOAuthCredential = threeLeggedOAuthCredential;
            this.__explicitlySet__.add("threeLeggedOAuthCredential");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionManagedappApp build() {
            AppExtensionManagedappApp model =
                    new AppExtensionManagedappApp(
                            this.connected,
                            this.canBeAuthoritative,
                            this.isAuthoritative,
                            this.isOnPremiseApp,
                            this.isDirectory,
                            this.isSchemaDiscoverySupported,
                            this.isSchemaCustomizationSupported,
                            this.enableSync,
                            this.enableSyncSummaryReportNotification,
                            this.enableAuthSyncNewUserNotification,
                            this.adminConsentGranted,
                            this.isThreeLeggedOAuthEnabled,
                            this.isTwoLeggedOAuthEnabled,
                            this.threeLeggedOAuthProviderName,
                            this.syncConfigLastModified,
                            this.accountFormVisible,
                            this.identityBridges,
                            this.connectorBundle,
                            this.bundleConfigurationProperties,
                            this.objectClasses,
                            this.bundlePoolConfiguration,
                            this.flatFileConnectorBundle,
                            this.flatFileBundleConfigurationProperties,
                            this.threeLeggedOAuthCredential);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionManagedappApp model) {
            if (model.wasPropertyExplicitlySet("connected")) {
                this.connected(model.getConnected());
            }
            if (model.wasPropertyExplicitlySet("canBeAuthoritative")) {
                this.canBeAuthoritative(model.getCanBeAuthoritative());
            }
            if (model.wasPropertyExplicitlySet("isAuthoritative")) {
                this.isAuthoritative(model.getIsAuthoritative());
            }
            if (model.wasPropertyExplicitlySet("isOnPremiseApp")) {
                this.isOnPremiseApp(model.getIsOnPremiseApp());
            }
            if (model.wasPropertyExplicitlySet("isDirectory")) {
                this.isDirectory(model.getIsDirectory());
            }
            if (model.wasPropertyExplicitlySet("isSchemaDiscoverySupported")) {
                this.isSchemaDiscoverySupported(model.getIsSchemaDiscoverySupported());
            }
            if (model.wasPropertyExplicitlySet("isSchemaCustomizationSupported")) {
                this.isSchemaCustomizationSupported(model.getIsSchemaCustomizationSupported());
            }
            if (model.wasPropertyExplicitlySet("enableSync")) {
                this.enableSync(model.getEnableSync());
            }
            if (model.wasPropertyExplicitlySet("enableSyncSummaryReportNotification")) {
                this.enableSyncSummaryReportNotification(
                        model.getEnableSyncSummaryReportNotification());
            }
            if (model.wasPropertyExplicitlySet("enableAuthSyncNewUserNotification")) {
                this.enableAuthSyncNewUserNotification(
                        model.getEnableAuthSyncNewUserNotification());
            }
            if (model.wasPropertyExplicitlySet("adminConsentGranted")) {
                this.adminConsentGranted(model.getAdminConsentGranted());
            }
            if (model.wasPropertyExplicitlySet("isThreeLeggedOAuthEnabled")) {
                this.isThreeLeggedOAuthEnabled(model.getIsThreeLeggedOAuthEnabled());
            }
            if (model.wasPropertyExplicitlySet("isTwoLeggedOAuthEnabled")) {
                this.isTwoLeggedOAuthEnabled(model.getIsTwoLeggedOAuthEnabled());
            }
            if (model.wasPropertyExplicitlySet("threeLeggedOAuthProviderName")) {
                this.threeLeggedOAuthProviderName(model.getThreeLeggedOAuthProviderName());
            }
            if (model.wasPropertyExplicitlySet("syncConfigLastModified")) {
                this.syncConfigLastModified(model.getSyncConfigLastModified());
            }
            if (model.wasPropertyExplicitlySet("accountFormVisible")) {
                this.accountFormVisible(model.getAccountFormVisible());
            }
            if (model.wasPropertyExplicitlySet("identityBridges")) {
                this.identityBridges(model.getIdentityBridges());
            }
            if (model.wasPropertyExplicitlySet("connectorBundle")) {
                this.connectorBundle(model.getConnectorBundle());
            }
            if (model.wasPropertyExplicitlySet("bundleConfigurationProperties")) {
                this.bundleConfigurationProperties(model.getBundleConfigurationProperties());
            }
            if (model.wasPropertyExplicitlySet("objectClasses")) {
                this.objectClasses(model.getObjectClasses());
            }
            if (model.wasPropertyExplicitlySet("bundlePoolConfiguration")) {
                this.bundlePoolConfiguration(model.getBundlePoolConfiguration());
            }
            if (model.wasPropertyExplicitlySet("flatFileConnectorBundle")) {
                this.flatFileConnectorBundle(model.getFlatFileConnectorBundle());
            }
            if (model.wasPropertyExplicitlySet("flatFileBundleConfigurationProperties")) {
                this.flatFileBundleConfigurationProperties(
                        model.getFlatFileBundleConfigurationProperties());
            }
            if (model.wasPropertyExplicitlySet("threeLeggedOAuthCredential")) {
                this.threeLeggedOAuthCredential(model.getThreeLeggedOAuthCredential());
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
     * If true, the accounts of the application are managed through an ICF connector bundle
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connected")
    private final Boolean connected;

    /**
     * If true, the accounts of the application are managed through an ICF connector bundle
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getConnected() {
        return connected;
    }

    /**
     * If true, the managed app can be authoritative.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canBeAuthoritative")
    private final Boolean canBeAuthoritative;

    /**
     * If true, the managed app can be authoritative.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getCanBeAuthoritative() {
        return canBeAuthoritative;
    }

    /**
     * If true, sync from the managed app will be performed as authoritative sync.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAuthoritative")
    private final Boolean isAuthoritative;

    /**
     * If true, sync from the managed app will be performed as authoritative sync.
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getIsAuthoritative() {
        return isAuthoritative;
    }

    /**
     * If true, the managed app is an On-Premise app.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOnPremiseApp")
    private final Boolean isOnPremiseApp;

    /**
     * If true, the managed app is an On-Premise app.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsOnPremiseApp() {
        return isOnPremiseApp;
    }

    /**
     * If true, the managed app is a directory.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDirectory")
    private final Boolean isDirectory;

    /**
     * If true, the managed app is a directory.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsDirectory() {
        return isDirectory;
    }

    /**
     * If true, the managed app supports schema discovery.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSchemaDiscoverySupported")
    private final Boolean isSchemaDiscoverySupported;

    /**
     * If true, the managed app supports schema discovery.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsSchemaDiscoverySupported() {
        return isSchemaDiscoverySupported;
    }

    /**
     * If true, the managed app supports schema customization.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSchemaCustomizationSupported")
    private final Boolean isSchemaCustomizationSupported;

    /**
     * If true, the managed app supports schema customization.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsSchemaCustomizationSupported() {
        return isSchemaCustomizationSupported;
    }

    /**
     * If true, sync run-time operations are enabled for this App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableSync")
    private final Boolean enableSync;

    /**
     * If true, sync run-time operations are enabled for this App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getEnableSync() {
        return enableSync;
    }

    /**
     * If true, send sync summary as notification upon job completion.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableSyncSummaryReportNotification")
    private final Boolean enableSyncSummaryReportNotification;

    /**
     * If true, send sync summary as notification upon job completion.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getEnableSyncSummaryReportNotification() {
        return enableSyncSummaryReportNotification;
    }

    /**
     * If true, send activation email to new users created from authoritative sync.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableAuthSyncNewUserNotification")
    private final Boolean enableAuthSyncNewUserNotification;

    /**
     * If true, send activation email to new users created from authoritative sync.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getEnableAuthSyncNewUserNotification() {
        return enableAuthSyncNewUserNotification;
    }

    /**
     * If true, admin has granted consent to perform managed app run-time operations.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminConsentGranted")
    private final Boolean adminConsentGranted;

    /**
     * If true, admin has granted consent to perform managed app run-time operations.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getAdminConsentGranted() {
        return adminConsentGranted;
    }

    /**
     * If true, the managed app requires 3-legged OAuth for authorization.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isThreeLeggedOAuthEnabled")
    private final Boolean isThreeLeggedOAuthEnabled;

    /**
     * If true, the managed app requires 3-legged OAuth for authorization.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsThreeLeggedOAuthEnabled() {
        return isThreeLeggedOAuthEnabled;
    }

    /**
     * If true, indicates that Oracle Identity Cloud Service can use two-legged OAuth to connect to
     * this ManagedApp.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isTwoLeggedOAuthEnabled")
    private final Boolean isTwoLeggedOAuthEnabled;

    /**
     * If true, indicates that Oracle Identity Cloud Service can use two-legged OAuth to connect to
     * this ManagedApp.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsTwoLeggedOAuthEnabled() {
        return isTwoLeggedOAuthEnabled;
    }

    /**
     * Three legged OAuth provider name in Oracle Identity Cloud Service.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threeLeggedOAuthProviderName")
    private final String threeLeggedOAuthProviderName;

    /**
     * Three legged OAuth provider name in Oracle Identity Cloud Service.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getThreeLeggedOAuthProviderName() {
        return threeLeggedOAuthProviderName;
    }

    /**
     * The most recent DateTime that the configuration of this App was updated. AppServices updates
     * this timestamp whenever AppServices updates an App's configuration with respect to
     * synchronization.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: dateTime - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncConfigLastModified")
    private final String syncConfigLastModified;

    /**
     * The most recent DateTime that the configuration of this App was updated. AppServices updates
     * this timestamp whenever AppServices updates an App's configuration with respect to
     * synchronization.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: dateTime - uniqueness:
     * none
     *
     * @return the value
     */
    public String getSyncConfigLastModified() {
        return syncConfigLastModified;
    }

    /**
     * If true, then the account form will be displayed in the Oracle Identity Cloud Service UI to
     * interactively create or update an account for this App. If a value is not specified for this
     * attribute, a default value of \\"false\\" will be assumed as the value for this attribute.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountFormVisible")
    private final Boolean accountFormVisible;

    /**
     * If true, then the account form will be displayed in the Oracle Identity Cloud Service UI to
     * interactively create or update an account for this App. If a value is not specified for this
     * attribute, a default value of \\"false\\" will be assumed as the value for this attribute.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAccountFormVisible() {
        return accountFormVisible;
    }

    /**
     * IdentityBridges associated with this App
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityBridges")
    private final java.util.List<AppIdentityBridges> identityBridges;

    /**
     * IdentityBridges associated with this App
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppIdentityBridges> getIdentityBridges() {
        return identityBridges;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectorBundle")
    private final AppConnectorBundle connectorBundle;

    public AppConnectorBundle getConnectorBundle() {
        return connectorBundle;
    }

    /**
     * ConnectorBundle configuration properties
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: default - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bundleConfigurationProperties")
    private final java.util.List<AppBundleConfigurationProperties> bundleConfigurationProperties;

    /**
     * ConnectorBundle configuration properties
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: default - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppBundleConfigurationProperties> getBundleConfigurationProperties() {
        return bundleConfigurationProperties;
    }

    /**
     * Object classes
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: default - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectClasses")
    private final java.util.List<AppObjectClasses> objectClasses;

    /**
     * Object classes
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: default - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppObjectClasses> getObjectClasses() {
        return objectClasses;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bundlePoolConfiguration")
    private final AppBundlePoolConfiguration bundlePoolConfiguration;

    public AppBundlePoolConfiguration getBundlePoolConfiguration() {
        return bundlePoolConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("flatFileConnectorBundle")
    private final AppFlatFileConnectorBundle flatFileConnectorBundle;

    public AppFlatFileConnectorBundle getFlatFileConnectorBundle() {
        return flatFileConnectorBundle;
    }

    /**
     * Flat file connector bundle configuration properties
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: default - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flatFileBundleConfigurationProperties")
    private final java.util.List<AppFlatFileBundleConfigurationProperties>
            flatFileBundleConfigurationProperties;

    /**
     * Flat file connector bundle configuration properties
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: default - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppFlatFileBundleConfigurationProperties>
            getFlatFileBundleConfigurationProperties() {
        return flatFileBundleConfigurationProperties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("threeLeggedOAuthCredential")
    private final AppThreeLeggedOAuthCredential threeLeggedOAuthCredential;

    public AppThreeLeggedOAuthCredential getThreeLeggedOAuthCredential() {
        return threeLeggedOAuthCredential;
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
        sb.append("AppExtensionManagedappApp(");
        sb.append("super=").append(super.toString());
        sb.append("connected=").append(String.valueOf(this.connected));
        sb.append(", canBeAuthoritative=").append(String.valueOf(this.canBeAuthoritative));
        sb.append(", isAuthoritative=").append(String.valueOf(this.isAuthoritative));
        sb.append(", isOnPremiseApp=").append(String.valueOf(this.isOnPremiseApp));
        sb.append(", isDirectory=").append(String.valueOf(this.isDirectory));
        sb.append(", isSchemaDiscoverySupported=")
                .append(String.valueOf(this.isSchemaDiscoverySupported));
        sb.append(", isSchemaCustomizationSupported=")
                .append(String.valueOf(this.isSchemaCustomizationSupported));
        sb.append(", enableSync=").append(String.valueOf(this.enableSync));
        sb.append(", enableSyncSummaryReportNotification=")
                .append(String.valueOf(this.enableSyncSummaryReportNotification));
        sb.append(", enableAuthSyncNewUserNotification=")
                .append(String.valueOf(this.enableAuthSyncNewUserNotification));
        sb.append(", adminConsentGranted=").append(String.valueOf(this.adminConsentGranted));
        sb.append(", isThreeLeggedOAuthEnabled=")
                .append(String.valueOf(this.isThreeLeggedOAuthEnabled));
        sb.append(", isTwoLeggedOAuthEnabled=")
                .append(String.valueOf(this.isTwoLeggedOAuthEnabled));
        sb.append(", threeLeggedOAuthProviderName=")
                .append(String.valueOf(this.threeLeggedOAuthProviderName));
        sb.append(", syncConfigLastModified=").append(String.valueOf(this.syncConfigLastModified));
        sb.append(", accountFormVisible=").append(String.valueOf(this.accountFormVisible));
        sb.append(", identityBridges=").append(String.valueOf(this.identityBridges));
        sb.append(", connectorBundle=").append(String.valueOf(this.connectorBundle));
        sb.append(", bundleConfigurationProperties=")
                .append(String.valueOf(this.bundleConfigurationProperties));
        sb.append(", objectClasses=").append(String.valueOf(this.objectClasses));
        sb.append(", bundlePoolConfiguration=")
                .append(String.valueOf(this.bundlePoolConfiguration));
        sb.append(", flatFileConnectorBundle=")
                .append(String.valueOf(this.flatFileConnectorBundle));
        sb.append(", flatFileBundleConfigurationProperties=")
                .append(String.valueOf(this.flatFileBundleConfigurationProperties));
        sb.append(", threeLeggedOAuthCredential=")
                .append(String.valueOf(this.threeLeggedOAuthCredential));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionManagedappApp)) {
            return false;
        }

        AppExtensionManagedappApp other = (AppExtensionManagedappApp) o;
        return java.util.Objects.equals(this.connected, other.connected)
                && java.util.Objects.equals(this.canBeAuthoritative, other.canBeAuthoritative)
                && java.util.Objects.equals(this.isAuthoritative, other.isAuthoritative)
                && java.util.Objects.equals(this.isOnPremiseApp, other.isOnPremiseApp)
                && java.util.Objects.equals(this.isDirectory, other.isDirectory)
                && java.util.Objects.equals(
                        this.isSchemaDiscoverySupported, other.isSchemaDiscoverySupported)
                && java.util.Objects.equals(
                        this.isSchemaCustomizationSupported, other.isSchemaCustomizationSupported)
                && java.util.Objects.equals(this.enableSync, other.enableSync)
                && java.util.Objects.equals(
                        this.enableSyncSummaryReportNotification,
                        other.enableSyncSummaryReportNotification)
                && java.util.Objects.equals(
                        this.enableAuthSyncNewUserNotification,
                        other.enableAuthSyncNewUserNotification)
                && java.util.Objects.equals(this.adminConsentGranted, other.adminConsentGranted)
                && java.util.Objects.equals(
                        this.isThreeLeggedOAuthEnabled, other.isThreeLeggedOAuthEnabled)
                && java.util.Objects.equals(
                        this.isTwoLeggedOAuthEnabled, other.isTwoLeggedOAuthEnabled)
                && java.util.Objects.equals(
                        this.threeLeggedOAuthProviderName, other.threeLeggedOAuthProviderName)
                && java.util.Objects.equals(
                        this.syncConfigLastModified, other.syncConfigLastModified)
                && java.util.Objects.equals(this.accountFormVisible, other.accountFormVisible)
                && java.util.Objects.equals(this.identityBridges, other.identityBridges)
                && java.util.Objects.equals(this.connectorBundle, other.connectorBundle)
                && java.util.Objects.equals(
                        this.bundleConfigurationProperties, other.bundleConfigurationProperties)
                && java.util.Objects.equals(this.objectClasses, other.objectClasses)
                && java.util.Objects.equals(
                        this.bundlePoolConfiguration, other.bundlePoolConfiguration)
                && java.util.Objects.equals(
                        this.flatFileConnectorBundle, other.flatFileConnectorBundle)
                && java.util.Objects.equals(
                        this.flatFileBundleConfigurationProperties,
                        other.flatFileBundleConfigurationProperties)
                && java.util.Objects.equals(
                        this.threeLeggedOAuthCredential, other.threeLeggedOAuthCredential)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.connected == null ? 43 : this.connected.hashCode());
        result =
                (result * PRIME)
                        + (this.canBeAuthoritative == null
                                ? 43
                                : this.canBeAuthoritative.hashCode());
        result =
                (result * PRIME)
                        + (this.isAuthoritative == null ? 43 : this.isAuthoritative.hashCode());
        result =
                (result * PRIME)
                        + (this.isOnPremiseApp == null ? 43 : this.isOnPremiseApp.hashCode());
        result = (result * PRIME) + (this.isDirectory == null ? 43 : this.isDirectory.hashCode());
        result =
                (result * PRIME)
                        + (this.isSchemaDiscoverySupported == null
                                ? 43
                                : this.isSchemaDiscoverySupported.hashCode());
        result =
                (result * PRIME)
                        + (this.isSchemaCustomizationSupported == null
                                ? 43
                                : this.isSchemaCustomizationSupported.hashCode());
        result = (result * PRIME) + (this.enableSync == null ? 43 : this.enableSync.hashCode());
        result =
                (result * PRIME)
                        + (this.enableSyncSummaryReportNotification == null
                                ? 43
                                : this.enableSyncSummaryReportNotification.hashCode());
        result =
                (result * PRIME)
                        + (this.enableAuthSyncNewUserNotification == null
                                ? 43
                                : this.enableAuthSyncNewUserNotification.hashCode());
        result =
                (result * PRIME)
                        + (this.adminConsentGranted == null
                                ? 43
                                : this.adminConsentGranted.hashCode());
        result =
                (result * PRIME)
                        + (this.isThreeLeggedOAuthEnabled == null
                                ? 43
                                : this.isThreeLeggedOAuthEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isTwoLeggedOAuthEnabled == null
                                ? 43
                                : this.isTwoLeggedOAuthEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.threeLeggedOAuthProviderName == null
                                ? 43
                                : this.threeLeggedOAuthProviderName.hashCode());
        result =
                (result * PRIME)
                        + (this.syncConfigLastModified == null
                                ? 43
                                : this.syncConfigLastModified.hashCode());
        result =
                (result * PRIME)
                        + (this.accountFormVisible == null
                                ? 43
                                : this.accountFormVisible.hashCode());
        result =
                (result * PRIME)
                        + (this.identityBridges == null ? 43 : this.identityBridges.hashCode());
        result =
                (result * PRIME)
                        + (this.connectorBundle == null ? 43 : this.connectorBundle.hashCode());
        result =
                (result * PRIME)
                        + (this.bundleConfigurationProperties == null
                                ? 43
                                : this.bundleConfigurationProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.objectClasses == null ? 43 : this.objectClasses.hashCode());
        result =
                (result * PRIME)
                        + (this.bundlePoolConfiguration == null
                                ? 43
                                : this.bundlePoolConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.flatFileConnectorBundle == null
                                ? 43
                                : this.flatFileConnectorBundle.hashCode());
        result =
                (result * PRIME)
                        + (this.flatFileBundleConfigurationProperties == null
                                ? 43
                                : this.flatFileBundleConfigurationProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.threeLeggedOAuthCredential == null
                                ? 43
                                : this.threeLeggedOAuthCredential.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
