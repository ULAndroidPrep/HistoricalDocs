package edu.rosehulman.fisherds.historicaldocs.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.rosehulman.fisherds.historicaldocs.Doc;
import edu.rosehulman.fisherds.historicaldocs.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DocDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DocDetailFragment extends Fragment {
  private static final String ARG_DOC = "arg_doc";
  private Doc mDoc;

  public DocDetailFragment() {
    // Required empty public constructor
  }

  public static DocDetailFragment newInstance(Doc doc) {
    DocDetailFragment fragment = new DocDetailFragment();
    Bundle args = new Bundle();
    args.putParcelable(ARG_DOC, doc);
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {
      mDoc = getArguments().getParcelable(ARG_DOC);
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_doc_detail, container, false);
    TextView titleTextView = view.findViewById(R.id.fragment_doc_detail_title);
    TextView bodyTextView = view.findViewById(R.id.fragment_doc_detail_body);

    titleTextView.setText(mDoc.getTitle());
    bodyTextView.setText(mDoc.getText());
    return view;
  }

}
