/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LaunchInstanceDetails.Builder.class
)
public class LaunchInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
        private CreateVnicDetails createVnicDetails;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, Object> extendedMetadata;

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
        private String ipxeScript;

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public LaunchInstanceDetails build() {
            return new LaunchInstanceDetails(
                    availabilityDomain,
                    compartmentId,
                    createVnicDetails,
                    displayName,
                    extendedMetadata,
                    hostnameLabel,
                    imageId,
                    ipxeScript,
                    metadata,
                    shape,
                    subnetId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchInstanceDetails o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .createVnicDetails(o.getCreateVnicDetails())
                    .displayName(o.getDisplayName())
                    .extendedMetadata(o.getExtendedMetadata())
                    .hostnameLabel(o.getHostnameLabel())
                    .imageId(o.getImageId())
                    .ipxeScript(o.getIpxeScript())
                    .metadata(o.getMetadata())
                    .shape(o.getShape())
                    .subnetId(o.getSubnetId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Availability Domain of the instance.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * Details for the primary VNIC, which is automatically created and attached when
     * the instance is launched.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
    CreateVnicDetails createVnicDetails;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: `My bare metal instance`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * Additional metadata key/value pairs that you provide.  They serve a similar purpose and functionality from fields in the 'metadata' object.
     * <p>
     * They are distinguished from 'metadata' fields in that these can be nested JSON objects (whereas 'metadata' fields are string/string maps only).
     * <p>
     * If you don't need nested metadata values, it is strongly advised to avoid using this object and use the Metadata object instead.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    java.util.Map<String, Object> extendedMetadata;

    /**
     * Deprecated. Instead use `hostnameLabel` in
     * {@link CreateVnicDetails}.
     * If you provide both, the values must match.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    @javax.validation.constraints.Size(min = 1, max = 63)
    String hostnameLabel;

    /**
     * The OCID of the image used to boot the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String imageId;

    /**
     * This is an advanced option.
     * <p>
     * When an Oracle Bare Metal Cloud Services or virtual machine
     * instance boots, the iPXE firmware that runs on the instance is
     * configured to run an iPXE script to continue the boot process.
     * <p>
     * If you want more control over the boot process, you can provide
     * your own custom iPXE script that will run when the instance boots;
     * however, you should be aware that the same iPXE script will run
     * every time an instance boots; not only after the initial
     * LaunchInstance call.
     * <p>
     * The default iPXE script connects to the instance's local boot
     * volume over iSCSI and performs a network boot. If you use a custom iPXE
     * script and want to network-boot from the instance's local boot volume
     * over iSCSI the same way as the default iPXE script, you should use the
     * following iSCSI IP address: 169.254.0.2, and boot volume IQN:
     * iqn.2015-02.oracle.boot.
     * <p>
     * For more information about the Bring Your Own Image feature of
     * Oracle Bare Metal Cloud Services, see
     * [Bring Your Own Image](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/References/bringyourownimage.htm).
     * <p>
     * For more information about iPXE, see http://ipxe.org.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipxeScript")
    @javax.validation.constraints.Size(min = 1, max = 10240)
    String ipxeScript;

    /**
     * Custom metadata key/value pairs that you provide, such as the SSH public key
     * required to connect to the instance.
     * <p>
     * A metadata service runs on every launched instance. The service is an HTTP
     * endpoint listening on 169.254.169.254. You can use the service to:
     * <p>
     * Provide information to [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/)
     *   to be used for various system initialization tasks.
     * <p>
     * Get information about the instance, including the custom metadata that you
     *   provide when you launch the instance.
     * <p>
     **Providing Cloud-Init Metadata**
     * <p>
     * You can use the following metadata key names to provide information to
     *  Cloud-Init:
     * <p>
     **\"ssh_authorized_keys\"** - Provide one or more public SSH keys to be
     *  included in the `~/.ssh/authorized_keys` file for the default user on the
     *  instance. Use a newline character to separate multiple keys. The SSH
     *  keys must be in the format necessary for the `authorized_keys` file, as shown
     *  in the example below.
     * <p>
     **\"user_data\"** - Provide your own base64-encoded data to be used by
     *  Cloud-Init to run custom scripts or provide custom Cloud-Init configuration. For
     *  information about how to take advantage of user data, see the
     *  [Cloud-Init Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
     * <p>
     **Note:** Cloud-Init does not pull this data from the `http://169.254.169.254/opc/v1/instance/metadata/`
     *  path. When the instance launches and either of these keys are provided, the key values are formatted as
     *  OpenStack metadata and copied to the following locations, which are recognized by Cloud-Init:
     * <p>
     * `http://169.254.169.254/openstack/latest/meta_data.json` - This JSON blob
     *  contains, among other things, the SSH keys that you provided for
     *   **\"ssh_authorized_keys\"**.
     * <p>
     * `http://169.254.169.254/openstack/latest/user_data` - Contains the
     *  base64-decoded data that you provided for **\"user_data\"**.
     * <p>
     **Metadata Example**
     * <p>
     * \"metadata\" : {
     *          \"quake_bot_level\" : \"Severe\",
     *          \"ssh_authorized_keys\" : \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQCZ06fccNTQfq+xubFlJ5ZR3kt+uzspdH9tXL+lAejSM1NXM+CFZev7MIxfEjas06y80ZBZ7DUTQO0GxJPeD8NCOb1VorF8M4xuLwrmzRtkoZzU16umt4y1W0Q4ifdp3IiiU0U8/WxczSXcUVZOLqkz5dc6oMHdMVpkimietWzGZ4LBBsH/LjEVY7E0V+a0sNchlVDIZcm7ErReBLcdTGDq0uLBiuChyl6RUkX1PNhusquTGwK7zc8OBXkRuubn5UKXhI3Ul9Nyk4XESkVWIGNKmw8mSpoJSjR8P9ZjRmcZVo8S+x4KVPMZKQEor== ryan.smith@company.com
     *          ssh-rsa AAAAB3NzaC1yc2EAAAABJQAAAQEAzJSAtwEPoB3Jmr58IXrDGzLuDYkWAYg8AsLYlo6JZvKpjY1xednIcfEVQJm4T2DhVmdWhRrwQ8DmayVZvBkLt+zs2LdoAJEVimKwXcJFD/7wtH8Lnk17HiglbbbNXsemjDY0hea4JUE5CfvkIdZBITuMrfqSmA4n3VNoorXYdvtTMoGG8fxMub46RPtuxtqi9bG9Zqenordkg5FJt2mVNfQRqf83CWojcOkklUWq4CjyxaeLf5i9gv1fRoBo4QhiA8I6NCSppO8GnoV/6Ox6TNoh9BiifqGKC9VGYuC89RvUajRBTZSK2TK4DPfaT+2R+slPsFrwiT/oPEhhEK1S5Q== rsa-key-20160227\",
     *          \"user_data\" : \"SWYgeW91IGNhbiBzZWUgdGhpcywgdGhlbiBpdCB3b3JrZWQgbWF5YmUuCg==\"
     *       }
     *  **Getting Metadata on the Instance**
     * <p>
     * To get information about your instance, connect to the instance using SSH and issue any of the
     *  following GET requests:
     * <p>
     * curl http://169.254.169.254/opc/v1/instance/
     *      curl http://169.254.169.254/opc/v1/instance/metadata/
     *      curl http://169.254.169.254/opc/v1/instance/metadata/<any-key-name>
     * <p>
     * You'll get back a response that includes all the instance information; only the metadata information; or
     *  the metadata information for the specified key name, respectively.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

    /**
     * The shape of an instance. The shape determines the number of CPUs, amount of memory,
     * and other resources allocated to the instance.
     * <p>
     * You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String shape;

    /**
     * Deprecated. Instead use `subnetId` in
     * {@link CreateVnicDetails}.
     * At least one of them is required; if you provide both, the values must match.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String subnetId;
}
