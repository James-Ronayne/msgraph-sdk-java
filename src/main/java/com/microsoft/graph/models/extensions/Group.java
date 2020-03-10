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
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.LicenseProcessingState;
import com.microsoft.graph.models.extensions.OnPremisesProvisioningError;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.GroupSetting;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import com.microsoft.graph.models.extensions.PlannerGroup;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionPage;
import com.microsoft.graph.requests.extensions.ConversationCollectionResponse;
import com.microsoft.graph.requests.extensions.ConversationCollectionPage;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionResponse;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionPage;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionResponse;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionResponse;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.extensions.DriveCollectionResponse;
import com.microsoft.graph.requests.extensions.DriveCollectionPage;
import com.microsoft.graph.requests.extensions.SiteCollectionResponse;
import com.microsoft.graph.requests.extensions.SiteCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group.
 */
public class Group extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the group. Returned only on $select. Read-only.
     */
    @SerializedName("assignedLicenses")
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Classification.
     * Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default.
     */
    @SerializedName("classification")
    @Expose
    public String classification;

    /**
     * The Created Date Time.
     * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * An optional description for the group. Returned by default.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name for the group. This property is required when a group is created and cannot be cleared during updates. Returned by default. Supports $filter and $orderby.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Has Members With License Errors.
     * Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true). See an example.
     */
    @SerializedName("hasMembersWithLicenseErrors")
    @Expose
    public Boolean hasMembersWithLicenseErrors;

    /**
     * The Group Types.
     * Specifies the group type and its membership.  If the collection contains Unified then the group is an Office 365 group; otherwise it's a security group.  If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static.  Returned by default. Supports $filter.
     */
    @SerializedName("groupTypes")
    @Expose
    public java.util.List<String> groupTypes;

    /**
     * The License Processing State.
     * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
     */
    @SerializedName("licenseProcessingState")
    @Expose
    public LicenseProcessingState licenseProcessingState;

    /**
     * The Mail.
     * The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only. Supports $filter.
     */
    @SerializedName("mail")
    @Expose
    public String mail;

    /**
     * The Mail Enabled.
     * Specifies whether the group is mail-enabled. Returned by default.
     */
    @SerializedName("mailEnabled")
    @Expose
    public Boolean mailEnabled;

    /**
     * The Mail Nickname.
     * The mail alias for the group, unique in the organization. This property must be specified when a group is created. Returned by default. Supports $filter.
     */
    @SerializedName("mailNickname")
    @Expose
    public String mailNickname;

    /**
     * The On Premises Domain Name.
     * 
     */
    @SerializedName("onPremisesDomainName")
    @Expose
    public String onPremisesDomainName;

    /**
     * The On Premises Last Sync Date Time.
     * Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. Supports $filter.
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Net Bios Name.
     * 
     */
    @SerializedName("onPremisesNetBiosName")
    @Expose
    public String onPremisesNetBiosName;

    /**
     * The On Premises Provisioning Errors.
     * Errors when using Microsoft synchronization product during provisioning. Returned by default.
     */
    @SerializedName("onPremisesProvisioningErrors")
    @Expose
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sam Account Name.
     * 
     */
    @SerializedName("onPremisesSamAccountName")
    @Expose
    public String onPremisesSamAccountName;

    /**
     * The On Premises Security Identifier.
     * Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud. Returned by default. Read-only.
     */
    @SerializedName("onPremisesSecurityIdentifier")
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter.
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Preferred Data Location.
     * The preferred data location for the group. For more information, see  OneDrive Online Multi-Geo. Returned by default.
     */
    @SerializedName("preferredDataLocation")
    @Expose
    public String preferredDataLocation;

    /**
     * The Proxy Addresses.
     * Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter.
     */
    @SerializedName("proxyAddresses")
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The Renewed Date Time.
     * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    @SerializedName("renewedDateTime")
    @Expose
    public java.util.Calendar renewedDateTime;

    /**
     * The Security Enabled.
     * Specifies whether the group is a security group. Returned by default. Supports $filter.
     */
    @SerializedName("securityEnabled")
    @Expose
    public Boolean securityEnabled;

    /**
     * The Security Identifier.
     * Security identifier of the group, used in Windows scenarios. Returned by default.
     */
    @SerializedName("securityIdentifier")
    @Expose
    public String securityIdentifier;

    /**
     * The Visibility.
     * Specifies the visibility of an Office 365 group. Possible values are: Private, Public, or Hiddenmembership; blank values are treated as public.  See group visibility options to learn more.Visibility can be set only when a group is created; it is not editable.Visibility is supported only for unified groups; it is not supported for security groups. Returned by default.
     */
    @SerializedName("visibility")
    @Expose
    public String visibility;

    /**
     * The Allow External Senders.
     * Indicates if people external to the organization can send messages to the group. Default value is false. Returned only on $select.
     */
    @SerializedName("allowExternalSenders")
    @Expose
    public Boolean allowExternalSenders;

    /**
     * The Auto Subscribe New Members.
     * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default value is false. Returned only on $select.
     */
    @SerializedName("autoSubscribeNewMembers")
    @Expose
    public Boolean autoSubscribeNewMembers;

    /**
     * The Is Subscribed By Mail.
     * Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only on $select.
     */
    @SerializedName("isSubscribedByMail")
    @Expose
    public Boolean isSubscribedByMail;

    /**
     * The Unseen Count.
     * Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on $select.
     */
    @SerializedName("unseenCount")
    @Expose
    public Integer unseenCount;

    /**
     * The Hide From Outlook Clients.
     * True if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web; otherwise, false. Default value is false. Returned only on $select.
     */
    @SerializedName("hideFromOutlookClients")
    @Expose
    public Boolean hideFromOutlookClients;

    /**
     * The Hide From Address Lists.
     * True if the group is not displayed in certain parts of the Outlook UI: the Address Book, address lists for selecting message recipients, and the Browse Groups dialog for searching groups; otherwise, false. Default value is false. Returned only on $select.
     */
    @SerializedName("hideFromAddressLists")
    @Expose
    public Boolean hideFromAddressLists;

    /**
     * The Is Archived.
     * 
     */
    @SerializedName("isArchived")
    @Expose
    public Boolean isArchived;

    /**
     * The App Role Assignments.
     * 
     */
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Members.
     * Users and groups that are members of this group. HTTP Methods: GET (supported for all groups), POST (supported for Office 365 groups, security groups and mail-enabled security groups), DELETE (supported for Office 365 groups and security groups) Nullable.
     */
    public DirectoryObjectCollectionPage members;

    /**
     * The Member Of.
     * Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Members With License Errors.
     * A list of group members with license errors from this group-based license assignment. Read-only.
     */
    public DirectoryObjectCollectionPage membersWithLicenseErrors;

    /**
     * The Transitive Members.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMembers;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

    /**
     * The Created On Behalf Of.
     * The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only.
     */
    @SerializedName("createdOnBehalfOf")
    @Expose
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Owners.
     * The owners of the group. The owners are a set of non-admin users who are allowed to modify this object. Limited to 10 owners. HTTP Methods: GET (supported for all groups), POST (supported for Office 365 groups, security groups and mail-enabled security groups), DELETE (supported for Office 365 groups and security groups). Nullable.
     */
    public DirectoryObjectCollectionPage owners;

    /**
     * The Settings.
     * Read-only. Nullable.
     */
    public GroupSettingCollectionPage settings;

    /**
     * The Conversations.
     * The group's conversations.
     */
    public ConversationCollectionPage conversations;

    /**
     * The Photos.
     * The profile photos owned by the group. Read-only. Nullable.
     */
    public ProfilePhotoCollectionPage photos;

    /**
     * The Accepted Senders.
     * The list of users or groups that are allowed to create post's or calendar events in this group. If this list is non-empty then only users or groups listed here are allowed to post.
     */
    public DirectoryObjectCollectionPage acceptedSenders;

    /**
     * The Rejected Senders.
     * The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
     */
    public DirectoryObjectCollectionPage rejectedSenders;

    /**
     * The Threads.
     * The group's conversation threads. Nullable.
     */
    public ConversationThreadCollectionPage threads;

    /**
     * The Calendar.
     * The group's calendar. Read-only.
     */
    @SerializedName("calendar")
    @Expose
    public Calendar calendar;

    /**
     * The Calendar View.
     * The calendar view for the calendar. Read-only.
     */
    public EventCollectionPage calendarView;

    /**
     * The Events.
     * The group's calendar events.
     */
    public EventCollectionPage events;

    /**
     * The Photo.
     * The group's profile photo
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;

    /**
     * The Drive.
     * The group's default drive. Read-only.
     */
    @SerializedName("drive")
    @Expose
    public Drive drive;

    /**
     * The Drives.
     * The group's drives. Read-only.
     */
    public DriveCollectionPage drives;

    /**
     * The Sites.
     * The list of SharePoint sites in this group. Access the default site with /sites/root.
     */
    public SiteCollectionPage sites;

    /**
     * The Extensions.
     * The collection of open extensions defined for the group. Read-only. Nullable.
     */
    public ExtensionCollectionPage extensions;

    /**
     * The Group Lifecycle Policies.
     * The collection of lifecycle policies for this group. Read-only. Nullable.
     */
    public GroupLifecyclePolicyCollectionPage groupLifecyclePolicies;

    /**
     * The Planner.
     * Entry-point to Planner resource that might exist for a Unified Group.
     */
    @SerializedName("planner")
    @Expose
    public PlannerGroup planner;

    /**
     * The Onenote.
     * Read-only.
     */
    @SerializedName("onenote")
    @Expose
    public Onenote onenote;

    /**
     * The Team.
     * 
     */
    @SerializedName("team")
    @Expose
    public Team team;


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

        if (json.has("members")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new DirectoryObjectCollectionPage(response, null);
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

        if (json.has("membersWithLicenseErrors")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("membersWithLicenseErrors@odata.nextLink")) {
                response.nextLink = json.get("membersWithLicenseErrors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("membersWithLicenseErrors").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            membersWithLicenseErrors = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("transitiveMembers")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("transitiveMembers@odata.nextLink")) {
                response.nextLink = json.get("transitiveMembers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("transitiveMembers").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            transitiveMembers = new DirectoryObjectCollectionPage(response, null);
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

        if (json.has("settings")) {
            final GroupSettingCollectionResponse response = new GroupSettingCollectionResponse();
            if (json.has("settings@odata.nextLink")) {
                response.nextLink = json.get("settings@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("settings").toString(), JsonObject[].class);
            final GroupSetting[] array = new GroupSetting[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupSetting.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            settings = new GroupSettingCollectionPage(response, null);
        }

        if (json.has("conversations")) {
            final ConversationCollectionResponse response = new ConversationCollectionResponse();
            if (json.has("conversations@odata.nextLink")) {
                response.nextLink = json.get("conversations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("conversations").toString(), JsonObject[].class);
            final Conversation[] array = new Conversation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Conversation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            conversations = new ConversationCollectionPage(response, null);
        }

        if (json.has("photos")) {
            final ProfilePhotoCollectionResponse response = new ProfilePhotoCollectionResponse();
            if (json.has("photos@odata.nextLink")) {
                response.nextLink = json.get("photos@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("photos").toString(), JsonObject[].class);
            final ProfilePhoto[] array = new ProfilePhoto[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ProfilePhoto.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            photos = new ProfilePhotoCollectionPage(response, null);
        }

        if (json.has("acceptedSenders")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("acceptedSenders@odata.nextLink")) {
                response.nextLink = json.get("acceptedSenders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("acceptedSenders").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            acceptedSenders = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("rejectedSenders")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("rejectedSenders@odata.nextLink")) {
                response.nextLink = json.get("rejectedSenders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("rejectedSenders").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            rejectedSenders = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("threads")) {
            final ConversationThreadCollectionResponse response = new ConversationThreadCollectionResponse();
            if (json.has("threads@odata.nextLink")) {
                response.nextLink = json.get("threads@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("threads").toString(), JsonObject[].class);
            final ConversationThread[] array = new ConversationThread[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConversationThread.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            threads = new ConversationThreadCollectionPage(response, null);
        }

        if (json.has("calendarView")) {
            final EventCollectionResponse response = new EventCollectionResponse();
            if (json.has("calendarView@odata.nextLink")) {
                response.nextLink = json.get("calendarView@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendarView").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendarView = new EventCollectionPage(response, null);
        }

        if (json.has("events")) {
            final EventCollectionResponse response = new EventCollectionResponse();
            if (json.has("events@odata.nextLink")) {
                response.nextLink = json.get("events@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("events").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            events = new EventCollectionPage(response, null);
        }

        if (json.has("drives")) {
            final DriveCollectionResponse response = new DriveCollectionResponse();
            if (json.has("drives@odata.nextLink")) {
                response.nextLink = json.get("drives@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("drives").toString(), JsonObject[].class);
            final Drive[] array = new Drive[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Drive.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            drives = new DriveCollectionPage(response, null);
        }

        if (json.has("sites")) {
            final SiteCollectionResponse response = new SiteCollectionResponse();
            if (json.has("sites@odata.nextLink")) {
                response.nextLink = json.get("sites@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sites").toString(), JsonObject[].class);
            final Site[] array = new Site[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Site.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sites = new SiteCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final ExtensionCollectionResponse response = new ExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("groupLifecyclePolicies")) {
            final GroupLifecyclePolicyCollectionResponse response = new GroupLifecyclePolicyCollectionResponse();
            if (json.has("groupLifecyclePolicies@odata.nextLink")) {
                response.nextLink = json.get("groupLifecyclePolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("groupLifecyclePolicies").toString(), JsonObject[].class);
            final GroupLifecyclePolicy[] array = new GroupLifecyclePolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GroupLifecyclePolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            groupLifecyclePolicies = new GroupLifecyclePolicyCollectionPage(response, null);
        }
    }
}
