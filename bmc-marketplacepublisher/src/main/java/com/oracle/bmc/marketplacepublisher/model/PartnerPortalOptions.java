/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Partner Portal Options.
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
    builder = PartnerPortalOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PartnerPortalOptions extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnablePublisherAgreementCheckBeforeListingPublish",
        "isEnableOpnMembershipStatusCheckBeforeListingPublish",
        "isEnableReports",
        "isEnablePrivateListing",
        "isEnableAutoPublishOnSubmitForLeadGenListings",
        "isDisableAutoPublishOnSubmit",
        "isEnableAutoApprovalForImageArtifactNewAppListings",
        "isEnableAutoApprovalForTerraformArtifactNewAppListings",
        "isEnableAutoApprovalForNewPaidAppListings",
        "isEnableAutoApprovalForNewLeadGenListings",
        "isDisableAutoApprovalForImageArtifactVersionedAppListings",
        "isDisableAutoApprovalForTerraformArtifactVersionedAppListings",
        "isDisableAutoApprovalForContainerArtifactVersionedAppListings",
        "isDisableAutoApprovalForHelmChartVersionedAppListings",
        "isEnableAutoApprovalForServiceVersionedListings",
        "isEnableAutoApprovalForFusionAiAgentVersionedListings",
        "isEnableAutoApprovalForLeadGenVersionedListings",
        "isDisableAutoApprovalForSaaSVersionedListings",
        "isDisableAutoApprovalForPaidAppVersionedListings"
    })
    public PartnerPortalOptions(
            Boolean isEnablePublisherAgreementCheckBeforeListingPublish,
            Boolean isEnableOpnMembershipStatusCheckBeforeListingPublish,
            Boolean isEnableReports,
            Boolean isEnablePrivateListing,
            Boolean isEnableAutoPublishOnSubmitForLeadGenListings,
            Boolean isDisableAutoPublishOnSubmit,
            Boolean isEnableAutoApprovalForImageArtifactNewAppListings,
            Boolean isEnableAutoApprovalForTerraformArtifactNewAppListings,
            Boolean isEnableAutoApprovalForNewPaidAppListings,
            Boolean isEnableAutoApprovalForNewLeadGenListings,
            Boolean isDisableAutoApprovalForImageArtifactVersionedAppListings,
            Boolean isDisableAutoApprovalForTerraformArtifactVersionedAppListings,
            Boolean isDisableAutoApprovalForContainerArtifactVersionedAppListings,
            Boolean isDisableAutoApprovalForHelmChartVersionedAppListings,
            Boolean isEnableAutoApprovalForServiceVersionedListings,
            Boolean isEnableAutoApprovalForFusionAiAgentVersionedListings,
            Boolean isEnableAutoApprovalForLeadGenVersionedListings,
            Boolean isDisableAutoApprovalForSaaSVersionedListings,
            Boolean isDisableAutoApprovalForPaidAppVersionedListings) {
        super();
        this.isEnablePublisherAgreementCheckBeforeListingPublish =
                isEnablePublisherAgreementCheckBeforeListingPublish;
        this.isEnableOpnMembershipStatusCheckBeforeListingPublish =
                isEnableOpnMembershipStatusCheckBeforeListingPublish;
        this.isEnableReports = isEnableReports;
        this.isEnablePrivateListing = isEnablePrivateListing;
        this.isEnableAutoPublishOnSubmitForLeadGenListings =
                isEnableAutoPublishOnSubmitForLeadGenListings;
        this.isDisableAutoPublishOnSubmit = isDisableAutoPublishOnSubmit;
        this.isEnableAutoApprovalForImageArtifactNewAppListings =
                isEnableAutoApprovalForImageArtifactNewAppListings;
        this.isEnableAutoApprovalForTerraformArtifactNewAppListings =
                isEnableAutoApprovalForTerraformArtifactNewAppListings;
        this.isEnableAutoApprovalForNewPaidAppListings = isEnableAutoApprovalForNewPaidAppListings;
        this.isEnableAutoApprovalForNewLeadGenListings = isEnableAutoApprovalForNewLeadGenListings;
        this.isDisableAutoApprovalForImageArtifactVersionedAppListings =
                isDisableAutoApprovalForImageArtifactVersionedAppListings;
        this.isDisableAutoApprovalForTerraformArtifactVersionedAppListings =
                isDisableAutoApprovalForTerraformArtifactVersionedAppListings;
        this.isDisableAutoApprovalForContainerArtifactVersionedAppListings =
                isDisableAutoApprovalForContainerArtifactVersionedAppListings;
        this.isDisableAutoApprovalForHelmChartVersionedAppListings =
                isDisableAutoApprovalForHelmChartVersionedAppListings;
        this.isEnableAutoApprovalForServiceVersionedListings =
                isEnableAutoApprovalForServiceVersionedListings;
        this.isEnableAutoApprovalForFusionAiAgentVersionedListings =
                isEnableAutoApprovalForFusionAiAgentVersionedListings;
        this.isEnableAutoApprovalForLeadGenVersionedListings =
                isEnableAutoApprovalForLeadGenVersionedListings;
        this.isDisableAutoApprovalForSaaSVersionedListings =
                isDisableAutoApprovalForSaaSVersionedListings;
        this.isDisableAutoApprovalForPaidAppVersionedListings =
                isDisableAutoApprovalForPaidAppVersionedListings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enable Oracle Cloud Marketplace Publisher Agreement validity check for partner before listing is published.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isEnablePublisherAgreementCheckBeforeListingPublish")
        private Boolean isEnablePublisherAgreementCheckBeforeListingPublish;

        /**
         * Enable Oracle Cloud Marketplace Publisher Agreement validity check for partner before listing is published.
         * @param isEnablePublisherAgreementCheckBeforeListingPublish the value to set
         * @return this builder
         **/
        public Builder isEnablePublisherAgreementCheckBeforeListingPublish(
                Boolean isEnablePublisherAgreementCheckBeforeListingPublish) {
            this.isEnablePublisherAgreementCheckBeforeListingPublish =
                    isEnablePublisherAgreementCheckBeforeListingPublish;
            this.__explicitlySet__.add("isEnablePublisherAgreementCheckBeforeListingPublish");
            return this;
        }
        /**
         * Enable OPN membership status check for partner before listing is published.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isEnableOpnMembershipStatusCheckBeforeListingPublish")
        private Boolean isEnableOpnMembershipStatusCheckBeforeListingPublish;

        /**
         * Enable OPN membership status check for partner before listing is published.
         * @param isEnableOpnMembershipStatusCheckBeforeListingPublish the value to set
         * @return this builder
         **/
        public Builder isEnableOpnMembershipStatusCheckBeforeListingPublish(
                Boolean isEnableOpnMembershipStatusCheckBeforeListingPublish) {
            this.isEnableOpnMembershipStatusCheckBeforeListingPublish =
                    isEnableOpnMembershipStatusCheckBeforeListingPublish;
            this.__explicitlySet__.add("isEnableOpnMembershipStatusCheckBeforeListingPublish");
            return this;
        }
        /**
         * Enable the Reports feature for this Partner.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnableReports")
        private Boolean isEnableReports;

        /**
         * Enable the Reports feature for this Partner.
         * @param isEnableReports the value to set
         * @return this builder
         **/
        public Builder isEnableReports(Boolean isEnableReports) {
            this.isEnableReports = isEnableReports;
            this.__explicitlySet__.add("isEnableReports");
            return this;
        }
        /**
         * Enable the private listing feature for this Partner.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnablePrivateListing")
        private Boolean isEnablePrivateListing;

        /**
         * Enable the private listing feature for this Partner.
         * @param isEnablePrivateListing the value to set
         * @return this builder
         **/
        public Builder isEnablePrivateListing(Boolean isEnablePrivateListing) {
            this.isEnablePrivateListing = isEnablePrivateListing;
            this.__explicitlySet__.add("isEnablePrivateListing");
            return this;
        }
        /**
         * Enable Auto-publish on listing submit for this partner for Lead generation listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isEnableAutoPublishOnSubmitForLeadGenListings")
        private Boolean isEnableAutoPublishOnSubmitForLeadGenListings;

        /**
         * Enable Auto-publish on listing submit for this partner for Lead generation listings.
         * @param isEnableAutoPublishOnSubmitForLeadGenListings the value to set
         * @return this builder
         **/
        public Builder isEnableAutoPublishOnSubmitForLeadGenListings(
                Boolean isEnableAutoPublishOnSubmitForLeadGenListings) {
            this.isEnableAutoPublishOnSubmitForLeadGenListings =
                    isEnableAutoPublishOnSubmitForLeadGenListings;
            this.__explicitlySet__.add("isEnableAutoPublishOnSubmitForLeadGenListings");
            return this;
        }
        /**
         * Disable Auto-publish option visibility for listing submit flow. Defaults to false when unset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDisableAutoPublishOnSubmit")
        private Boolean isDisableAutoPublishOnSubmit;

        /**
         * Disable Auto-publish option visibility for listing submit flow. Defaults to false when unset.
         * @param isDisableAutoPublishOnSubmit the value to set
         * @return this builder
         **/
        public Builder isDisableAutoPublishOnSubmit(Boolean isDisableAutoPublishOnSubmit) {
            this.isDisableAutoPublishOnSubmit = isDisableAutoPublishOnSubmit;
            this.__explicitlySet__.add("isDisableAutoPublishOnSubmit");
            return this;
        }
        /**
         * Enable Auto approval options for new listings - Include OCI Application listings with Image artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isEnableAutoApprovalForImageArtifactNewAppListings")
        private Boolean isEnableAutoApprovalForImageArtifactNewAppListings;

        /**
         * Enable Auto approval options for new listings - Include OCI Application listings with Image artifact.
         * @param isEnableAutoApprovalForImageArtifactNewAppListings the value to set
         * @return this builder
         **/
        public Builder isEnableAutoApprovalForImageArtifactNewAppListings(
                Boolean isEnableAutoApprovalForImageArtifactNewAppListings) {
            this.isEnableAutoApprovalForImageArtifactNewAppListings =
                    isEnableAutoApprovalForImageArtifactNewAppListings;
            this.__explicitlySet__.add("isEnableAutoApprovalForImageArtifactNewAppListings");
            return this;
        }
        /**
         * Enable Auto approval options for new listings - Include OCI Application listings with Terraform artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isEnableAutoApprovalForTerraformArtifactNewAppListings")
        private Boolean isEnableAutoApprovalForTerraformArtifactNewAppListings;

        /**
         * Enable Auto approval options for new listings - Include OCI Application listings with Terraform artifact.
         * @param isEnableAutoApprovalForTerraformArtifactNewAppListings the value to set
         * @return this builder
         **/
        public Builder isEnableAutoApprovalForTerraformArtifactNewAppListings(
                Boolean isEnableAutoApprovalForTerraformArtifactNewAppListings) {
            this.isEnableAutoApprovalForTerraformArtifactNewAppListings =
                    isEnableAutoApprovalForTerraformArtifactNewAppListings;
            this.__explicitlySet__.add("isEnableAutoApprovalForTerraformArtifactNewAppListings");
            return this;
        }
        /**
         * Enable Auto approval options for new listings - Include OCI Paid Application listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnableAutoApprovalForNewPaidAppListings")
        private Boolean isEnableAutoApprovalForNewPaidAppListings;

        /**
         * Enable Auto approval options for new listings - Include OCI Paid Application listings.
         * @param isEnableAutoApprovalForNewPaidAppListings the value to set
         * @return this builder
         **/
        public Builder isEnableAutoApprovalForNewPaidAppListings(
                Boolean isEnableAutoApprovalForNewPaidAppListings) {
            this.isEnableAutoApprovalForNewPaidAppListings =
                    isEnableAutoApprovalForNewPaidAppListings;
            this.__explicitlySet__.add("isEnableAutoApprovalForNewPaidAppListings");
            return this;
        }
        /**
         * Enable Auto approval options for new listings - Include Lead generation listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnableAutoApprovalForNewLeadGenListings")
        private Boolean isEnableAutoApprovalForNewLeadGenListings;

        /**
         * Enable Auto approval options for new listings - Include Lead generation listings.
         * @param isEnableAutoApprovalForNewLeadGenListings the value to set
         * @return this builder
         **/
        public Builder isEnableAutoApprovalForNewLeadGenListings(
                Boolean isEnableAutoApprovalForNewLeadGenListings) {
            this.isEnableAutoApprovalForNewLeadGenListings =
                    isEnableAutoApprovalForNewLeadGenListings;
            this.__explicitlySet__.add("isEnableAutoApprovalForNewLeadGenListings");
            return this;
        }
        /**
         * Disable Auto approval options for versioned listings - Include OCI Application listings with Image artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isDisableAutoApprovalForImageArtifactVersionedAppListings")
        private Boolean isDisableAutoApprovalForImageArtifactVersionedAppListings;

        /**
         * Disable Auto approval options for versioned listings - Include OCI Application listings with Image artifact.
         * @param isDisableAutoApprovalForImageArtifactVersionedAppListings the value to set
         * @return this builder
         **/
        public Builder isDisableAutoApprovalForImageArtifactVersionedAppListings(
                Boolean isDisableAutoApprovalForImageArtifactVersionedAppListings) {
            this.isDisableAutoApprovalForImageArtifactVersionedAppListings =
                    isDisableAutoApprovalForImageArtifactVersionedAppListings;
            this.__explicitlySet__.add("isDisableAutoApprovalForImageArtifactVersionedAppListings");
            return this;
        }
        /**
         * Disable Auto approval options for versioned listings - Include OCI Application listings with Terraform artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isDisableAutoApprovalForTerraformArtifactVersionedAppListings")
        private Boolean isDisableAutoApprovalForTerraformArtifactVersionedAppListings;

        /**
         * Disable Auto approval options for versioned listings - Include OCI Application listings with Terraform artifact.
         * @param isDisableAutoApprovalForTerraformArtifactVersionedAppListings the value to set
         * @return this builder
         **/
        public Builder isDisableAutoApprovalForTerraformArtifactVersionedAppListings(
                Boolean isDisableAutoApprovalForTerraformArtifactVersionedAppListings) {
            this.isDisableAutoApprovalForTerraformArtifactVersionedAppListings =
                    isDisableAutoApprovalForTerraformArtifactVersionedAppListings;
            this.__explicitlySet__.add(
                    "isDisableAutoApprovalForTerraformArtifactVersionedAppListings");
            return this;
        }
        /**
         * Disable Auto approval options for versioned listings - Include OCI Application listings with Container artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isDisableAutoApprovalForContainerArtifactVersionedAppListings")
        private Boolean isDisableAutoApprovalForContainerArtifactVersionedAppListings;

        /**
         * Disable Auto approval options for versioned listings - Include OCI Application listings with Container artifact.
         * @param isDisableAutoApprovalForContainerArtifactVersionedAppListings the value to set
         * @return this builder
         **/
        public Builder isDisableAutoApprovalForContainerArtifactVersionedAppListings(
                Boolean isDisableAutoApprovalForContainerArtifactVersionedAppListings) {
            this.isDisableAutoApprovalForContainerArtifactVersionedAppListings =
                    isDisableAutoApprovalForContainerArtifactVersionedAppListings;
            this.__explicitlySet__.add(
                    "isDisableAutoApprovalForContainerArtifactVersionedAppListings");
            return this;
        }
        /**
         * Disable Auto approval options for versioned listings - Include OCI Application listings with Helm chart artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isDisableAutoApprovalForHelmChartVersionedAppListings")
        private Boolean isDisableAutoApprovalForHelmChartVersionedAppListings;

        /**
         * Disable Auto approval options for versioned listings - Include OCI Application listings with Helm chart artifact.
         * @param isDisableAutoApprovalForHelmChartVersionedAppListings the value to set
         * @return this builder
         **/
        public Builder isDisableAutoApprovalForHelmChartVersionedAppListings(
                Boolean isDisableAutoApprovalForHelmChartVersionedAppListings) {
            this.isDisableAutoApprovalForHelmChartVersionedAppListings =
                    isDisableAutoApprovalForHelmChartVersionedAppListings;
            this.__explicitlySet__.add("isDisableAutoApprovalForHelmChartVersionedAppListings");
            return this;
        }
        /**
         * Enable Auto approval options for versioned listings - Include Service listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isEnableAutoApprovalForServiceVersionedListings")
        private Boolean isEnableAutoApprovalForServiceVersionedListings;

        /**
         * Enable Auto approval options for versioned listings - Include Service listings.
         * @param isEnableAutoApprovalForServiceVersionedListings the value to set
         * @return this builder
         **/
        public Builder isEnableAutoApprovalForServiceVersionedListings(
                Boolean isEnableAutoApprovalForServiceVersionedListings) {
            this.isEnableAutoApprovalForServiceVersionedListings =
                    isEnableAutoApprovalForServiceVersionedListings;
            this.__explicitlySet__.add("isEnableAutoApprovalForServiceVersionedListings");
            return this;
        }
        /**
         * Enable Auto approval options for versioned listings - Include Fusion AiAgent listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isEnableAutoApprovalForFusionAiAgentVersionedListings")
        private Boolean isEnableAutoApprovalForFusionAiAgentVersionedListings;

        /**
         * Enable Auto approval options for versioned listings - Include Fusion AiAgent listings.
         * @param isEnableAutoApprovalForFusionAiAgentVersionedListings the value to set
         * @return this builder
         **/
        public Builder isEnableAutoApprovalForFusionAiAgentVersionedListings(
                Boolean isEnableAutoApprovalForFusionAiAgentVersionedListings) {
            this.isEnableAutoApprovalForFusionAiAgentVersionedListings =
                    isEnableAutoApprovalForFusionAiAgentVersionedListings;
            this.__explicitlySet__.add("isEnableAutoApprovalForFusionAiAgentVersionedListings");
            return this;
        }
        /**
         * Enable Auto approval options for versioned listings - Include Lead generation listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isEnableAutoApprovalForLeadGenVersionedListings")
        private Boolean isEnableAutoApprovalForLeadGenVersionedListings;

        /**
         * Enable Auto approval options for versioned listings - Include Lead generation listings.
         * @param isEnableAutoApprovalForLeadGenVersionedListings the value to set
         * @return this builder
         **/
        public Builder isEnableAutoApprovalForLeadGenVersionedListings(
                Boolean isEnableAutoApprovalForLeadGenVersionedListings) {
            this.isEnableAutoApprovalForLeadGenVersionedListings =
                    isEnableAutoApprovalForLeadGenVersionedListings;
            this.__explicitlySet__.add("isEnableAutoApprovalForLeadGenVersionedListings");
            return this;
        }
        /**
         * Disable Auto approval options for versioned listings - Include SaaS listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isDisableAutoApprovalForSaaSVersionedListings")
        private Boolean isDisableAutoApprovalForSaaSVersionedListings;

        /**
         * Disable Auto approval options for versioned listings - Include SaaS listings.
         * @param isDisableAutoApprovalForSaaSVersionedListings the value to set
         * @return this builder
         **/
        public Builder isDisableAutoApprovalForSaaSVersionedListings(
                Boolean isDisableAutoApprovalForSaaSVersionedListings) {
            this.isDisableAutoApprovalForSaaSVersionedListings =
                    isDisableAutoApprovalForSaaSVersionedListings;
            this.__explicitlySet__.add("isDisableAutoApprovalForSaaSVersionedListings");
            return this;
        }
        /**
         * Disable Auto approval options for versioned listings - Include Paid App listings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isDisableAutoApprovalForPaidAppVersionedListings")
        private Boolean isDisableAutoApprovalForPaidAppVersionedListings;

        /**
         * Disable Auto approval options for versioned listings - Include Paid App listings.
         * @param isDisableAutoApprovalForPaidAppVersionedListings the value to set
         * @return this builder
         **/
        public Builder isDisableAutoApprovalForPaidAppVersionedListings(
                Boolean isDisableAutoApprovalForPaidAppVersionedListings) {
            this.isDisableAutoApprovalForPaidAppVersionedListings =
                    isDisableAutoApprovalForPaidAppVersionedListings;
            this.__explicitlySet__.add("isDisableAutoApprovalForPaidAppVersionedListings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PartnerPortalOptions build() {
            PartnerPortalOptions model =
                    new PartnerPortalOptions(
                            this.isEnablePublisherAgreementCheckBeforeListingPublish,
                            this.isEnableOpnMembershipStatusCheckBeforeListingPublish,
                            this.isEnableReports,
                            this.isEnablePrivateListing,
                            this.isEnableAutoPublishOnSubmitForLeadGenListings,
                            this.isDisableAutoPublishOnSubmit,
                            this.isEnableAutoApprovalForImageArtifactNewAppListings,
                            this.isEnableAutoApprovalForTerraformArtifactNewAppListings,
                            this.isEnableAutoApprovalForNewPaidAppListings,
                            this.isEnableAutoApprovalForNewLeadGenListings,
                            this.isDisableAutoApprovalForImageArtifactVersionedAppListings,
                            this.isDisableAutoApprovalForTerraformArtifactVersionedAppListings,
                            this.isDisableAutoApprovalForContainerArtifactVersionedAppListings,
                            this.isDisableAutoApprovalForHelmChartVersionedAppListings,
                            this.isEnableAutoApprovalForServiceVersionedListings,
                            this.isEnableAutoApprovalForFusionAiAgentVersionedListings,
                            this.isEnableAutoApprovalForLeadGenVersionedListings,
                            this.isDisableAutoApprovalForSaaSVersionedListings,
                            this.isDisableAutoApprovalForPaidAppVersionedListings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PartnerPortalOptions model) {
            if (model.wasPropertyExplicitlySet(
                    "isEnablePublisherAgreementCheckBeforeListingPublish")) {
                this.isEnablePublisherAgreementCheckBeforeListingPublish(
                        model.getIsEnablePublisherAgreementCheckBeforeListingPublish());
            }
            if (model.wasPropertyExplicitlySet(
                    "isEnableOpnMembershipStatusCheckBeforeListingPublish")) {
                this.isEnableOpnMembershipStatusCheckBeforeListingPublish(
                        model.getIsEnableOpnMembershipStatusCheckBeforeListingPublish());
            }
            if (model.wasPropertyExplicitlySet("isEnableReports")) {
                this.isEnableReports(model.getIsEnableReports());
            }
            if (model.wasPropertyExplicitlySet("isEnablePrivateListing")) {
                this.isEnablePrivateListing(model.getIsEnablePrivateListing());
            }
            if (model.wasPropertyExplicitlySet("isEnableAutoPublishOnSubmitForLeadGenListings")) {
                this.isEnableAutoPublishOnSubmitForLeadGenListings(
                        model.getIsEnableAutoPublishOnSubmitForLeadGenListings());
            }
            if (model.wasPropertyExplicitlySet("isDisableAutoPublishOnSubmit")) {
                this.isDisableAutoPublishOnSubmit(model.getIsDisableAutoPublishOnSubmit());
            }
            if (model.wasPropertyExplicitlySet(
                    "isEnableAutoApprovalForImageArtifactNewAppListings")) {
                this.isEnableAutoApprovalForImageArtifactNewAppListings(
                        model.getIsEnableAutoApprovalForImageArtifactNewAppListings());
            }
            if (model.wasPropertyExplicitlySet(
                    "isEnableAutoApprovalForTerraformArtifactNewAppListings")) {
                this.isEnableAutoApprovalForTerraformArtifactNewAppListings(
                        model.getIsEnableAutoApprovalForTerraformArtifactNewAppListings());
            }
            if (model.wasPropertyExplicitlySet("isEnableAutoApprovalForNewPaidAppListings")) {
                this.isEnableAutoApprovalForNewPaidAppListings(
                        model.getIsEnableAutoApprovalForNewPaidAppListings());
            }
            if (model.wasPropertyExplicitlySet("isEnableAutoApprovalForNewLeadGenListings")) {
                this.isEnableAutoApprovalForNewLeadGenListings(
                        model.getIsEnableAutoApprovalForNewLeadGenListings());
            }
            if (model.wasPropertyExplicitlySet(
                    "isDisableAutoApprovalForImageArtifactVersionedAppListings")) {
                this.isDisableAutoApprovalForImageArtifactVersionedAppListings(
                        model.getIsDisableAutoApprovalForImageArtifactVersionedAppListings());
            }
            if (model.wasPropertyExplicitlySet(
                    "isDisableAutoApprovalForTerraformArtifactVersionedAppListings")) {
                this.isDisableAutoApprovalForTerraformArtifactVersionedAppListings(
                        model.getIsDisableAutoApprovalForTerraformArtifactVersionedAppListings());
            }
            if (model.wasPropertyExplicitlySet(
                    "isDisableAutoApprovalForContainerArtifactVersionedAppListings")) {
                this.isDisableAutoApprovalForContainerArtifactVersionedAppListings(
                        model.getIsDisableAutoApprovalForContainerArtifactVersionedAppListings());
            }
            if (model.wasPropertyExplicitlySet(
                    "isDisableAutoApprovalForHelmChartVersionedAppListings")) {
                this.isDisableAutoApprovalForHelmChartVersionedAppListings(
                        model.getIsDisableAutoApprovalForHelmChartVersionedAppListings());
            }
            if (model.wasPropertyExplicitlySet("isEnableAutoApprovalForServiceVersionedListings")) {
                this.isEnableAutoApprovalForServiceVersionedListings(
                        model.getIsEnableAutoApprovalForServiceVersionedListings());
            }
            if (model.wasPropertyExplicitlySet(
                    "isEnableAutoApprovalForFusionAiAgentVersionedListings")) {
                this.isEnableAutoApprovalForFusionAiAgentVersionedListings(
                        model.getIsEnableAutoApprovalForFusionAiAgentVersionedListings());
            }
            if (model.wasPropertyExplicitlySet("isEnableAutoApprovalForLeadGenVersionedListings")) {
                this.isEnableAutoApprovalForLeadGenVersionedListings(
                        model.getIsEnableAutoApprovalForLeadGenVersionedListings());
            }
            if (model.wasPropertyExplicitlySet("isDisableAutoApprovalForSaaSVersionedListings")) {
                this.isDisableAutoApprovalForSaaSVersionedListings(
                        model.getIsDisableAutoApprovalForSaaSVersionedListings());
            }
            if (model.wasPropertyExplicitlySet(
                    "isDisableAutoApprovalForPaidAppVersionedListings")) {
                this.isDisableAutoApprovalForPaidAppVersionedListings(
                        model.getIsDisableAutoApprovalForPaidAppVersionedListings());
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
     * Enable Oracle Cloud Marketplace Publisher Agreement validity check for partner before listing is published.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isEnablePublisherAgreementCheckBeforeListingPublish")
    private final Boolean isEnablePublisherAgreementCheckBeforeListingPublish;

    /**
     * Enable Oracle Cloud Marketplace Publisher Agreement validity check for partner before listing is published.
     * @return the value
     **/
    public Boolean getIsEnablePublisherAgreementCheckBeforeListingPublish() {
        return isEnablePublisherAgreementCheckBeforeListingPublish;
    }

    /**
     * Enable OPN membership status check for partner before listing is published.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isEnableOpnMembershipStatusCheckBeforeListingPublish")
    private final Boolean isEnableOpnMembershipStatusCheckBeforeListingPublish;

    /**
     * Enable OPN membership status check for partner before listing is published.
     * @return the value
     **/
    public Boolean getIsEnableOpnMembershipStatusCheckBeforeListingPublish() {
        return isEnableOpnMembershipStatusCheckBeforeListingPublish;
    }

    /**
     * Enable the Reports feature for this Partner.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnableReports")
    private final Boolean isEnableReports;

    /**
     * Enable the Reports feature for this Partner.
     * @return the value
     **/
    public Boolean getIsEnableReports() {
        return isEnableReports;
    }

    /**
     * Enable the private listing feature for this Partner.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnablePrivateListing")
    private final Boolean isEnablePrivateListing;

    /**
     * Enable the private listing feature for this Partner.
     * @return the value
     **/
    public Boolean getIsEnablePrivateListing() {
        return isEnablePrivateListing;
    }

    /**
     * Enable Auto-publish on listing submit for this partner for Lead generation listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnableAutoPublishOnSubmitForLeadGenListings")
    private final Boolean isEnableAutoPublishOnSubmitForLeadGenListings;

    /**
     * Enable Auto-publish on listing submit for this partner for Lead generation listings.
     * @return the value
     **/
    public Boolean getIsEnableAutoPublishOnSubmitForLeadGenListings() {
        return isEnableAutoPublishOnSubmitForLeadGenListings;
    }

    /**
     * Disable Auto-publish option visibility for listing submit flow. Defaults to false when unset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisableAutoPublishOnSubmit")
    private final Boolean isDisableAutoPublishOnSubmit;

    /**
     * Disable Auto-publish option visibility for listing submit flow. Defaults to false when unset.
     * @return the value
     **/
    public Boolean getIsDisableAutoPublishOnSubmit() {
        return isDisableAutoPublishOnSubmit;
    }

    /**
     * Enable Auto approval options for new listings - Include OCI Application listings with Image artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isEnableAutoApprovalForImageArtifactNewAppListings")
    private final Boolean isEnableAutoApprovalForImageArtifactNewAppListings;

    /**
     * Enable Auto approval options for new listings - Include OCI Application listings with Image artifact.
     * @return the value
     **/
    public Boolean getIsEnableAutoApprovalForImageArtifactNewAppListings() {
        return isEnableAutoApprovalForImageArtifactNewAppListings;
    }

    /**
     * Enable Auto approval options for new listings - Include OCI Application listings with Terraform artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isEnableAutoApprovalForTerraformArtifactNewAppListings")
    private final Boolean isEnableAutoApprovalForTerraformArtifactNewAppListings;

    /**
     * Enable Auto approval options for new listings - Include OCI Application listings with Terraform artifact.
     * @return the value
     **/
    public Boolean getIsEnableAutoApprovalForTerraformArtifactNewAppListings() {
        return isEnableAutoApprovalForTerraformArtifactNewAppListings;
    }

    /**
     * Enable Auto approval options for new listings - Include OCI Paid Application listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnableAutoApprovalForNewPaidAppListings")
    private final Boolean isEnableAutoApprovalForNewPaidAppListings;

    /**
     * Enable Auto approval options for new listings - Include OCI Paid Application listings.
     * @return the value
     **/
    public Boolean getIsEnableAutoApprovalForNewPaidAppListings() {
        return isEnableAutoApprovalForNewPaidAppListings;
    }

    /**
     * Enable Auto approval options for new listings - Include Lead generation listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnableAutoApprovalForNewLeadGenListings")
    private final Boolean isEnableAutoApprovalForNewLeadGenListings;

    /**
     * Enable Auto approval options for new listings - Include Lead generation listings.
     * @return the value
     **/
    public Boolean getIsEnableAutoApprovalForNewLeadGenListings() {
        return isEnableAutoApprovalForNewLeadGenListings;
    }

    /**
     * Disable Auto approval options for versioned listings - Include OCI Application listings with Image artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isDisableAutoApprovalForImageArtifactVersionedAppListings")
    private final Boolean isDisableAutoApprovalForImageArtifactVersionedAppListings;

    /**
     * Disable Auto approval options for versioned listings - Include OCI Application listings with Image artifact.
     * @return the value
     **/
    public Boolean getIsDisableAutoApprovalForImageArtifactVersionedAppListings() {
        return isDisableAutoApprovalForImageArtifactVersionedAppListings;
    }

    /**
     * Disable Auto approval options for versioned listings - Include OCI Application listings with Terraform artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isDisableAutoApprovalForTerraformArtifactVersionedAppListings")
    private final Boolean isDisableAutoApprovalForTerraformArtifactVersionedAppListings;

    /**
     * Disable Auto approval options for versioned listings - Include OCI Application listings with Terraform artifact.
     * @return the value
     **/
    public Boolean getIsDisableAutoApprovalForTerraformArtifactVersionedAppListings() {
        return isDisableAutoApprovalForTerraformArtifactVersionedAppListings;
    }

    /**
     * Disable Auto approval options for versioned listings - Include OCI Application listings with Container artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isDisableAutoApprovalForContainerArtifactVersionedAppListings")
    private final Boolean isDisableAutoApprovalForContainerArtifactVersionedAppListings;

    /**
     * Disable Auto approval options for versioned listings - Include OCI Application listings with Container artifact.
     * @return the value
     **/
    public Boolean getIsDisableAutoApprovalForContainerArtifactVersionedAppListings() {
        return isDisableAutoApprovalForContainerArtifactVersionedAppListings;
    }

    /**
     * Disable Auto approval options for versioned listings - Include OCI Application listings with Helm chart artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isDisableAutoApprovalForHelmChartVersionedAppListings")
    private final Boolean isDisableAutoApprovalForHelmChartVersionedAppListings;

    /**
     * Disable Auto approval options for versioned listings - Include OCI Application listings with Helm chart artifact.
     * @return the value
     **/
    public Boolean getIsDisableAutoApprovalForHelmChartVersionedAppListings() {
        return isDisableAutoApprovalForHelmChartVersionedAppListings;
    }

    /**
     * Enable Auto approval options for versioned listings - Include Service listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isEnableAutoApprovalForServiceVersionedListings")
    private final Boolean isEnableAutoApprovalForServiceVersionedListings;

    /**
     * Enable Auto approval options for versioned listings - Include Service listings.
     * @return the value
     **/
    public Boolean getIsEnableAutoApprovalForServiceVersionedListings() {
        return isEnableAutoApprovalForServiceVersionedListings;
    }

    /**
     * Enable Auto approval options for versioned listings - Include Fusion AiAgent listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isEnableAutoApprovalForFusionAiAgentVersionedListings")
    private final Boolean isEnableAutoApprovalForFusionAiAgentVersionedListings;

    /**
     * Enable Auto approval options for versioned listings - Include Fusion AiAgent listings.
     * @return the value
     **/
    public Boolean getIsEnableAutoApprovalForFusionAiAgentVersionedListings() {
        return isEnableAutoApprovalForFusionAiAgentVersionedListings;
    }

    /**
     * Enable Auto approval options for versioned listings - Include Lead generation listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isEnableAutoApprovalForLeadGenVersionedListings")
    private final Boolean isEnableAutoApprovalForLeadGenVersionedListings;

    /**
     * Enable Auto approval options for versioned listings - Include Lead generation listings.
     * @return the value
     **/
    public Boolean getIsEnableAutoApprovalForLeadGenVersionedListings() {
        return isEnableAutoApprovalForLeadGenVersionedListings;
    }

    /**
     * Disable Auto approval options for versioned listings - Include SaaS listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisableAutoApprovalForSaaSVersionedListings")
    private final Boolean isDisableAutoApprovalForSaaSVersionedListings;

    /**
     * Disable Auto approval options for versioned listings - Include SaaS listings.
     * @return the value
     **/
    public Boolean getIsDisableAutoApprovalForSaaSVersionedListings() {
        return isDisableAutoApprovalForSaaSVersionedListings;
    }

    /**
     * Disable Auto approval options for versioned listings - Include Paid App listings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "isDisableAutoApprovalForPaidAppVersionedListings")
    private final Boolean isDisableAutoApprovalForPaidAppVersionedListings;

    /**
     * Disable Auto approval options for versioned listings - Include Paid App listings.
     * @return the value
     **/
    public Boolean getIsDisableAutoApprovalForPaidAppVersionedListings() {
        return isDisableAutoApprovalForPaidAppVersionedListings;
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
        sb.append("PartnerPortalOptions(");
        sb.append("super=").append(super.toString());
        sb.append("isEnablePublisherAgreementCheckBeforeListingPublish=")
                .append(String.valueOf(this.isEnablePublisherAgreementCheckBeforeListingPublish));
        sb.append(", isEnableOpnMembershipStatusCheckBeforeListingPublish=")
                .append(String.valueOf(this.isEnableOpnMembershipStatusCheckBeforeListingPublish));
        sb.append(", isEnableReports=").append(String.valueOf(this.isEnableReports));
        sb.append(", isEnablePrivateListing=").append(String.valueOf(this.isEnablePrivateListing));
        sb.append(", isEnableAutoPublishOnSubmitForLeadGenListings=")
                .append(String.valueOf(this.isEnableAutoPublishOnSubmitForLeadGenListings));
        sb.append(", isDisableAutoPublishOnSubmit=")
                .append(String.valueOf(this.isDisableAutoPublishOnSubmit));
        sb.append(", isEnableAutoApprovalForImageArtifactNewAppListings=")
                .append(String.valueOf(this.isEnableAutoApprovalForImageArtifactNewAppListings));
        sb.append(", isEnableAutoApprovalForTerraformArtifactNewAppListings=")
                .append(
                        String.valueOf(
                                this.isEnableAutoApprovalForTerraformArtifactNewAppListings));
        sb.append(", isEnableAutoApprovalForNewPaidAppListings=")
                .append(String.valueOf(this.isEnableAutoApprovalForNewPaidAppListings));
        sb.append(", isEnableAutoApprovalForNewLeadGenListings=")
                .append(String.valueOf(this.isEnableAutoApprovalForNewLeadGenListings));
        sb.append(", isDisableAutoApprovalForImageArtifactVersionedAppListings=")
                .append(
                        String.valueOf(
                                this.isDisableAutoApprovalForImageArtifactVersionedAppListings));
        sb.append(", isDisableAutoApprovalForTerraformArtifactVersionedAppListings=")
                .append(
                        String.valueOf(
                                this.isDisableAutoApprovalForTerraformArtifactVersionedAppListings));
        sb.append(", isDisableAutoApprovalForContainerArtifactVersionedAppListings=")
                .append(
                        String.valueOf(
                                this.isDisableAutoApprovalForContainerArtifactVersionedAppListings));
        sb.append(", isDisableAutoApprovalForHelmChartVersionedAppListings=")
                .append(String.valueOf(this.isDisableAutoApprovalForHelmChartVersionedAppListings));
        sb.append(", isEnableAutoApprovalForServiceVersionedListings=")
                .append(String.valueOf(this.isEnableAutoApprovalForServiceVersionedListings));
        sb.append(", isEnableAutoApprovalForFusionAiAgentVersionedListings=")
                .append(String.valueOf(this.isEnableAutoApprovalForFusionAiAgentVersionedListings));
        sb.append(", isEnableAutoApprovalForLeadGenVersionedListings=")
                .append(String.valueOf(this.isEnableAutoApprovalForLeadGenVersionedListings));
        sb.append(", isDisableAutoApprovalForSaaSVersionedListings=")
                .append(String.valueOf(this.isDisableAutoApprovalForSaaSVersionedListings));
        sb.append(", isDisableAutoApprovalForPaidAppVersionedListings=")
                .append(String.valueOf(this.isDisableAutoApprovalForPaidAppVersionedListings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PartnerPortalOptions)) {
            return false;
        }

        PartnerPortalOptions other = (PartnerPortalOptions) o;
        return java.util.Objects.equals(
                        this.isEnablePublisherAgreementCheckBeforeListingPublish,
                        other.isEnablePublisherAgreementCheckBeforeListingPublish)
                && java.util.Objects.equals(
                        this.isEnableOpnMembershipStatusCheckBeforeListingPublish,
                        other.isEnableOpnMembershipStatusCheckBeforeListingPublish)
                && java.util.Objects.equals(this.isEnableReports, other.isEnableReports)
                && java.util.Objects.equals(
                        this.isEnablePrivateListing, other.isEnablePrivateListing)
                && java.util.Objects.equals(
                        this.isEnableAutoPublishOnSubmitForLeadGenListings,
                        other.isEnableAutoPublishOnSubmitForLeadGenListings)
                && java.util.Objects.equals(
                        this.isDisableAutoPublishOnSubmit, other.isDisableAutoPublishOnSubmit)
                && java.util.Objects.equals(
                        this.isEnableAutoApprovalForImageArtifactNewAppListings,
                        other.isEnableAutoApprovalForImageArtifactNewAppListings)
                && java.util.Objects.equals(
                        this.isEnableAutoApprovalForTerraformArtifactNewAppListings,
                        other.isEnableAutoApprovalForTerraformArtifactNewAppListings)
                && java.util.Objects.equals(
                        this.isEnableAutoApprovalForNewPaidAppListings,
                        other.isEnableAutoApprovalForNewPaidAppListings)
                && java.util.Objects.equals(
                        this.isEnableAutoApprovalForNewLeadGenListings,
                        other.isEnableAutoApprovalForNewLeadGenListings)
                && java.util.Objects.equals(
                        this.isDisableAutoApprovalForImageArtifactVersionedAppListings,
                        other.isDisableAutoApprovalForImageArtifactVersionedAppListings)
                && java.util.Objects.equals(
                        this.isDisableAutoApprovalForTerraformArtifactVersionedAppListings,
                        other.isDisableAutoApprovalForTerraformArtifactVersionedAppListings)
                && java.util.Objects.equals(
                        this.isDisableAutoApprovalForContainerArtifactVersionedAppListings,
                        other.isDisableAutoApprovalForContainerArtifactVersionedAppListings)
                && java.util.Objects.equals(
                        this.isDisableAutoApprovalForHelmChartVersionedAppListings,
                        other.isDisableAutoApprovalForHelmChartVersionedAppListings)
                && java.util.Objects.equals(
                        this.isEnableAutoApprovalForServiceVersionedListings,
                        other.isEnableAutoApprovalForServiceVersionedListings)
                && java.util.Objects.equals(
                        this.isEnableAutoApprovalForFusionAiAgentVersionedListings,
                        other.isEnableAutoApprovalForFusionAiAgentVersionedListings)
                && java.util.Objects.equals(
                        this.isEnableAutoApprovalForLeadGenVersionedListings,
                        other.isEnableAutoApprovalForLeadGenVersionedListings)
                && java.util.Objects.equals(
                        this.isDisableAutoApprovalForSaaSVersionedListings,
                        other.isDisableAutoApprovalForSaaSVersionedListings)
                && java.util.Objects.equals(
                        this.isDisableAutoApprovalForPaidAppVersionedListings,
                        other.isDisableAutoApprovalForPaidAppVersionedListings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isEnablePublisherAgreementCheckBeforeListingPublish == null
                                ? 43
                                : this.isEnablePublisherAgreementCheckBeforeListingPublish
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableOpnMembershipStatusCheckBeforeListingPublish == null
                                ? 43
                                : this.isEnableOpnMembershipStatusCheckBeforeListingPublish
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableReports == null ? 43 : this.isEnableReports.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnablePrivateListing == null
                                ? 43
                                : this.isEnablePrivateListing.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAutoPublishOnSubmitForLeadGenListings == null
                                ? 43
                                : this.isEnableAutoPublishOnSubmitForLeadGenListings.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisableAutoPublishOnSubmit == null
                                ? 43
                                : this.isDisableAutoPublishOnSubmit.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAutoApprovalForImageArtifactNewAppListings == null
                                ? 43
                                : this.isEnableAutoApprovalForImageArtifactNewAppListings
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAutoApprovalForTerraformArtifactNewAppListings == null
                                ? 43
                                : this.isEnableAutoApprovalForTerraformArtifactNewAppListings
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAutoApprovalForNewPaidAppListings == null
                                ? 43
                                : this.isEnableAutoApprovalForNewPaidAppListings.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAutoApprovalForNewLeadGenListings == null
                                ? 43
                                : this.isEnableAutoApprovalForNewLeadGenListings.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisableAutoApprovalForImageArtifactVersionedAppListings == null
                                ? 43
                                : this.isDisableAutoApprovalForImageArtifactVersionedAppListings
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isDisableAutoApprovalForTerraformArtifactVersionedAppListings
                                        == null
                                ? 43
                                : this.isDisableAutoApprovalForTerraformArtifactVersionedAppListings
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isDisableAutoApprovalForContainerArtifactVersionedAppListings
                                        == null
                                ? 43
                                : this.isDisableAutoApprovalForContainerArtifactVersionedAppListings
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isDisableAutoApprovalForHelmChartVersionedAppListings == null
                                ? 43
                                : this.isDisableAutoApprovalForHelmChartVersionedAppListings
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAutoApprovalForServiceVersionedListings == null
                                ? 43
                                : this.isEnableAutoApprovalForServiceVersionedListings.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAutoApprovalForFusionAiAgentVersionedListings == null
                                ? 43
                                : this.isEnableAutoApprovalForFusionAiAgentVersionedListings
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.isEnableAutoApprovalForLeadGenVersionedListings == null
                                ? 43
                                : this.isEnableAutoApprovalForLeadGenVersionedListings.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisableAutoApprovalForSaaSVersionedListings == null
                                ? 43
                                : this.isDisableAutoApprovalForSaaSVersionedListings.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisableAutoApprovalForPaidAppVersionedListings == null
                                ? 43
                                : this.isDisableAutoApprovalForPaidAppVersionedListings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
