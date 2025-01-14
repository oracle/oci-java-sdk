/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Certificate data. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Certificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Certificate extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "deploymentId",
        "certificateContent",
        "issuer",
        "isSelfSigned",
        "md5Hash",
        "publicKey",
        "publicKeyAlgorithm",
        "publicKeySize",
        "serial",
        "subject",
        "timeValidFrom",
        "timeValidTo",
        "version",
        "sha1Hash",
        "authorityKeyId",
        "isCa",
        "subjectKeyId",
        "lifecycleState",
        "timeCreated"
    })
    public Certificate(
            String key,
            String deploymentId,
            String certificateContent,
            String issuer,
            Boolean isSelfSigned,
            String md5Hash,
            String publicKey,
            String publicKeyAlgorithm,
            Long publicKeySize,
            String serial,
            String subject,
            java.util.Date timeValidFrom,
            java.util.Date timeValidTo,
            String version,
            String sha1Hash,
            String authorityKeyId,
            Boolean isCa,
            String subjectKeyId,
            CertificateLifecycleState lifecycleState,
            java.util.Date timeCreated) {
        super();
        this.key = key;
        this.deploymentId = deploymentId;
        this.certificateContent = certificateContent;
        this.issuer = issuer;
        this.isSelfSigned = isSelfSigned;
        this.md5Hash = md5Hash;
        this.publicKey = publicKey;
        this.publicKeyAlgorithm = publicKeyAlgorithm;
        this.publicKeySize = publicKeySize;
        this.serial = serial;
        this.subject = subject;
        this.timeValidFrom = timeValidFrom;
        this.timeValidTo = timeValidTo;
        this.version = version;
        this.sha1Hash = sha1Hash;
        this.authorityKeyId = authorityKeyId;
        this.isCa = isCa;
        this.subjectKeyId = subjectKeyId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier key (unique name in the scope of the deployment) of the certificate being
         * referenced. It must be 1 to 32 characters long, must contain only alphanumeric characters
         * and must start with a letter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The identifier key (unique name in the scope of the deployment) of the certificate being
         * referenced. It must be 1 to 32 characters long, must contain only alphanumeric characters
         * and must start with a letter.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
        private String deploymentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         *
         * @param deploymentId the value to set
         * @return this builder
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            this.__explicitlySet__.add("deploymentId");
            return this;
        }
        /** The base64 encoded content of the PEM file containing the SSL certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateContent")
        private String certificateContent;

        /**
         * The base64 encoded content of the PEM file containing the SSL certificate.
         *
         * @param certificateContent the value to set
         * @return this builder
         */
        public Builder certificateContent(String certificateContent) {
            this.certificateContent = certificateContent;
            this.__explicitlySet__.add("certificateContent");
            return this;
        }
        /** The Certificate issuer. */
        @com.fasterxml.jackson.annotation.JsonProperty("issuer")
        private String issuer;

        /**
         * The Certificate issuer.
         *
         * @param issuer the value to set
         * @return this builder
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            this.__explicitlySet__.add("issuer");
            return this;
        }
        /** Indicates if the certificate is self signed. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSelfSigned")
        private Boolean isSelfSigned;

        /**
         * Indicates if the certificate is self signed.
         *
         * @param isSelfSigned the value to set
         * @return this builder
         */
        public Builder isSelfSigned(Boolean isSelfSigned) {
            this.isSelfSigned = isSelfSigned;
            this.__explicitlySet__.add("isSelfSigned");
            return this;
        }
        /** The Certificate md5Hash. */
        @com.fasterxml.jackson.annotation.JsonProperty("md5Hash")
        private String md5Hash;

        /**
         * The Certificate md5Hash.
         *
         * @param md5Hash the value to set
         * @return this builder
         */
        public Builder md5Hash(String md5Hash) {
            this.md5Hash = md5Hash;
            this.__explicitlySet__.add("md5Hash");
            return this;
        }
        /** The Certificate public key. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * The Certificate public key.
         *
         * @param publicKey the value to set
         * @return this builder
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }
        /** The Certificate public key algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKeyAlgorithm")
        private String publicKeyAlgorithm;

        /**
         * The Certificate public key algorithm.
         *
         * @param publicKeyAlgorithm the value to set
         * @return this builder
         */
        public Builder publicKeyAlgorithm(String publicKeyAlgorithm) {
            this.publicKeyAlgorithm = publicKeyAlgorithm;
            this.__explicitlySet__.add("publicKeyAlgorithm");
            return this;
        }
        /** The Certificate public key size. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKeySize")
        private Long publicKeySize;

        /**
         * The Certificate public key size.
         *
         * @param publicKeySize the value to set
         * @return this builder
         */
        public Builder publicKeySize(Long publicKeySize) {
            this.publicKeySize = publicKeySize;
            this.__explicitlySet__.add("publicKeySize");
            return this;
        }
        /** The Certificate serial. */
        @com.fasterxml.jackson.annotation.JsonProperty("serial")
        private String serial;

        /**
         * The Certificate serial.
         *
         * @param serial the value to set
         * @return this builder
         */
        public Builder serial(String serial) {
            this.serial = serial;
            this.__explicitlySet__.add("serial");
            return this;
        }
        /** The Certificate subject. */
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        /**
         * The Certificate subject.
         *
         * @param subject the value to set
         * @return this builder
         */
        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }
        /**
         * The time the certificate is valid from. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidFrom")
        private java.util.Date timeValidFrom;

        /**
         * The time the certificate is valid from. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeValidFrom the value to set
         * @return this builder
         */
        public Builder timeValidFrom(java.util.Date timeValidFrom) {
            this.timeValidFrom = timeValidFrom;
            this.__explicitlySet__.add("timeValidFrom");
            return this;
        }
        /**
         * The time the certificate is valid to. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidTo")
        private java.util.Date timeValidTo;

        /**
         * The time the certificate is valid to. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeValidTo the value to set
         * @return this builder
         */
        public Builder timeValidTo(java.util.Date timeValidTo) {
            this.timeValidTo = timeValidTo;
            this.__explicitlySet__.add("timeValidTo");
            return this;
        }
        /** The Certificate version. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The Certificate version.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The Certificate sha1 hash. */
        @com.fasterxml.jackson.annotation.JsonProperty("sha1Hash")
        private String sha1Hash;

        /**
         * The Certificate sha1 hash.
         *
         * @param sha1Hash the value to set
         * @return this builder
         */
        public Builder sha1Hash(String sha1Hash) {
            this.sha1Hash = sha1Hash;
            this.__explicitlySet__.add("sha1Hash");
            return this;
        }
        /** The Certificate authority key id. */
        @com.fasterxml.jackson.annotation.JsonProperty("authorityKeyId")
        private String authorityKeyId;

        /**
         * The Certificate authority key id.
         *
         * @param authorityKeyId the value to set
         * @return this builder
         */
        public Builder authorityKeyId(String authorityKeyId) {
            this.authorityKeyId = authorityKeyId;
            this.__explicitlySet__.add("authorityKeyId");
            return this;
        }
        /** Indicates if the certificate is ca. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCa")
        private Boolean isCa;

        /**
         * Indicates if the certificate is ca.
         *
         * @param isCa the value to set
         * @return this builder
         */
        public Builder isCa(Boolean isCa) {
            this.isCa = isCa;
            this.__explicitlySet__.add("isCa");
            return this;
        }
        /** The Certificate subject key id. */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectKeyId")
        private String subjectKeyId;

        /**
         * The Certificate subject key id.
         *
         * @param subjectKeyId the value to set
         * @return this builder
         */
        public Builder subjectKeyId(String subjectKeyId) {
            this.subjectKeyId = subjectKeyId;
            this.__explicitlySet__.add("subjectKeyId");
            return this;
        }
        /** Possible certificate lifecycle states. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CertificateLifecycleState lifecycleState;

        /**
         * Possible certificate lifecycle states.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(CertificateLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Certificate build() {
            Certificate model =
                    new Certificate(
                            this.key,
                            this.deploymentId,
                            this.certificateContent,
                            this.issuer,
                            this.isSelfSigned,
                            this.md5Hash,
                            this.publicKey,
                            this.publicKeyAlgorithm,
                            this.publicKeySize,
                            this.serial,
                            this.subject,
                            this.timeValidFrom,
                            this.timeValidTo,
                            this.version,
                            this.sha1Hash,
                            this.authorityKeyId,
                            this.isCa,
                            this.subjectKeyId,
                            this.lifecycleState,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("deploymentId")) {
                this.deploymentId(model.getDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("certificateContent")) {
                this.certificateContent(model.getCertificateContent());
            }
            if (model.wasPropertyExplicitlySet("issuer")) {
                this.issuer(model.getIssuer());
            }
            if (model.wasPropertyExplicitlySet("isSelfSigned")) {
                this.isSelfSigned(model.getIsSelfSigned());
            }
            if (model.wasPropertyExplicitlySet("md5Hash")) {
                this.md5Hash(model.getMd5Hash());
            }
            if (model.wasPropertyExplicitlySet("publicKey")) {
                this.publicKey(model.getPublicKey());
            }
            if (model.wasPropertyExplicitlySet("publicKeyAlgorithm")) {
                this.publicKeyAlgorithm(model.getPublicKeyAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("publicKeySize")) {
                this.publicKeySize(model.getPublicKeySize());
            }
            if (model.wasPropertyExplicitlySet("serial")) {
                this.serial(model.getSerial());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
            }
            if (model.wasPropertyExplicitlySet("timeValidFrom")) {
                this.timeValidFrom(model.getTimeValidFrom());
            }
            if (model.wasPropertyExplicitlySet("timeValidTo")) {
                this.timeValidTo(model.getTimeValidTo());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("sha1Hash")) {
                this.sha1Hash(model.getSha1Hash());
            }
            if (model.wasPropertyExplicitlySet("authorityKeyId")) {
                this.authorityKeyId(model.getAuthorityKeyId());
            }
            if (model.wasPropertyExplicitlySet("isCa")) {
                this.isCa(model.getIsCa());
            }
            if (model.wasPropertyExplicitlySet("subjectKeyId")) {
                this.subjectKeyId(model.getSubjectKeyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The identifier key (unique name in the scope of the deployment) of the certificate being
     * referenced. It must be 1 to 32 characters long, must contain only alphanumeric characters and
     * must start with a letter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The identifier key (unique name in the scope of the deployment) of the certificate being
     * referenced. It must be 1 to 32 characters long, must contain only alphanumeric characters and
     * must start with a letter.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
    private final String deploymentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     *
     * @return the value
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /** The base64 encoded content of the PEM file containing the SSL certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateContent")
    private final String certificateContent;

    /**
     * The base64 encoded content of the PEM file containing the SSL certificate.
     *
     * @return the value
     */
    public String getCertificateContent() {
        return certificateContent;
    }

    /** The Certificate issuer. */
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    private final String issuer;

    /**
     * The Certificate issuer.
     *
     * @return the value
     */
    public String getIssuer() {
        return issuer;
    }

    /** Indicates if the certificate is self signed. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSelfSigned")
    private final Boolean isSelfSigned;

    /**
     * Indicates if the certificate is self signed.
     *
     * @return the value
     */
    public Boolean getIsSelfSigned() {
        return isSelfSigned;
    }

    /** The Certificate md5Hash. */
    @com.fasterxml.jackson.annotation.JsonProperty("md5Hash")
    private final String md5Hash;

    /**
     * The Certificate md5Hash.
     *
     * @return the value
     */
    public String getMd5Hash() {
        return md5Hash;
    }

    /** The Certificate public key. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * The Certificate public key.
     *
     * @return the value
     */
    public String getPublicKey() {
        return publicKey;
    }

    /** The Certificate public key algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyAlgorithm")
    private final String publicKeyAlgorithm;

    /**
     * The Certificate public key algorithm.
     *
     * @return the value
     */
    public String getPublicKeyAlgorithm() {
        return publicKeyAlgorithm;
    }

    /** The Certificate public key size. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKeySize")
    private final Long publicKeySize;

    /**
     * The Certificate public key size.
     *
     * @return the value
     */
    public Long getPublicKeySize() {
        return publicKeySize;
    }

    /** The Certificate serial. */
    @com.fasterxml.jackson.annotation.JsonProperty("serial")
    private final String serial;

    /**
     * The Certificate serial.
     *
     * @return the value
     */
    public String getSerial() {
        return serial;
    }

    /** The Certificate subject. */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final String subject;

    /**
     * The Certificate subject.
     *
     * @return the value
     */
    public String getSubject() {
        return subject;
    }

    /**
     * The time the certificate is valid from. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidFrom")
    private final java.util.Date timeValidFrom;

    /**
     * The time the certificate is valid from. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeValidFrom() {
        return timeValidFrom;
    }

    /**
     * The time the certificate is valid to. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidTo")
    private final java.util.Date timeValidTo;

    /**
     * The time the certificate is valid to. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeValidTo() {
        return timeValidTo;
    }

    /** The Certificate version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The Certificate version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The Certificate sha1 hash. */
    @com.fasterxml.jackson.annotation.JsonProperty("sha1Hash")
    private final String sha1Hash;

    /**
     * The Certificate sha1 hash.
     *
     * @return the value
     */
    public String getSha1Hash() {
        return sha1Hash;
    }

    /** The Certificate authority key id. */
    @com.fasterxml.jackson.annotation.JsonProperty("authorityKeyId")
    private final String authorityKeyId;

    /**
     * The Certificate authority key id.
     *
     * @return the value
     */
    public String getAuthorityKeyId() {
        return authorityKeyId;
    }

    /** Indicates if the certificate is ca. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCa")
    private final Boolean isCa;

    /**
     * Indicates if the certificate is ca.
     *
     * @return the value
     */
    public Boolean getIsCa() {
        return isCa;
    }

    /** The Certificate subject key id. */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectKeyId")
    private final String subjectKeyId;

    /**
     * The Certificate subject key id.
     *
     * @return the value
     */
    public String getSubjectKeyId() {
        return subjectKeyId;
    }

    /** Possible certificate lifecycle states. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CertificateLifecycleState lifecycleState;

    /**
     * Possible certificate lifecycle states.
     *
     * @return the value
     */
    public CertificateLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("Certificate(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", certificateContent=").append(String.valueOf(this.certificateContent));
        sb.append(", issuer=").append(String.valueOf(this.issuer));
        sb.append(", isSelfSigned=").append(String.valueOf(this.isSelfSigned));
        sb.append(", md5Hash=").append(String.valueOf(this.md5Hash));
        sb.append(", publicKey=").append(String.valueOf(this.publicKey));
        sb.append(", publicKeyAlgorithm=").append(String.valueOf(this.publicKeyAlgorithm));
        sb.append(", publicKeySize=").append(String.valueOf(this.publicKeySize));
        sb.append(", serial=").append(String.valueOf(this.serial));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", timeValidFrom=").append(String.valueOf(this.timeValidFrom));
        sb.append(", timeValidTo=").append(String.valueOf(this.timeValidTo));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", sha1Hash=").append(String.valueOf(this.sha1Hash));
        sb.append(", authorityKeyId=").append(String.valueOf(this.authorityKeyId));
        sb.append(", isCa=").append(String.valueOf(this.isCa));
        sb.append(", subjectKeyId=").append(String.valueOf(this.subjectKeyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Certificate)) {
            return false;
        }

        Certificate other = (Certificate) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(this.certificateContent, other.certificateContent)
                && java.util.Objects.equals(this.issuer, other.issuer)
                && java.util.Objects.equals(this.isSelfSigned, other.isSelfSigned)
                && java.util.Objects.equals(this.md5Hash, other.md5Hash)
                && java.util.Objects.equals(this.publicKey, other.publicKey)
                && java.util.Objects.equals(this.publicKeyAlgorithm, other.publicKeyAlgorithm)
                && java.util.Objects.equals(this.publicKeySize, other.publicKeySize)
                && java.util.Objects.equals(this.serial, other.serial)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(this.timeValidFrom, other.timeValidFrom)
                && java.util.Objects.equals(this.timeValidTo, other.timeValidTo)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.sha1Hash, other.sha1Hash)
                && java.util.Objects.equals(this.authorityKeyId, other.authorityKeyId)
                && java.util.Objects.equals(this.isCa, other.isCa)
                && java.util.Objects.equals(this.subjectKeyId, other.subjectKeyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateContent == null
                                ? 43
                                : this.certificateContent.hashCode());
        result = (result * PRIME) + (this.issuer == null ? 43 : this.issuer.hashCode());
        result = (result * PRIME) + (this.isSelfSigned == null ? 43 : this.isSelfSigned.hashCode());
        result = (result * PRIME) + (this.md5Hash == null ? 43 : this.md5Hash.hashCode());
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeyAlgorithm == null
                                ? 43
                                : this.publicKeyAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeySize == null ? 43 : this.publicKeySize.hashCode());
        result = (result * PRIME) + (this.serial == null ? 43 : this.serial.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidFrom == null ? 43 : this.timeValidFrom.hashCode());
        result = (result * PRIME) + (this.timeValidTo == null ? 43 : this.timeValidTo.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.sha1Hash == null ? 43 : this.sha1Hash.hashCode());
        result =
                (result * PRIME)
                        + (this.authorityKeyId == null ? 43 : this.authorityKeyId.hashCode());
        result = (result * PRIME) + (this.isCa == null ? 43 : this.isCa.hashCode());
        result = (result * PRIME) + (this.subjectKeyId == null ? 43 : this.subjectKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
