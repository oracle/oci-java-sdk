/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the certificate version. This object does not contain the certificate contents.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CertificateVersionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issuerCaVersionNumber")
        private Long issuerCaVersionNumber;

        public Builder issuerCaVersionNumber(Long issuerCaVersionNumber) {
            this.issuerCaVersionNumber = issuerCaVersionNumber;
            this.__explicitlySet__.add("issuerCaVersionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternativeNames")
        private java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames;

        public Builder subjectAlternativeNames(
                java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            this.__explicitlySet__.add("subjectAlternativeNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<VersionStage> stages;

        public Builder stages(java.util.List<VersionStage> stages) {
            this.stages = stages;
            this.__explicitlySet__.add("stages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("revocationStatus")
        private RevocationStatus revocationStatus;

        public Builder revocationStatus(RevocationStatus revocationStatus) {
            this.revocationStatus = revocationStatus;
            this.__explicitlySet__.add("revocationStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateVersionSummary build() {
            CertificateVersionSummary __instance__ =
                    new CertificateVersionSummary(
                            certificateId,
                            serialNumber,
                            timeCreated,
                            versionNumber,
                            issuerCaVersionNumber,
                            versionName,
                            subjectAlternativeNames,
                            timeOfDeletion,
                            validity,
                            stages,
                            revocationStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateVersionSummary o) {
            Builder copiedBuilder =
                    certificateId(o.getCertificateId())
                            .serialNumber(o.getSerialNumber())
                            .timeCreated(o.getTimeCreated())
                            .versionNumber(o.getVersionNumber())
                            .issuerCaVersionNumber(o.getIssuerCaVersionNumber())
                            .versionName(o.getVersionName())
                            .subjectAlternativeNames(o.getSubjectAlternativeNames())
                            .timeOfDeletion(o.getTimeOfDeletion())
                            .validity(o.getValidity())
                            .stages(o.getStages())
                            .revocationStatus(o.getRevocationStatus());

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

    /**
     * The OCID of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    String certificateId;

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    String serialNumber;

    /**
     * A optional property indicating the time when the certificate version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The version number of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    Long versionNumber;

    /**
     * The version number of the issuing certificate authority (CA).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuerCaVersionNumber")
    Long issuerCaVersionNumber;

    /**
     * The name of the certificate version. When the value is not null, a name is unique across versions of a given certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    String versionName;

    /**
     * A list of subject alternative names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternativeNames")
    java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames;

    /**
     * An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    java.util.Date timeOfDeletion;

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    Validity validity;

    /**
     * A list of rotation states for this certificate version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    java.util.List<VersionStage> stages;

    @com.fasterxml.jackson.annotation.JsonProperty("revocationStatus")
    RevocationStatus revocationStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
