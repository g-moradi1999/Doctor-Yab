// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import de.hdodenhof.circleimageview.CircleImageView;
import devs.mulham.horizontalcalendar.HorizontalCalendarView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDatePickerBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ScrollView ScrollView01;

  @NonNull
  public final CircleImageView addcomment;

  @NonNull
  public final AppCompatTextView address;

  @NonNull
  public final HorizontalCalendarView calendarView;

  @NonNull
  public final CircleImageView calender;

  @NonNull
  public final AppCompatTextView city;

  @NonNull
  public final CircleImageView clock;

  @NonNull
  public final AppCompatButton comment;

  @NonNull
  public final AppCompatTextView day;

  @NonNull
  public final CircleImageView doctorProfile;

  @NonNull
  public final AppCompatButton sabt;

  @NonNull
  public final AppCompatTextView specialtyDoctors;

  @NonNull
  public final AppCompatButton time;

  @NonNull
  public final AppCompatTextView timeE;

  @NonNull
  public final AppCompatTextView timeS;

  @NonNull
  public final AppCompatTextView txtReserve;

  @NonNull
  public final AppCompatImageButton upload;

  @NonNull
  public final AppCompatTextView username;

  private ActivityDatePickerBinding(@NonNull ScrollView rootView, @NonNull ScrollView ScrollView01,
      @NonNull CircleImageView addcomment, @NonNull AppCompatTextView address,
      @NonNull HorizontalCalendarView calendarView, @NonNull CircleImageView calender,
      @NonNull AppCompatTextView city, @NonNull CircleImageView clock,
      @NonNull AppCompatButton comment, @NonNull AppCompatTextView day,
      @NonNull CircleImageView doctorProfile, @NonNull AppCompatButton sabt,
      @NonNull AppCompatTextView specialtyDoctors, @NonNull AppCompatButton time,
      @NonNull AppCompatTextView timeE, @NonNull AppCompatTextView timeS,
      @NonNull AppCompatTextView txtReserve, @NonNull AppCompatImageButton upload,
      @NonNull AppCompatTextView username) {
    this.rootView = rootView;
    this.ScrollView01 = ScrollView01;
    this.addcomment = addcomment;
    this.address = address;
    this.calendarView = calendarView;
    this.calender = calender;
    this.city = city;
    this.clock = clock;
    this.comment = comment;
    this.day = day;
    this.doctorProfile = doctorProfile;
    this.sabt = sabt;
    this.specialtyDoctors = specialtyDoctors;
    this.time = time;
    this.timeE = timeE;
    this.timeS = timeS;
    this.txtReserve = txtReserve;
    this.upload = upload;
    this.username = username;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDatePickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDatePickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_date_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDatePickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ScrollView ScrollView01 = (ScrollView) rootView;

      id = R.id.addcomment;
      CircleImageView addcomment = ViewBindings.findChildViewById(rootView, id);
      if (addcomment == null) {
        break missingId;
      }

      id = R.id.address;
      AppCompatTextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.calendarView;
      HorizontalCalendarView calendarView = ViewBindings.findChildViewById(rootView, id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.calender;
      CircleImageView calender = ViewBindings.findChildViewById(rootView, id);
      if (calender == null) {
        break missingId;
      }

      id = R.id.city;
      AppCompatTextView city = ViewBindings.findChildViewById(rootView, id);
      if (city == null) {
        break missingId;
      }

      id = R.id.clock;
      CircleImageView clock = ViewBindings.findChildViewById(rootView, id);
      if (clock == null) {
        break missingId;
      }

      id = R.id.comment;
      AppCompatButton comment = ViewBindings.findChildViewById(rootView, id);
      if (comment == null) {
        break missingId;
      }

      id = R.id.day;
      AppCompatTextView day = ViewBindings.findChildViewById(rootView, id);
      if (day == null) {
        break missingId;
      }

      id = R.id.doctorProfile;
      CircleImageView doctorProfile = ViewBindings.findChildViewById(rootView, id);
      if (doctorProfile == null) {
        break missingId;
      }

      id = R.id.sabt;
      AppCompatButton sabt = ViewBindings.findChildViewById(rootView, id);
      if (sabt == null) {
        break missingId;
      }

      id = R.id.specialty_doctors;
      AppCompatTextView specialtyDoctors = ViewBindings.findChildViewById(rootView, id);
      if (specialtyDoctors == null) {
        break missingId;
      }

      id = R.id.time;
      AppCompatButton time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      id = R.id.timeE;
      AppCompatTextView timeE = ViewBindings.findChildViewById(rootView, id);
      if (timeE == null) {
        break missingId;
      }

      id = R.id.timeS;
      AppCompatTextView timeS = ViewBindings.findChildViewById(rootView, id);
      if (timeS == null) {
        break missingId;
      }

      id = R.id.txtReserve;
      AppCompatTextView txtReserve = ViewBindings.findChildViewById(rootView, id);
      if (txtReserve == null) {
        break missingId;
      }

      id = R.id.upload;
      AppCompatImageButton upload = ViewBindings.findChildViewById(rootView, id);
      if (upload == null) {
        break missingId;
      }

      id = R.id.username;
      AppCompatTextView username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new ActivityDatePickerBinding((ScrollView) rootView, ScrollView01, addcomment, address,
          calendarView, calender, city, clock, comment, day, doctorProfile, sabt, specialtyDoctors,
          time, timeE, timeS, txtReserve, upload, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
