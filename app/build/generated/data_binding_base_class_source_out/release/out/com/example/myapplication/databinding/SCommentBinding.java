// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SCommentBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final AppCompatTextView comment;

  @NonNull
  public final AppCompatTextView docName;

  @NonNull
  public final AppCompatTextView specialty;

  @NonNull
  public final AppCompatTextView uname;

  private SCommentBinding(@NonNull CardView rootView, @NonNull AppCompatTextView comment,
      @NonNull AppCompatTextView docName, @NonNull AppCompatTextView specialty,
      @NonNull AppCompatTextView uname) {
    this.rootView = rootView;
    this.comment = comment;
    this.docName = docName;
    this.specialty = specialty;
    this.uname = uname;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static SCommentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SCommentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.s_comment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SCommentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.comment;
      AppCompatTextView comment = ViewBindings.findChildViewById(rootView, id);
      if (comment == null) {
        break missingId;
      }

      id = R.id.docName;
      AppCompatTextView docName = ViewBindings.findChildViewById(rootView, id);
      if (docName == null) {
        break missingId;
      }

      id = R.id.specialty;
      AppCompatTextView specialty = ViewBindings.findChildViewById(rootView, id);
      if (specialty == null) {
        break missingId;
      }

      id = R.id.uname;
      AppCompatTextView uname = ViewBindings.findChildViewById(rootView, id);
      if (uname == null) {
        break missingId;
      }

      return new SCommentBinding((CardView) rootView, comment, docName, specialty, uname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}