// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AddIn;
import com.microsoft.graph.models.extensions.AppRole;
import com.microsoft.graph.models.extensions.InformationalUrl;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PermissionScope;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.models.extensions.Endpoint;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.EndpointCollectionResponse;
import com.microsoft.graph.requests.extensions.EndpointCollectionPage;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionResponse;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal.
 */
public class ServicePrincipal extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Account Enabled.
     * 
     */
    @SerializedName("accountEnabled")
    @Expose
    public Boolean accountEnabled;

    /**
     * The Add Ins.
     * 
     */
    @SerializedName("addIns")
    @Expose
    public java.util.List<AddIn> addIns;

    /**
     * The Alternative Names.
     * 
     */
    @SerializedName("alternativeNames")
    @Expose
    public java.util.List<String> alternativeNames;

    /**
     * The App Display Name.
     * 
     */
    @SerializedName("appDisplayName")
    @Expose
    public String appDisplayName;

    /**
     * The App Id.
     * 
     */
    @SerializedName("appId")
    @Expose
    public String appId;

    /**
     * The App Owner Organization Id.
     * 
     */
    @SerializedName("appOwnerOrganizationId")
    @Expose
    public java.util.UUID appOwnerOrganizationId;

    /**
     * The App Role Assignment Required.
     * 
     */
    @SerializedName("appRoleAssignmentRequired")
    @Expose
    public Boolean appRoleAssignmentRequired;

    /**
     * The App Roles.
     * 
     */
    @SerializedName("appRoles")
    @Expose
    public java.util.List<AppRole> appRoles;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Homepage.
     * 
     */
    @SerializedName("homepage")
    @Expose
    public String homepage;

    /**
     * The Info.
     * 
     */
    @SerializedName("info")
    @Expose
    public InformationalUrl info;

    /**
     * The Key Credentials.
     * 
     */
    @SerializedName("keyCredentials")
    @Expose
    public java.util.List<KeyCredential> keyCredentials;

    /**
     * The Logout Url.
     * 
     */
    @SerializedName("logoutUrl")
    @Expose
    public String logoutUrl;

    /**
     * The Oauth2Permission Scopes.
     * 
     */
    @SerializedName("oauth2PermissionScopes")
    @Expose
    public java.util.List<PermissionScope> oauth2PermissionScopes;

    /**
     * The Password Credentials.
     * 
     */
    @SerializedName("passwordCredentials")
    @Expose
    public java.util.List<PasswordCredential> passwordCredentials;

    /**
     * The Reply Urls.
     * 
     */
    @SerializedName("replyUrls")
    @Expose
    public java.util.List<String> replyUrls;

    /**
     * The Service Principal Names.
     * 
     */
    @SerializedName("servicePrincipalNames")
    @Expose
    public java.util.List<String> servicePrincipalNames;

    /**
     * The Service Principal Type.
     * 
     */
    @SerializedName("servicePrincipalType")
    @Expose
    public String servicePrincipalType;

    /**
     * The Tags.
     * 
     */
    @SerializedName("tags")
    @Expose
    public java.util.List<String> tags;

    /**
     * The Token Encryption Key Id.
     * 
     */
    @SerializedName("tokenEncryptionKeyId")
    @Expose
    public java.util.UUID tokenEncryptionKeyId;

    /**
     * The App Role Assigned To.
     * 
     */
    public AppRoleAssignmentCollectionPage appRoleAssignedTo;

    /**
     * The App Role Assignments.
     * 
     */
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Endpoints.
     * 
     */
    public EndpointCollectionPage endpoints;

    /**
     * The Oauth2Permission Grants.
     * 
     */
    public OAuth2PermissionGrantCollectionPage oauth2PermissionGrants;

    /**
     * The Member Of.
     * 
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Created Objects.
     * 
     */
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The Owners.
     * 
     */
    public DirectoryObjectCollectionPage owners;

    /**
     * The Owned Objects.
     * 
     */
    public DirectoryObjectCollectionPage ownedObjects;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("appRoleAssignedTo")) {
            final AppRoleAssignmentCollectionResponse response = new AppRoleAssignmentCollectionResponse();
            if (json.has("appRoleAssignedTo@odata.nextLink")) {
                response.nextLink = json.get("appRoleAssignedTo@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("appRoleAssignedTo").toString(), JsonObject[].class);
            final AppRoleAssignment[] array = new AppRoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AppRoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            appRoleAssignedTo = new AppRoleAssignmentCollectionPage(response, null);
        }

        if (json.has("appRoleAssignments")) {
            final AppRoleAssignmentCollectionResponse response = new AppRoleAssignmentCollectionResponse();
            if (json.has("appRoleAssignments@odata.nextLink")) {
                response.nextLink = json.get("appRoleAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("appRoleAssignments").toString(), JsonObject[].class);
            final AppRoleAssignment[] array = new AppRoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AppRoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            appRoleAssignments = new AppRoleAssignmentCollectionPage(response, null);
        }

        if (json.has("endpoints")) {
            final EndpointCollectionResponse response = new EndpointCollectionResponse();
            if (json.has("endpoints@odata.nextLink")) {
                response.nextLink = json.get("endpoints@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("endpoints").toString(), JsonObject[].class);
            final Endpoint[] array = new Endpoint[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Endpoint.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            endpoints = new EndpointCollectionPage(response, null);
        }

        if (json.has("oauth2PermissionGrants")) {
            final OAuth2PermissionGrantCollectionResponse response = new OAuth2PermissionGrantCollectionResponse();
            if (json.has("oauth2PermissionGrants@odata.nextLink")) {
                response.nextLink = json.get("oauth2PermissionGrants@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("oauth2PermissionGrants").toString(), JsonObject[].class);
            final OAuth2PermissionGrant[] array = new OAuth2PermissionGrant[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OAuth2PermissionGrant.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            oauth2PermissionGrants = new OAuth2PermissionGrantCollectionPage(response, null);
        }

        if (json.has("memberOf")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("transitiveMemberOf")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("transitiveMemberOf@odata.nextLink")) {
                response.nextLink = json.get("transitiveMemberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            transitiveMemberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("createdObjects")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("createdObjects@odata.nextLink")) {
                response.nextLink = json.get("createdObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("createdObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            createdObjects = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("owners")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("owners@odata.nextLink")) {
                response.nextLink = json.get("owners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("owners").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            owners = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("ownedObjects")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("ownedObjects@odata.nextLink")) {
                response.nextLink = json.get("ownedObjects@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("ownedObjects").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            ownedObjects = new DirectoryObjectCollectionPage(response, null);
        }
    }
}
