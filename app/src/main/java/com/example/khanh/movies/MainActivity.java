package com.example.khanh.movies;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Flim> list;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        list.add(new Flim("CHỊ TRỢ LÝ CỦA ANH",
                "8.0",R.drawable.h2,
                "hgtxWxP5uBM",
                "113 phút",
                "Nội dung chính của “Chị trợ lý của anh” xoay quanh câu chuyện giữa một cô gái thông minh giỏi việc Khả Doanh (do Mỹ Tâm thủ vai) và chàng doanh nhân trẻ tuổi Phúc Nam (Mai Tài Phến). Vì muốn cứu doanh nghiệp sữa của gia đình thoát khỏi sự thâu tóm của một tập đoàn nước ngoài, cô đành tạm rời bỏ chức vụ phó tổng giám đốc trong công ty mình để trở thành trợ lý cho Phúc Nam - giám đốc một công ty cà phê cùng với nhiệm vụ phải tìm cho anh ta một cô bạn gái.",
                "Mira Dương",
                "Mỹ Tâm, Mai Tài Phến, Quỳnh Chi, Quốc Bảo, NSUT Hữu Châu,…",
                "Hài, Tình cảm","04/01/2019","Tiếng Việt",
                "C16 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI"));

        list.add(new Flim("CON NUÔI BẤT ĐẮC DĨ",
                "7.0", R.drawable.h20,
                "Dsa_kSJCXZ8",
                "123 phút",
                "Câu chuyện hài hước về cặp vợ chồng Pete và Ellie khi quyết định trở thành ba mẹ nuôi của 3 đứa trẻ với 3 độ tuổi và tính cách khác nhau: Cô gái tuổi teen Lizzy, cậu bé ngốc nghếch Juan và cô út luôn la hét Lita.",
                "Sean Anders",
                "Mark Wahlberg, John Morris, Stephen Levinson, Sean Anders",
                "Gia đình, Hài","11/01/2019",
                "Tiếng Anh với phụ đề tiếng Việt",
                "C13 - PHIM CẤM KHÁN GIẢ DƯỚI 13 TUỔI"));


        list.add(new Flim("CĂN PHÒNG TỬ THẦN",
                "7.6",R.drawable.h4,
                "La3g6VNgag4",
                "110 phút",
                "Sáu kẻ xa lạ tìm cách thoát khỏi một căn phòng khóa kín, nơi mà sự thất bại của người chơi sẽ được đánh đổi bằng mạng sống.",
                "Adam Robitel",
                "Taylor Russell, Logan Miller , Deborah Ann Woll , Jay Ellis ,...",
                "Hồi hộp, Kịch tính","04/01/2019",
                "Tiếng Anh với phụ đề tiếng Việt",
                "C16 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI"));

        list.add(new Flim("7 THI THỂ",
                "7.0",R.drawable.h5,
                "3dJC_6Kr7BA",
                "113 phút",
                "Dựa tên một sự kiện chấn động có thật từng xảy ra tại Busan, nơi những tội ác đã bị vùi lấp, thi thể nạn nhân không được tìm thấy và các cuộc điều tra không được diễn ra. Cảnh sát Hyung-min nhận được cuộc gọi thú tội của Kang Tae-oh - một tên sát nhân thông minh về tội ác sát hại 7 người. Các thanh tra cảnh sát dường như không tin vào tai mình khi tên tôi phạm điên loạn thú nhận nơi hắn đã phi tang các thi thể, khi mà không một vụ mất tích hay biên bản điều tra nào liên quan được khai báo. Chỉ có duy nhất Hyung-min quyết tâm lần theo những tội ác bị vùi lấp từ lâu và bền bỉ theo đuổi đến cùng các manh mối từ lời khai của tên tội phạm.",
                "Kim Tae-Gyun",
                "Joo Ji‑hoon, Kwon So‑hyeon,Kim Yoon-seok, Ko Chang‑seok",
                "Hồi hộp, Tâm Lý, Tội phạm","04/01/2019",
                "Tiếng Hàn với phụ đề tiếng Việt",
                "C18 - PHIM CẤM KHÁN GIẢ DƯỚI 18 TUỔI"));


        list.add(new Flim("VÕ LÂM QUÁI THÚ",
                "7.0",R.drawable.h6,
                "sSkKLIjHtYM",
                "107 phút",
                "Trong cuộc chiến truy tìm quái thú, Phong Tứ Hải (Cổ Thiên Lạc) chạm trán nhóm hảo hán chuyên cướp bạc của quan chia cho dân nghèo gồm Chân Kiếm (Trần Học Đông), Hùng Kiều Kiều (Châu Đông Vũ) và Lãnh Băng Băng (Quách Bích Đình). Thế nhưng, số bạc chưa bị cướp bỗng không cánh mà bay khiến triều đình phong tỏa khắp nơi để truy bắt. Nhóm nghĩa hiệp không hề hay biết rằng mình đang đối đầu với những thế lực vô cùng nguy hiểm.",
                "Nhĩ Đông Thăng",
                "Cổ Thiên Lạc, Quách Bính Đình","Hành Động, Thần thoại",
                "04/01/2019","Tiếng Trung với phụ đề tiếng Việt",
                "C16 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI"));

        list.add(new Flim("AQUAMAN: ĐẾ VƯƠNG ATLANTIS",
                "8.0",R.drawable.h1,
                "_ShCXYAUs9A",
                "145 phút",
                "Câu chuyện của Đế Vương Atlantis tiếp nối sau những sự kiện xảy ra trong Justice League – Liên Minh Công Lý. Theo đó, Arthur Curry/Aquaman bắt đầu trị vì vương quốc dưới biển sâu Atlantics, và đứng trong tình thế khó xử là những cư dân trên cạn luôn gây ô nhiễm môi trường toàn cầu trong khi người dân Atlantics luôn sẵn sàng để chiếm lấy đất liền. Bên cạnh đó, hải vương Aquaman còn phải đối mặt với những kẻ thù lăm le đe đọa nền hòa bình và yên ổn của vương quốc mình.",
                "James Wan",
                "Jason Momoa, Amber Heard, Patrick Wilson,…",
                "Hành Động","14/12/2018",
                "Tiếng Anh với phụ đề tiếng Việt",
                "C13 - PHIM CẤM KHÁN GIẢ DƯỚI 13 TUỔI"));

        list.add(new Flim("BUMBLEBEE",
                "8.0",R.drawable.h3,
                "8J_NXkbxejI",
                "118 phút",
                "Chuyện phim lấy bối cảnh vào năm 1987, khi chú “robot ong nghệ” Bumblebee đang tìm nơi ẩn náu tại một bãi rác ở thị trấn thuộc bờ biển ở California, Mỹ. Cô bạn Charlie, khi đó đang sắp sang 18 tuổi đã tình cờ phát hiện được Bumblebee trong tình trạng bị hư hại và vỡ thành nhiều mảnh sau khi đánh nhau và họ đã có một cuộc phiêu lưu thú vị sau đó.",
                "Travis Knight",
                "Hailee Steinfeld, John Cena, Jorge Lendeborg Jr., John Ortiz, Jason Drucker, Pamela Adlon",
                "Hành Động, Khoa Học Viễn Tưởng",
                "21/12/2018",
                "Tiếng Anh với phụ đề tiếng Việt",
                "C13 - PHIM CẤM KHÁN GIẢ DƯỚI 13 TUỔI"));

        list.add(new Flim("HỒN PAPA DA CON GÁI",
                "8.0",R.drawable.h8,
                "78zSq-jxI08",
                "117 phút",
                "Hồn Papa, Da Con Gái là phim điện ảnh thứ 2 của đạo diễn Ken Ochiai thực hiện tại Việt Nam. Bộ phim là câu chuyện tréo ngoe, bi hài của của hai cha con Hải (Thái Hoà) và Châu (Kaity Nguyễn). Mối quan hệ của hai người ngày càng xa cách từ khi người mẹ của Châu qua đời. Châu là một cô gái độc lập và tài năng luôn muốn khiến mẹ mình tự hào, trong khi Hải lại là ông bố mê chơi, hay dựa dẫm. Vì một trận cãi nhau mà linh hồn người mẹ đã chuyển đổi thân xác của người cha và con gái. Từ đó, họ mới cảm thấy thông cảm hơn cho đối phương khi người này sống trong cuộc đời của người kia.",
                "Ken Ochiai",
                "Thái Hòa, Kaity Nguyễn, Vân Trang, Chí Tài",
                "Hài, Tâm Lý",
                "28/12/2018",
                "Tiếng Việt với phụ đề Tiếng Anh",
                "C16 - PHIM CẤM KHÁN GIẢ DƯỚI 16 TUỔI"));

        list.add(new Flim("MARY POPPINS TRỞ LẠI",
                "7.5",R.drawable.h9,
                "G2bBpKHzrLc",
                "138 phút",
                "Trong bộ phim sắp ra mắt của hãng phim Disney, Mary Poppins Returns, một phần phim hoàn toàn mới kế thừa đúng tinh thần của tác phẩm gốc, Marry Popins quay trở về để giúp đỡ thế hệ sau của gia đình Banks tìm thấy niềm vui và điều kì diệu trong cuộc sống mà họ đang dần đánh mất. Emily Blunt hóa thân thành cô bảo mẫu gần như hoàn hảo với khả năng phép thuật đặc biệt. Cô có thể biến bất cứ công việc nào thành một chuyến phiêu lưu tuyệt vời khó quên. Bộ phim còn có sự góp mặt của Lin-Manuel Miranda thủ vai người bạn thân thiết của cô, Jack - một anh chàng làm nghề thắp đèn với lối sống tích cực, luôn luôn muốn đem ánh sáng đến khắp con phố ở London. bằng một cách thần kì nào đó đã quay trở lại cuộc sống của gia đình họ và cùng với sự giúp đỡ của Jack, cô đã mang niềm vui trở lại căn nhà của gia đình nhà Banks.",
                "Rob Marshall",
                "Emily Blunt, Lin-Manuel Miranda, Meryl Streep,…",
                "Bí ẩn, Gia đình",
                "28/12/2018",
                "Tiếng Anh với phụ đề tiếng Việt",
                "P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG"));

        list.add(new Flim("NỮ HOÀNG TUYẾT","7.8",R.drawable.h18,"hlmWibFovEw","81 phút","Gerda - một cô gái không có phép thuật như các thành viên khác trong gia đình của mình. Bi kịch xảy ra khi Vị vua Harald ra lệnh cấm sử dụng phép thuật trong vương quốc sau một sự cố gây ra bởi Nữ hoàng băng giá suýt cướp đi mạng sống của cả hoàng tộc. Ông ra lệnh trục xuất tất cả những cư dân sở hữu phép thuật, trong đó có cả cha mẹ của Gerda, tới Xứ sở trong gương. Lúc này, Gerda lại là người duy nhất có thể ngăn cản Harald và giữ được phép thuật nhiệm màu ở lại với vương quốc.","Robert Lence, Aleksey Tsitsilin","","Hoạt Hình, Phiêu Lưu","28/12/2018","Tiếng Anh với phụ đề và lồng tiếng Việt","P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG"));
        list.add(new Flim("NGƯỜI NHỆN","7.9",R.drawable.h19,"N9ALo1FG_a8","120 phút","Một vũ trụ hoàn toàn mới về thế giới Nhện.","Peter Ramsey, Robert Persichetti Jr., Rodney Rothman","Avi Arad, Amy Pascal, Phil Lord, Christopher Miller, Christina Steinberg","Hành Động, Hoạt Hình, Phiêu Lưu","14/12/2018","Tiếng Anh với phụ đề tiếng Việt"," P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG"));
        list.add(new Flim("GĂNG TƠ TÁI XUẤT ","8.2",R.drawable.h10,"dAOWOZZUYSk","115 phút","Từng là một găng tơ chính hiệu với nhưng hiện tại Dong-chul (Ma Dong-seok) đã rửa tay gác kiếm và sống một cuộc đời yên bình bên người vợ hiền Ji-soo (Song Ji-hyo). Mọi chuyện đột nhiên đảo lộn khi một ngày, Dong-chul nhận được điện thoại từ một kẻ nặc danh tự nhận mình là người đã bắt cóc Ji-soo. Dong-chul bắt buộc phải ra tay tìm kiếm manh mối để cứu được vợ mình bằng bất cứ giá nào. “Không thể lương thiện, hắn ta phải trở lại.” – câu đề từ hứa hẹn một màn “tái xuất giang hồ” gây rúng động của “quái vật” khét tiếng năm xưa.","Kim Min-ho","Ma Dong-seok, Song Ji-hyo, Kim Sung-oh,…","Hành Động, Tội phạm","28/12/2018","Tiếng Hàn với phụ đề tiếng Việt","C18 - PHIM CẤM KHÁN GIẢ DƯỚI 18 TUỔI"));
        list.add(new Flim("BỨC ẢNH QUỶ ÁM ","7.5",R.drawable.h11,"plp9xQ7n1Pg","83 phút","Nhân vật chính tham gia một trò thực tế và giành chiến thắng tại một căn nhà bỏ hoang. Cũng như bao người trẻ khác, cô gái quyết định chụp lại một tấm ảnh để giữ làm kỉ niệm mà không hề hay biết đến sự xuất hiện của một hồn ma đầy giận dữ. Sợ hãi trước sự đeo bám hung ác của quỷ dữ, cô đã đem bức ảnh đi khắp nơi mà không hề biết rằng mình đang gieo rắc một lời nguyền kinh hoàng.","Manasanan Pongsuwan","Ploy Sornarin, Natthasit Kotimanaswanich","Kinh Dị","28/12/2018","Tiếng Thái với phụ đề tiếng Việt","C18 - PHIM CẤM KHÁN GIẢ DƯỚI 18 TUỔI"));
        list.add(new Flim(" BỖNG DƯNG LÀM SẾP ","7.0",R.drawable.h12,"0LsSn3BJptU","105 phút","Bị kẹt trong một công việc mức lương thấp với CV trống rỗng, một người phụ nữ có cơ hội đạt được tham vọng nghề nghiệp của mình khi một công ty tài chính tin rằng cô ấy là nhà kinh doanh đa tài và thuê cô xử lý một thoả thuận kinh doanh lớn. Đến cuối cùng cô sẽ bị phát hiện và mất việc hay càng thành công hơn?","Peter Segal","Jennifer Lopez, Vanessa Hudgen,…","Hài, Tâm Lý","28/12/2018","Tiếng Anh với phụ đề tiếng Việt","C13 - PHIM CẤM KHÁN GIẢ DƯỚI 13 TUỔI"));
        list.add(new Flim("ĐẦU GẤU BẮC CỰC","7.5",R.drawable.h13,"LDaDGq6jkeg","95 phút","Với sự giúp đỡ của cô bạn Olympia, Norm cuối cùng cũng trở về được Bắc cực. Song, anh chàng lại phát hiện ra âm mưu lấy cắp băng của loài người. Vị vua ngay lập tức bảo vệ quê nhà bằng cách thách đấu một trận khúc côn cầu với con người. Dù đã cố gắng hết sức nhưng những thành viên của “đội thú” đều biến thành thảm họa với vô số tình huống hài hước. Liệu phép màu nào có thể giúp Norm cứu được Bắc cực đây?","Tim Maltby","Andy Toth, Jennifer Cameron, Maya Kay, Cole Howard","Hài, Hoạt Hình, Phiêu Lưu","28/12/2018","Tiếng Anh với phụ đề tiếng Việt","P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG"));
        list.add(new Flim("BÍ KÍP LUYỆN RỒNG (2010)","8.0",R.drawable.h14,"1huZhKwhIQc","100 phút","Bộ phim lấy bối cảnh là một thế giới thần thoại của người Viking và loài rồng. Câu chuyện xoay quanh cậu bé Hiccup, sống tại đảo Berk. Khi Hiccup được tham gia vào khóa huấn luyện rồng với những cậu bé cùng trang lứa, cậu coi đây là cơ hội để chứng minh rằng mình đã trưởng thành và là một chiến binh thật sự. Cậu đã giải thoát và kết bạn với một chú rồng và đặt chú tên Toothless. Mối quan hệ này đã thay đổi hoàn toàn cuộc sống của cậu khi cậu đấu tranh để thuyết phục cả bộ tộc mình rằng việc giết rồng là không cần thiết.","Dean DeBlois, Chris Sanders","Jay Baruchel, Gerard Butler, Christopher Mintz-Plasse","Hoạt Hình, Phiêu Lưu","04/01/2019","Tiếng Anh với phụ đề tiếng Việt","P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG"));
        list.add(new Flim("KHÔNG GIA ĐÌNH","7.3",R.drawable.h17,"rkLqxlXUGA8","110 phút","Không Gia Đình - tác phẩm gắn bó với tuổi thơ của biết bao thế hệ, sẽ chính thức đến với khán giả Việt Nam qua trên màn ảnh rộng vào tháng 12","Antoine Blossier","Daniel Auteuil, Maleaume Paquin, Virginie Ledoyen,…","Gia đình, Phiêu Lưu","21/12/2018","Tiếng Pháp với phụ đề và lồng tiếng Việt","P - PHIM DÀNH CHO MỌI ĐỐI TƯỢNG"));


        recyclerView = findViewById(R.id.listPhimDangChieu);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        Adapter_Item_Flim PhimAdapter = new Adapter_Item_Flim(this,list);
        recyclerView.setAdapter(PhimAdapter);

        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        Menu menu = navigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.ListPhim:
                            break;
                        case R.id.ListUuDai:
                            Intent intent2 = new Intent(MainActivity.this,UuDaiActivity.class);
                            startActivity(intent2);
                            finish();
                            break;
                        case R.id.ListRap:
                            Intent intent1 = new Intent(MainActivity.this,MapsActivity.class);
                            startActivity(intent1);
                            finish();
                            break;
                    }
                    return false;
                }
            };
}
