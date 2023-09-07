package com.example.project.ui.assets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.project.databinding.FragmentAssetsBinding

class AssetsFragment : Fragment() {

private var _binding: FragmentAssetsBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val assetsViewModel =
        ViewModelProvider(this)[AssetsViewModel::class.java]

    _binding = FragmentAssetsBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: TextView = binding.textAssets
    assetsViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}